package EjecicioCanciones;

/**
 * Ejercicio de la Canci�n
 * @author Palomares
 *@version 1.0222
 */

public class Cancion {

	private String titulo;
	private String grupo;
	private int duracion;
	private boolean sonando;

	// Definimos los constructores
	
	/**
	 * En este constructor asignamos valores a los atributos
	 */

	Cancion() // Constructor sin par�metros
	{
		this.titulo = "";
		this.duracion = 0;
		this.sonando = false;
	}
	
	/**
	 * En este constructor se muestran 2 par�metros
	 * @param titulo, par�metro tipo String
	 * @param duracion, par�metro tipo int
	 */

	Cancion(String titulo, int duracion)// constructor con 2 par�metros
	{
		this.titulo = titulo;
		this.duracion = duracion;
		this.sonando = false;
	}
	
	/**
	 * En este constructor se muestran 4 par�metros
	 * @param titulo, par�metro tipo String
	 * @param grupo, par�metro tipo String
	 * @param duracion, par�metro tipo int
	 * @param sonando, par�metro tipo boolean
	 */

	Cancion(String titulo, String grupo, int duracion, boolean sonando) // constructor con 4 par�metros
	{
		this.titulo = titulo;
		this.duracion = duracion;
		this.sonando = sonando;
		this.grupo = grupo;
	}
	
	/**
	 * M�todo que reproduce la canci�n
	 * @return
	 */

	boolean reproducirCancion() {
		if (this.sonando) {
			return false;
		} else {
			this.sonando = true;
			return true;
		}
	}

	/**
	 * M�todo que para la canci�n
	 * @return
	 */
	
	boolean pararCancion() {
		if (!this.sonando) {
			return false;
		} else {
			this.sonando = false;
			return true;
		}
	}

	// meter m�todos get/set/toString()
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public boolean isSonando() {
		return sonando;
	}

	public void setSonando(boolean sonando) {
		this.sonando = sonando;
	}
	
	/**
	 * M�todo que nos dice si una canci�n es la misma
	 * @param cancion
	 * @return
	 */

	boolean MismaCancion(Cancion cancion) {
		if (this.titulo == cancion.titulo && this.grupo == cancion.grupo)
			return true;
		else
			return false;
	}
	
	/**
	 * M�todo que nos dice la duraci�n mayor de las canciones
	 * @param canciones
	 * @return
	 */

	public static String MayorDuracion(Cancion[] canciones) {
		int posMax = 0;
		int max = 0;
		for (int i = 0; i < canciones.length; i++) {
			if (canciones[i].duracion > max) {
				posMax = i;
				max = canciones[i].duracion;
			}
		}
		return canciones[posMax].titulo;

	}
	
	/**
	 * M�todo que pasa a la siguiente canci�n
	 * @param canciones
	 * @param titulo
	 * @return
	 */

	static String SiguienteCancion(Cancion[] canciones, String titulo) {
		int pos = 0;
		int siguiente = 0;
		for (int i = 0; i < canciones.length; i++) {
			if (titulo == canciones[i].titulo) {
				pos = i;
			}
		}
		if (pos == canciones.length - 1) {
			siguiente = 0;
		} else {
			siguiente = pos + 1;
		}
		return canciones[siguiente].titulo;
	}

	@Override public String toString() { return "Datos de la canci�n [titulo=" + titulo + ", autor=" + 
			grupo + ", duracion=" + duracion + ", sonando=" + sonando
			+ "]"; }


}
