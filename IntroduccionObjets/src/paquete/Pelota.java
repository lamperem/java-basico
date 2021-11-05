package paquete;

public class Pelota {
	
	// Variables de la clase
	float radio;
	float peso;
	
	// Constructor por defecto
	public Pelota(){
		radio = 100;
		peso = 250;
	}
	
	// Constructor inicializado con parametros
	public Pelota (float radio, float peso)
	{
		this.radio = radio;
		this.peso = peso;
	}
	
	/**
	 * Metodos
	 * @return
	 */

	public float obtenerRadio()
	{
		return this.radio;
	}
	
	public float obtenerPeso()
	{
		return this.peso;
	}
	
	public void patearPelota()
	{
		System.out.println("Haz pateado la pelota");
	}
	
	public void atraparPelota()
	{
		System.out.println("Haz atrapado la pelota");
	}

}
