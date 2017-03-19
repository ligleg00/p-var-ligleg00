package es.unileon.prg.tema5;

/**
 * Clase con los ejercicios correspondientes a operadores.
 *
 * @author PRG
 * @version 1.0
 */
public class Apartado030102 extends Apartado {

	protected String obtenerPractica(){
		return "P-VAR";
	}

	protected String obtenerBloque() {
		return "Operadores";
	}

	/**
	 * Operadores - Ejercicio1.
	 *
	 * </br>
	 *
	 * Se pide completar el codigo para realizar las operaciones solicitadas
	 */
	public void ejercicio01() {
		cabecera("01","Utilizacion de operadores aritmeticos");

		// Inicio modificacion
		final int CONST=128;
		int op1=0;
		int op2=0;
		int resultado;
		
		op1=(++op1)*12;
		op2= (--op1) + CONST;
		resultado=op2/op1;
		System.out.println("Solución op1 = "+ op1 +" Solución op2 = "+ op2 +" Solución de resultado= "+ resultado);	
		



		//Preincrementa op1 y multiplicalo por 12
		//El valor de op2 es la suma op1 predecrementado con CONST
		//Halla el resto de dividir op2 entre op1 y guardalo en resultado
		//Muestra por pantalla los valores de op1, op2 y resultado
      // Fin modificacion
	}

	/**
	 * Operadores - Ejercicio2.
	 *
	 * </br>
	 *
	 * Se pide completar el codigo para calcular el valor de rebaja construir una expresión booleana que permitaidentificar si un clientede un seguro de automóvil tiene derecho a una rebaja a la hora de la renovación anual, sabiendo que la rebaja se da si secumple
una de las siguientes condiciones:
Si tiene entre40 y 60 añosymenos de 3 partes
.
§
Si es mayor de 20, tiene como mucho un parte y su coche no es deportiv
	 */
	public void ejercicio02() {
		cabecera("02", "Utilizacion de operadores logicos");

		// Inicio modificacion
		int edad=52;
		int numeroPartes=2;
		boolean deportivo=true;
		if (edad<60){
			if (edad>40){if(numeroPartes<3){
							boolean rebaja=true;
							System.out.println("Rebaja = " + rebaja);
							}
							else{boolean rebaja=false;
							System.out.println("Rebaja = " + rebaja);
							}
					
					}
					else{
						if(edad >20){if(numeroPartes <2){
						if (deportivo == false){
							boolean rebaja=true;
							System.out.println("Rebaja = " + rebaja);
					
					}
						else {boolean rebaja=false;
						System.out.println("Rebaja = " + rebaja);
						}

			
					}
						else {boolean rebaja=false;
						System.out.println("Rebaja = " + rebaja);
						}

				}
						else {boolean rebaja=false;
						System.out.println("Rebaja = " + rebaja);
						}


					}					
					}
				
					else{
						boolean rebaja=false;
						System.out.println("Rebaja = " + rebaja);
						}
		
		// rebaja = expresion booleana
		// Fin modificacion
	}
	
		

	/**
	 * Operadores - Ejercicio3.
	 *
	 * </br>
	 *
	 * Se pide calcular cuantas horas, minutos y segundos hay en 56000 segundos
	 */
	public void ejercicio03() {
		cabecera("03", "Calculos aritmeticos");

		// Inicio modificacion
		int segundos, horas, minutos,a;
		int totalSegundos=56000;
		horas= 56000/(60*60);
		a=56000%3600;
		minutos= a/60;
		segundos= a%60;
		
		// Realizacion de calculos
		System.out.println(horas+"h "+minutos+"m "+segundos+"s ");
		// Fin modificacion
	}
}
