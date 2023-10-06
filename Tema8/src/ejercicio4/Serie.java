package ejercicio4;

public class Serie {
	private String titulo;
	private int numeroTemporadas;
	private boolean entregado;
	private String genero;
	private String creador;
	
	private static final int DEFAULT_TEMPORADAS = 3;
	private static final boolean DEFAULT_ENTREGADO= false;
	
	
	
	public Serie() {
		this("", DEFAULT_TEMPORADAS, DEFAULT_ENTREGADO, "", "");
	}
	
	public Serie(String titulo,String creador) {
		this(titulo, DEFAULT_TEMPORADAS, DEFAULT_ENTREGADO, "", creador);
	}
	
	public Serie(String titulo, int numeroTemporadas, boolean entregado, String genero, String creador) {
		this.titulo = titulo;
		this.numeroTemporadas = numeroTemporadas;
		this.entregado = entregado;
		this.genero = genero;
		this.creador = creador;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getNumeroTemporadas() {
		return numeroTemporadas;
	}

	public void setNumeroTemporadas(int numeroTemporadas) {
		this.numeroTemporadas = numeroTemporadas;
	}

	public boolean isEntregado() {
		return entregado;
	}

	public void setEntregado(boolean entregado) {
		this.entregado = entregado;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}

	
	
}
