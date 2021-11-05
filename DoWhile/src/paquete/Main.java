package paquete;

class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 0;
		boolean cond = true;
		
		while(cond)
		{
			System.out.println("El valor de X es: " + x);
			x = x + 2;
			
			if (x > 8){
				cond = false;
			}
		}

	}

}
