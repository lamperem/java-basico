package paquete;

class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Algoritmos ciclicos
		// Serie de fibonacci
		
		int x = 1;
		int anterior = 0;
		int temp;
		
		while (true)
		{
			System.out.println(x);
			
			temp = x;
			x = x + anterior;
			anterior = temp;
			
			if (x > 30)
			{
				break;
			}
		}
		
		
		// Serie de numeros impares		
		/*for(int i=0; i<=100;i++)
		{
			if( (i%2) != 0 ){
				System.out.println("Numero impar: " + i);
			}
		}*/

	}

}
