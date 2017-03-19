package es.unileon.prg.tema5;

/**
 * Clase que representa un alumno.
 * 
 * @author PRG
 * @version 1.0
 */
public class Alumno {
	
	private String _niu;
	
	private String _nombre;
	
	private float _nota;

	
	public Alumno(String niu, String nombre) {
		_niu = niu;
		_nombre = nombre;
	}

	
	public void asignarNota(float nota) {
		_nota = nota;
	}

	public String toString() {
		StringBuffer salida = new StringBuffer();
		
		salida.append("NIU: "+_niu+" ");
		salida.append("Nombre: "+_nombre+" ");
		salida.append("Nota: "+_nota+" ");
		
		return salida.toString();
	}
	
}
