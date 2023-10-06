package ejercicio2;

public class Password {
	private int longitud;
	private String contrasena;
	
	private static final int LONGITUD_POR_DEFECTO = 8;
	
	public Password() {
 		this.longitud = LONGITUD_POR_DEFECTO;
		this.contrasena = "";
 	}
	
	public Password(int longitud, String contrasena) {
 		this.longitud = longitud;
		this.contrasena = contrasena;
 	}
	
	public int getLongitud() {
		return longitud;
	}

	public String getContrasena() {
		return contrasena;
	}
}
