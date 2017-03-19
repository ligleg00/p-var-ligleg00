package es.unileon.prg.tema5;

/**
 * Clase con los ejercicios correspondientes a operadores matematicos. La clase
 * "Math"
 *
 * @author PRG
 * @version 1.0
 */
public class Apartado030103 extends Apartado {

	protected String obtenerPractica() {
		return "P-VAR";
	}

	protected String obtenerBloque() {
		return "Operadores matematicos - Clase <<Math>>";
	}

	/**
	 * Operadores matematicos - Clase <<Math>> - Ejercicio1.
	 *
	 * </br>
	 *
	 * Consultar la clase <<Math>> del API de Java y programar el codigo
	 * necesario para realizar la operacion: obtener la raiz cuadrada de 256
	 */
	public void ejercicio01() {
		cabecera("01", "Calcular la raiz cuadrada de un numero");

		// Inicio modificacion	
		int numero1=256;
		numero1=(int) (Math.sqrt(numero1));
		System.out.println("La raíz cuadrada de " + numero1 + " es " +Math.sqrt(numero1));

		// Fin modificacion
	}

	/**
	 * Operadores matematicos - Clase <<Math>> - Ejercicio2.
	 *
	 * </br>
	 *
	 * Consultar la clase <<Math>> del API de Java y programar el codigo
	 * necesario para realizar la operacion: obtener el resultado de elevar al
	 * cubo el numero 9
	 */
	public void ejercicio02() {
		cabecera("02", "Calcular potencias");

		// Inicio modificacion
		int numero1=9;
		numero1=(int) (Math.pow(numero1,3));
		System.out.println("Resultado = "+numero1);


		// Fin modificacion
	}

	/**
	 * Operadores matematicos - Clase <<Math>> - Ejercicio3.
	 *
	 * </br>
	 *
	 * Consultar la clase <<Math>> del API de Java y programar el codigo
	 * necesario para generar un numero aleatorio contenido entre 5 y 10
	 */
	public void ejercicio03() {
		cabecera("03", "Generar numeros aleatorios");

		// Inicio modificacion
		double Aleatorio = Math.random()*10+5;
		int valor = (int)Aleatorio;
		System.out.println("El número aleatorio entre 5 y 15 que usted obtiene es "+valor);
		// Fin modificacion
	}

	/**
	 * Operadores matematicos - Clase <<Math>> - Ejercicio4.
	 *
	 * </br>
	 *
	 * Consultar la clase <<Math>> del API de Java y programar el codigo necesario
	 * para conocer la superficie de un circulo de diez unidades de radio.
	 */
	public void ejercicio04() {
		cabecera("04", "Calcular la superficie de un circulo");

		// Inicio modificacion
		double radio=10;
		double area;
		area=Math.PI*(Math.pow(radio,2));
		System.out.println("Area = "+area);
		// Fin modificacion
	}
}
