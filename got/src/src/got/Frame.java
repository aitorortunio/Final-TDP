package got;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import javax.swing.JButton;
import javax.swing.JTextField;

public class Frame extends JFrame implements ActionListener{
	private Properties properties;
	FileInputStream fisEnglish = new FileInputStream("english.properties");
	FileInputStream fisSpanish = new FileInputStream("spanish.properties");
	private JTextField directory;
	private JButton spanishButton,englishButton,startButton;
	private JLabel languageLabel,directoryLabel,topLabel,wordsLabel,timesLabel,
	word1,word2,word3,word4,word5,times1,times2,times3,times4,times5,
	percentage1,percentage2,percentage3,percentage4,percentage5,
	totalText,totalNumber;
	private App app;


	
	public Frame() throws IOException {
		getContentPane().setLayout(null);
		getContentPane().setVisible(true);
		setResizable(false);
		setVisible(true);
		setTitle("Winter is Coming");
		setBounds(450, 250, 600, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		properties = new Properties();
		properties.load(fisEnglish);
				
		app = new App();
		loadInitialComponents(properties);
		loadComponentsOnLanguages(properties);		
	}

	private void loadInitialComponents(Properties p) {
		directory = new JTextField();
		directory.setBounds(237, 33, 336, 32);
		getContentPane().add(directory);
		directory.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("1");
		lblNewLabel_3.setBounds(21, 159, 33, 26);
		getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("2");
		lblNewLabel_4.setBounds(21, 200, 33, 26);
		getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("3");
		lblNewLabel_5.setBounds(21, 241, 33, 26);
		getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("4");
		lblNewLabel_6.setBounds(21, 288, 33, 26);
		getContentPane().add(lblNewLabel_6);
		
		JLabel label = new JLabel("5");
		label.setBounds(21, 335, 33, 26);
		getContentPane().add(label);
		
		languageLabel = new JLabel(p.getProperty("select"));
		languageLabel.setHorizontalAlignment(SwingConstants.CENTER);
		languageLabel.setBounds(0, 0, 169, 26);
		getContentPane().add(languageLabel);
		
		spanishButton = new JButton(p.getProperty("spanish"));
		spanishButton.setBounds(237, 0, 132, 26);
		getContentPane().add(spanishButton);
		spanishButton.addActionListener(this);
		
		englishButton = new JButton(p.getProperty("english"));
		englishButton.setBounds(441, 0, 132, 26);
		getContentPane().add(englishButton);
		englishButton.addActionListener(this);
		
		startButton = new JButton(p.getProperty("start"));
		startButton.setBounds(10, 393, 320, 35);
		getContentPane().add(startButton);	
		startButton.addActionListener(this);
		
		directoryLabel = new JLabel(p.getProperty("directory"));
		directoryLabel.setBounds(21, 36, 92, 26);
		getContentPane().add(directoryLabel);
		
		topLabel = new JLabel(p.getProperty("top"));
		topLabel.setHorizontalAlignment(SwingConstants.CENTER);
		topLabel.setBounds(0, 69, 594, 26);
		getContentPane().add(topLabel);
		
		word1 = new JLabel("");
		word1.setBounds(90, 159, 92, 26);
		getContentPane().add(word1);
		
		word2 = new JLabel("");
		word2.setBounds(90, 200, 92, 26);
		getContentPane().add(word2);
		
		word3 = new JLabel("");
		word3.setBounds(90, 241, 92, 26);
		getContentPane().add(word3);
		
		word4 = new JLabel("");
		word4.setBounds(90, 288, 92, 26);
		getContentPane().add(word4);
		
		word5 = new JLabel("");
		word5.setBounds(90, 335, 92, 26);
		getContentPane().add(word5);
		
		times1 = new JLabel("");
		times1.setBounds(366, 159, 92, 26);
		getContentPane().add(times1);
		
		times2 = new JLabel("");
		times2.setBounds(366, 200, 92, 26);
		getContentPane().add(times2);
		
		times3 = new JLabel("");
		times3.setBounds(366, 241, 92, 26);
		getContentPane().add(times3);
		
		times4 = new JLabel("");
		times4.setBounds(366, 288, 92, 26);
		getContentPane().add(times4);
		
		times5 = new JLabel("");
		times5.setBounds(366, 335, 92, 26);
		getContentPane().add(times5);
		
		wordsLabel = new JLabel(p.getProperty("words"));
		wordsLabel.setBounds(90, 116, 132, 26);
		getContentPane().add(wordsLabel);
		
		timesLabel = new JLabel(p.getProperty("times"));
		timesLabel.setBounds(366, 116, 138, 26);
		getContentPane().add(timesLabel);
		
		JLabel percentage = new JLabel("%");
		percentage.setBounds(502, 116, 92, 26);
		getContentPane().add(percentage);
		
		percentage1 = new JLabel("");
		percentage1.setBounds(502, 159, 92, 26);
		getContentPane().add(percentage1);
		
		percentage2 = new JLabel("");
		percentage2.setBounds(502, 200, 92, 26);
		getContentPane().add(percentage2);
		
		percentage3 = new JLabel("");
		percentage3.setBounds(502, 241, 92, 26);
		getContentPane().add(percentage3);
		
		percentage4 = new JLabel("");
		percentage4.setBounds(502, 288, 92, 26);
		getContentPane().add(percentage4);
		
		percentage5 = new JLabel("");
		percentage5.setBounds(502, 335, 92, 26);
		getContentPane().add(percentage5);
		
		totalText = new JLabel("");
		totalText.setBounds(351, 393, 92, 26);
		getContentPane().add(totalText);
		
		totalNumber = new JLabel("");
		totalNumber.setBounds(481, 393, 92, 26);
		getContentPane().add(totalNumber);
	}

	private void loadComponentsOnLanguages(Properties p) throws FileNotFoundException {
		
		languageLabel.setText(p.getProperty("language"));
		spanishButton.setText(p.getProperty("spanish"));
		englishButton.setText(p.getProperty("english"));
		topLabel.setText(p.getProperty("top"));
		startButton.setText(p.getProperty("start"));
		directoryLabel.setText(p.getProperty("directory"));	
		wordsLabel.setText(p.getProperty("words"));
		timesLabel.setText(p.getProperty("times"));

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			if(e.getSource()==spanishButton) {
				fisSpanish = new FileInputStream("spanish.properties");
				properties.load(fisSpanish);
				loadComponentsOnLanguages(properties);
			}
		
		else {
			if(e.getSource()==englishButton) {
				fisEnglish = new FileInputStream("english.properties");
				properties.load(fisEnglish);
				loadComponentsOnLanguages(properties);
			}
			else {
				if(e.getSource()==startButton) {
					
					app.listFiles(directory.getText());
					
					showStats();
					startButton.setEnabled(false);
				}
			}
		}
		}catch(IOException exception) {
		}
	}
	
