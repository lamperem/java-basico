package paquete;

import java.io.*;

public class Textos {
	
	public void leer(String nombreArchivo)
	{
		try{
			
			FileReader r = new FileReader(nombreArchivo);
			BufferedReader buffer = new BufferedReader(r);
			
			String temp = "";
			
			while (temp!=null){
				temp = buffer.readLine();
				if(temp==null){
					break;
				}
				
				System.out.println(temp);
			};
			
			//System.out.println(buffer.readLine());
			
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}

}
