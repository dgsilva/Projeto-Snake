package principal;

import javax.swing.JFrame;

public class MainPrincipal {

	public MainPrincipal(){
		JFrame frame = new JFrame();
		
		Gamepanel gamepanel = new Gamepanel();
		
		frame.add(gamepanel);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Joguinho Snake");
		
		frame.pack();
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		
	}
	
	public static void main(String[] args) {
		new MainPrincipal(); 
	}
	
}
