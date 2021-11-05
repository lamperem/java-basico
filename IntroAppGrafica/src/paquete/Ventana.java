package paquete;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ventana {
	
	private JFrame frame;
	private JPanel panel;
	private JButton b1;
	private JLabel lb1;
	
	public Ventana()
	{
		
		//Ask for window decorations provided by the look and feel.
		//JFrame.setDefaultLookAndFeelDecorated(true);
				
		//1. Create the frame.
		frame = new JFrame("FrameDemo");
		frame.setPreferredSize(new Dimension(175,175));
		frame.setLocationRelativeTo(null);

		//2. Optional: What happens when the frame closes?
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//3. Create components and put them in the frame.
		panel = new JPanel();		
		b1 = new JButton("Press Me!");
		lb1 = new JLabel();
		lb1.setText("Test GUI");
		
		panel.add(lb1);
		panel.add(b1);
		
		
		//frame.getComponent(panel);
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		
	
		
		//4. Size the frame.
		frame.pack();
		//5. Show it.
		frame.setVisible(true);		
	}

}
