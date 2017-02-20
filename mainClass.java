import javax.swing.JFrame;


public class mainClass {
	
	public static void main(String[] args) {
		
		JFrame myFrame = new JFrame ("Welcome to week 4 tutorials");
		
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Panel panel1 = new Panel();
		
		myFrame.setContentPane(panel1);
		
		
		//myFrame.pack();
		
		myFrame.setVisible(true);
		myFrame.setSize(200,200);
		
	}

}
