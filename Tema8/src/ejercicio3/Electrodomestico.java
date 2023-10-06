package ejercicio3;

public class Electrodomestico {
	protected double precioBase;
	protected String color;
	protected char consumoEnergetico;
	protected double peso;
	
	private static final String DEFAULT_COLOR = "blanco";
	private static final char DEFAULT_CONSUMO_ENERGETICO = 'F';
	private static final double DEFAULT_PRECIO_BASE = 100;
	private static final double DEFAULT_PESO = 5;
	
	private static final String[] COLORES_DISPONIBLES = {"blanco", "negro", "rojo", "azul", "gris"};
	
	
	public Electrodomestico() {
		this.precioBase = DEFAULT_PRECIO_BASE;
		this.color = DEFAULT_COLOR;
		this.consumoEnergetico = DEFAULT_CONSUMO_ENERGETICO;
		this.peso = DEFAULT_PESO;
	}
	
	
	public Electrodomestico(double precioBase, double peso) {
		this.precioBase = precioBase;
		this.peso = peso;
		this.color = DEFAULT_COLOR;
		this.consumoEnergetico = DEFAULT_CONSUMO_ENERGETICO;
	}


	public Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso) {
		this.precioBase = precioBase;
		this.color = comprobarColor(color);
		this.consumoEnergetico = consumoEnergetico;
		this.peso = peso;
	}
	
	private String comprobarColor(String color) {
        for (String colorDisponible : COLORES_DISPONIBLES) {
            if (color.equalsIgnoreCase(colorDisponible)) {
                return colorDisponible;
            }
        }
        return DEFAULT_COLOR;
    }

	public double getPrecioBase() {
		return precioBase;
	}

	public String getColor() {
		return color;
	}

	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public double getPeso() {
		return peso;
	}
	
}
