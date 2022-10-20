
public class CalculadoraModel {

	public static final char IGUAL = '='; 
	public static final char SUMAR = '+'; 
	public static final char RESTAR = '-'; 
	public static final char DIVIDIR = '/'; 
	public static final char MULTIPLICAR = '*';
	
	private static final char COMA = '.'; 
	
	private Double operando;
	private char operador;
	private Boolean nuevoOperando;
	private String pantalla;
	
	
	public CalculadoraModel() {
		borrar();
	}
	
	
	public void insertar(char digito) {
		if (digito >= '0' && digito <= '9') {
			if (nuevoOperando) {
				nuevoOperando = false;
				pantalla = "";
			}
			pantalla += digito;
		} else if (digito == COMA) {
			insertarComa();
		}
	}
	
	public void insertarComa() {
		if (!pantalla.contains("" + COMA)) {
			pantalla += COMA;
		}
	}
	
	public String getPantalla() {
		return pantalla;
	}
	
	public void borrar() {
		operando = 0.0;
		operador = '=';
		borrarTodo();
	}
	
	public void borrarTodo() {
		nuevoOperando = true;
		pantalla = "0.0";
	}
	
	public void operar(char operador) {
		nuevoOperando = true;
		double operando2 = Double.parseDouble(pantalla);
		switch (this.operador) {
			case SUMAR: operando += operando2; break;
			case RESTAR: operando -= operando2; break;
			case MULTIPLICAR: operando *= operando2; break;
			case DIVIDIR: operando /= operando2; break;
			case IGUAL: operando = operando2; break;
		}

		this.operador = operador;
		pantalla = "" + operando;
	}
	
	
}
