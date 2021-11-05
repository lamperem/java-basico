package paquete;
import java.io.*;

class Main {

	/**
	 * @param args
	 * leeer desde el teclado
	 * concat()
	 * toUpperCase()
	 * toLowerCase()
	 * lenght()
	 * Conversion numeros a string y viceversa
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String texto = "";
		int x=0;
		
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader buffer = new BufferedReader(in);
		
		try{
			texto = buffer.readLine();
			x = Integer.parseInt(texto);
			//x = Double.parseDouble(text);
		}catch(Exception e){
			System.out.println("Debes escribir un numero");
		}
		
		//texto = texto.concat("-esto es una concatenacion");
		//texto = texto.toLowerCase();
		//texto = texto.toUpperCase();
		//int size = texto.length();
		
		//System.out.println(texto);
		//System.out.println(size);
		//System.out.println(x + 10);
		
		double y=50.3;
		texto = String.valueOf(y);
		texto = texto.concat("-Double");
		System.out.println(texto);
		
	}

}
