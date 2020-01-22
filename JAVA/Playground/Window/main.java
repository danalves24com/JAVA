import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main {

	private JFrame frame;
	private JPanel panel;
	private JPanel Bpanel;
	private JButton btn;
	private JButton btn1;
	private JLabel l;
	
	public Main() {
	  gui();
	}
	
	
	
	//window UI
	public void gui() {
		//window
		frame = new JFrame("Test Window");
		frame.setVisible(true);
		frame.setSize(500,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//panel	
		panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		//buttons
		btn = new JButton("MENU");
		btn1 = new JButton("ABOUT");
		//label		
		//add button and label
		panel.add(btn);
		panel.add(btn1);		
		// add panel that was decorated
		frame.add(panel,BorderLayout.NORTH);	
		//bottom panel
		l = new JLabel("Some information on the bottom of the window. The size and color is changable");
		Bpanel = new JPanel();		Bpanel.setBackground(Color.WHITE);
		Bpanel.add(l);
		frame.add(Bpanel,BorderLayout.SOUTH);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		new Main(); //run UI
		
	}

}
 