	private void showStats() {

		Entry<String,Integer>[] words = app.get5WordsWithMoreAppeareances();
		double amountOfWords = app.totalWords();
		double percentage;
		
		word1.setText(words[0].getKey()); times1.setText(words[0].getValue().toString());
		percentage = (words[0].getValue()*100)/amountOfWords;
		percentage1.setText(String.format("%.2f",percentage));
		
		word2.setText(words[1].getKey()); times2.setText(words[1].getValue().toString());
		percentage = (words[1].getValue()*100)/amountOfWords;
		percentage2.setText(String.format("%.2f",percentage));
		
		word3.setText(words[2].getKey()); times3.setText(words[2].getValue().toString());
		percentage = (words[2].getValue()*100)/amountOfWords;
		percentage3.setText(String.format("%.2f",percentage));
		
		word4.setText(words[3].getKey()); times4.setText(words[3].getValue().toString());
		percentage = (words[3].getValue()*100)/amountOfWords;
		percentage4.setText(String.format("%.2f",percentage));
		
		word5.setText(words[4].getKey()); times5.setText(words[4].getValue().toString());
		percentage = (words[4].getValue()*100)/amountOfWords;
		percentage5.setText(String.format("%.2f",percentage));
		
		totalText.setText("Total:");
		int totalAmountOfWords = (int) amountOfWords;
		totalNumber.setText(""+totalAmountOfWords);
	}
}
