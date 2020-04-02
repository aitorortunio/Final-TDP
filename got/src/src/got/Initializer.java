package got;

import java.awt.EventQueue;

public class Initializer {

	Frame frame;
	
	public static void main(String [] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame frame = new Frame();
					
				} catch (Exception e) {
				}
			}

		});
		
	}
}