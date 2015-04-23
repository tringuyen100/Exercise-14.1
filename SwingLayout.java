import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


	public class SwingLayout  {
		private JTextField [] textField = new JTextField[4];
		private JFrame frame;
		private JPanel panel;
		public SwingLayout(){
			frame = new JFrame("Swing Boarder Layout");
			panel = new JPanel();
			panel.setBackground(Color.BLACK);
			textField[0] = new JTextField(5);
			textField[1] = new JTextField(5);
			textField[2] = new JTextField(5);
			textField[3] = new JTextField(5);
			panel.setLayout(new BorderLayout());
			panel.add(textField[0], BorderLayout.PAGE_START);//up
			panel.add(textField[1], BorderLayout.CENTER);//center
			//add(textField3, BorderLayout.PAGE_END);//down
			panel.add(textField[2], BorderLayout.LINE_END);//right
			panel.add(textField[3], BorderLayout.LINE_START);//left
			
			
			frame.add(panel);

			frame.setSize(500,500);
			frame.setVisible(true);
	}

}