package paquete;

import java.util.LinkedList;

class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		   // create a LinkedList
		   LinkedList list = new LinkedList();

		   // add some elements
		   list.add("Hello");
		   //list.add(2);
		   list.add("Chocolate");
		   list.add("10");
		
		System.out.println("El tamaño de la lista es :" + list.size());
		System.out.println(list.get(0));

	}

}
