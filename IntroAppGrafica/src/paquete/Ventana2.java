package paquete;

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;


public class Ventana2 extends JFrame {
	
	private JPanel panel1;
	private JPanel panel2;
	private JButton b1,b2,b3,b4,b5,b6;
	
	public Ventana2()
	{
		this.setLayout(new BorderLayout());
		
		panel1= new JPanel();
		panel2= new JPanel();
		
		panel2.setLayout(new GridLayout(3,3,5,10));//Fila, columna, espacio fil, espacio col
		
		b1 = new JButton("Prueba");
		b2 = new JButton("Prueba");
		b3 = new JButton("Prueba");
		b4 = new JButton("Prueba");
		b5 = new JButton("Prueba");
		b6 = new JButton("Prueba");
		
		panel1.add(b1);
		panel1.add(b2);
		panel2.add(b3);
		panel2.add(b4);
		panel2.add(b5);
		panel2.add(b6);
		
		this.add(panel1,BorderLayout.NORTH);
		this.add(panel2,BorderLayout.SOUTH);
	}

}
