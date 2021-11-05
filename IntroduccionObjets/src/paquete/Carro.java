package paquete;

public class Carro {

	// Variables de la clase
	
	double peso, altura, ancho, largo;
	int numeroPuertas;
	boolean encendido = false;
	String modelo;
	
	//Constructores
	
	public Carro()
	{
		this.peso = 1000;
		this.altura = 1.90;
		this.ancho = 4;
	}
	
	
	// Metodos
	
	public double obtenerPeso()
	{
		return this.peso;
	}
	
	public void encender()
	{
		this.encendido = true;
		System.out.println("El Carro esta encendido");
	}
	
	public void apagar()
	{
		this.encendido = false;
		System.out.println("El Carro esta apagado");
	}
	
	public void  estado()
	{
		if(this.encendido == true){
			System.out.println("El carro esta encendido");
		}else
		{
			System.out.println("El carro esta apagado");
		}
	}
	
	public void informacion()
	{
		System.out.println("Este es un carro comun y corriente");
	}
	
}


class CarroBMW extends Carro
{
	public CarroBMW()
	{
		this.modelo="BMW";
	}
	
	public void turbo()
	{
		System.out.println("Acabas de viajar a 100 millas por hora!");
	}
	
	public void informacion()
	{
		System.out.println("Este es un BMW del año 2014");
	}
	
}

class CarroToyota extends Carro
{
	public CarroToyota(){
		this.modelo = "Toyota";
	}
	
	public String model()
	{
		return this.modelo;
	}
	
	public void informacion()
	{
		System.out.println("Este es un Toyota del año 2016");
	}
	
}
