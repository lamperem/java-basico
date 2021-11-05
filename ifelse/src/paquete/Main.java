package paquete;

class Main {

	/**
	 * @param args
	 * >,>=,<,<=,==,||,&&, !
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int var = 5;
		boolean cond;
		
		if(var <= 10){
			//codigo
			cond = true;			
		}else{
			cond = false;
			System.out.println("TU operacion es falsa");
		}
		
		if(cond){
			System.out.println("TU operacion es verdadera");
		}else{
			System.out.println("TU operacion es falsa");
		}

	}

}
