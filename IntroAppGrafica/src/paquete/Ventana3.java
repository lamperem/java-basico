package paquete;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana3 extends JFrame implements ActionListener {
	
	private JPanel panel;
	private JButton boton,boton2;
	private JLabel texto;
	private JTextField input;
	
	public Ventana3()
	{
		
		
		panel = new JPanel();		
		
		boton = new JButton("Oprimir");
		boton2 = new JButton("Oprimir");
		texto = new JLabel("");
		input = new JTextField("Escribe aqui");
		
		panel.add(input);
		panel.add(boton);
		panel.add(boton2);
		panel.add(texto);		
		
		boton.addActionListener(this);
		boton2.addActionListener(this);
		
		this.add(panel);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource().equals(boton))
		{
			this.texto.setText(this.input.getText());
		}
		
		if(e.getSource().equals(boton2))
		{
			this.texto.setText("Boton 2");
		}		
		
		
	}
}
