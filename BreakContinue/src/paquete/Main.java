package paquete;

class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<=10;i++)
		{
			
			System.out.println("Aun estas en el ciclo");
			
			if (i == 4)
			{
				//break; // salir de un ciclo
				continue; // corta ciclo o serie de instrucciones despues del continue
			}			
			
			//continue;
			System.out.println("El valor de i es: " + i);
		}
		
		System.out.println("Has dejado el ciclo for");
	}

}
