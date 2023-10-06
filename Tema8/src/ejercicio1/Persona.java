package ejercicio1;

public class Persona {
 	private String nombre;
 	private int edad;
 	private final String dni;
 	private char sexo;
 	private double peso;
 	private double altura;
 	
 	private static final char SEXO_POR_DEFECTO = 'H';

 	public Persona() {
 		this.nombre = "";
		this.edad = 0;
		this.sexo = SEXO_POR_DEFECTO;
		this.peso = 0;
		this.altura = 0;
		this.dni = generarDni();
 	}
 	
	public Persona(String nombre, int edad, char sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.peso = 0;
		this.altura = 0;
		this.dni= generarDni();
	}

	public Persona(String nombre, int edad, char sexo, double peso, double altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
		this.dni = generarDni();
	}
	
	private String generarDni() {
		return "123456789A";
	}

	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}

	public String getDni() {
		return dni;
	}

	public char getSexo() {
		return sexo;
	}

	public double getPeso() {
		return peso;
	}

	public double getAltura() {
		return altura;
	}

}
