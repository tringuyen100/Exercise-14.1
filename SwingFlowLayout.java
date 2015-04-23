import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.lang.reflect.Array;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class SwingFlowLayout extends JFrame{
	private JTextField [] textField = new JTextField[4];
	private JFrame frame;
	private JPanel panel;
	public SwingFlowLayout(){
		frame = new JFrame("Swing Flow");
		panel = new JPanel();
		panel.setBackground(Color.BLACK);
		textField[0] = new JTextField(5);
		textField[1] = new JTextField(5);
		textField[2] = new JTextField(5);
		textField[3] = new JTextField(5);
		setLayout(new FlowLayout());
		
		frame.setVisible(true);
		frame.setSize(500,100);
		panel.add(textField[0]);
		panel.add(textField[1]);
		panel.add(textField[2]);
		panel.add(textField[3]);
		frame.add(panel);
		
		
	}

}
