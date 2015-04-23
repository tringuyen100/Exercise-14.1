import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class SwingGridLayout {
	private JTextField textField1,textField2,textField3,textField4;
	private JFrame frame;
	private JPanel panel2;
	public SwingGridLayout(){
		frame = new JFrame("Swing Grid");
		panel2 = new JPanel();
		panel2.setBackground(Color.BLACK);
		textField1 = new JTextField(5);
		textField2 = new JTextField(5);
		textField3 = new JTextField(5);
		textField4 = new JTextField(5);
		panel2.setLayout(new GridLayout(2,2));
		
		panel2.add(textField1);
		panel2.add(textField2);
		panel2.add(textField3);
		panel2.add(textField4);
		frame.setVisible(true);
		frame.setSize(500,500);
		frame.add(panel2);

}
}