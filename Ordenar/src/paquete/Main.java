package paquete;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arreglo = {5,3,4,2,9,-1,5,15,25,78,105,120,250};		
		Ordenar o = new Ordenar(arreglo);
		
		/**
		 * Ordenamiento burbuja		
		 */
		//o.ordenarBurbuja();
		//o.imprimir();
		
		/**
		 * Ordenamiento por insercion
		 */
		//o.ordenarInsercion();
		//o.imprimir();
		
		/**
		 * Ordenamiento Quicksort
		 */
		o.ordenarQuicksort();
		o.imprimir();
	}

}
