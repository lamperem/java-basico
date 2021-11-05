package paquete;

class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x[][] = new int[3][3];
		
		for (int i = 0; i<3;i++)
		{
			for (int j=0; j<3;j++)
			{
				x[i][j] = i+1;
			}
		}
		
		for (int i = 0; i<3;i++)
		{
			for (int j=0; j<3;j++)
			{
				System.out.println("El valor en la posicion [" + i + "][" + j + "] es: " + x[i][j]);
			}
		}

	}

}
