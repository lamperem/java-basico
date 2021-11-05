package paquete;

class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x[];
		
		x = new int[10];
		
		int y[] = {10,5,7,8,15};
		
		for(int i=0;i<x.length;i++)
		{
			x[i] = i+1;
		}
		
		for(int i=0; i<x.length;i++)
		{
			System.out.println("El numero en el indice [" + i + "] es: " + x[i]);
		}
	}

}
