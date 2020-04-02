package got;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class App {	
	private List<File> files;
	private List<String> words;
	private Map<String,Integer> map;
	private Entry<String,Integer>[] finalResult;
	
	public App() {
		files = new LinkedList<File>();
		words = new LinkedList<String>();
		map = new HashMap<String,Integer>();
	}
	
	public void listFiles(String myDirectory) throws FileNotFoundException{
		File directory = new File(myDirectory);
		
		for(File file: directory.listFiles()) {
			if((file.getName().endsWith(".txt"))) {
				files.add(file);
			}
		}
		
		for(File file: files) {
			listWordsFromFile(file);
		}
		
		countApparitions();
		
		finalResult = obtain5WordsWithMostAppearances();
			
	}
	
	public int totalWords() {
		return words.size();
	}
	
	public Entry<String,Integer>[] get5WordsWithMoreAppeareances(){
		return finalResult;
	}
	
	
	private Entry<String, Integer>[] obtain5WordsWithMostAppearances() {
		Entry<String,Integer>[] aux = (Entry<String,Integer>[]) new Entry[5];
		for(int i=0;i<5;i++) {
			
			int max = 0;	
			String mostFrecuentUpToNow ="";
			
			for(String word: map.keySet()) {
				if(map.get(word)>max) {
					max = map.get(word);
					mostFrecuentUpToNow = word;
				}
			}
			aux[i] = new Entrada<String,Integer>(mostFrecuentUpToNow, max);
			map.remove(mostFrecuentUpToNow);
		}
		return aux;
	}

	private void listWordsFromFile(File fileName) throws FileNotFoundException {
		Scanner scanner = new Scanner(fileName);
				
		//placing words on list (lower case and without).
		while(scanner.hasNextLine()) {
			
			words.add(scanner.next().toLowerCase());
		}	
		
		removeSimbols();
	}
	
	
	
	private void removeSimbols() {
		List<String> newWords = new LinkedList<String>();
		for(String word:words) {
			System.out.println("flag");
			String newWord = "";
			for(int i=0;i<word.length();i++) {
				int ascii = word.charAt(i);
				if(validAscii(i)) {
					newWord += word.charAt(i);
					System.out.println(newWord);
				}
			}
			newWords.add(newWord);
		}
	}
	
	private boolean validAscii(int asciiCode) {
		if((asciiCode>=97 && asciiCode<=122) || (asciiCode>=65 && asciiCode<=90)
			||asciiCode==225 ||asciiCode==233 ||asciiCode==237 ||asciiCode==243 ||asciiCode==250
			||asciiCode==193 ||asciiCode==201 ||asciiCode==205 ||asciiCode==211 ||asciiCode==218
			||asciiCode==220 ||asciiCode==209) {
			return true;
		}
		return false;
	
	}

	private void countApparitions() {
		for(String word: words){
			if(map.containsKey(word)) {
				map.put(word, map.get(word)+1);
			}else {
				map.put(word, 1);
			}
		}
	}

	public Entry<String,Integer>[] getFinalResult() {
		return finalResult;
	}
	
	
}
