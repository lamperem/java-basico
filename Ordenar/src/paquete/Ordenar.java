package paquete;

public class Ordenar {
	
	int[] array;
	
	public Ordenar(int[] array)
	{
		this.array = array;
	}
	
	public void ordenarBurbuja()
	{
		int aux;
		boolean cambios=false;
		
		while(true)
		{
			cambios = false;
			
			for ( int i=1; i<array.length; i++ )
			{
				if(array[i]<array[i-1])
				{
					aux = array[i];
					array[i] = array[i-1];
					array[i-1] = aux;
					cambios = true;
				}
			}
			
			if(cambios==false)
			{
				break;
			}
		}
	}
	
	public void ordenarInsercion()
	{
		int aux, cont1,cont2;
		
		for( cont1=1; cont1<array.length;cont1++)
		{
			aux = array[cont1];
			
			for(cont2=cont1-1;cont2 >=0 && array[cont2]>aux; cont2--)
			{
				array[cont2+1] = array[cont2];
				array[cont2] = aux;
			}
		}
	}
	
	public void ordenarQuicksort()
	{
		array = quicksort1(array);
	}
	
	public int[] quicksort1(int[] numeros)
	{
		return quicksort2(numeros,0,numeros.length-1);
	}
	
	public int[] quicksort2(int[] numeros, int izq, int der)
	{
		if ( izq >= der)
		{
			return numeros;
		}
				
		
		int i=izq, d=der;
		
		if(izq!=der)
		{
			int pivote;
			int aux;
			pivote = izq;
			
			while(izq!=der)
			{
				while (numeros[der]>=numeros[pivote] && izq<der)
					der--;
				while (numeros[izq]<numeros[pivote]&& izq<der)
					izq++;
				
				if(der!=izq)
				{
					aux = numeros[der];
					numeros[der] = numeros[izq];
					numeros[izq] = aux;
				}
				
			}
				
			if(izq==der)
			{
				quicksort2(numeros, i, izq-1);
				quicksort2(numeros, izq+1,d);
			}
		}
		else
			return numeros;
		
		return numeros;
	}
	
	
	public void imprimir()
	{
		for(int i=0;i<array.length; i++)
		{
			System.out.println(array[i]);
		}
	}

}
