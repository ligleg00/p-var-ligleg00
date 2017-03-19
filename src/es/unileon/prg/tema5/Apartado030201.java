package es.unileon.prg.tema5;

/**
 * Clase con los ejercicios correspondientes a cadenas de caracteres.
 * La clase "String"
 *
 * @author PRG
 * @version 1.0
 */
    public class Apartado030201 extends Apartado {
   
       protected String obtenerPractica(){
         return "P-VAR";
      }
   
       protected String obtenerBloque() {
         return "Cadenas de caracteres - Clase <<String>>";
      }
   
   /**
    * Cadenas de caracteres - Clase <<String>> - Ejercicio1.
    *
    * </br>
    *
    * Se pide anyadir el codigo necesario para realizar las siguientes tareas:
    *	Obtener el numero de caracteres de la cadena.
    *	Calcular la posicion intermedia de la cadena.
    *	Extraer el caracter que ocupa dicha posicion.
    *	Mostrar por pantalla dicho caracter y el codigo que lo representa.
    */
       public void ejercicio01() {
         cabecera("01","");
         String cadena = "En un lugar de la Mancha";
        // Inicio modificacion
	cadena= "En un lugar de la Mancha";
	int length = cadena.length();
	int length2 = length/2;
	char car = cadena.charAt(length/2);
	int valor=100;

	
	System.out.println("El carácter que ocupa la posición intermedia es"+car+"El código ASCI que lo representa es"+valor);
	
	
        // Fin modificacion
      }
   
   /**
    * Cadenas de caracteres - Clase <<String>> - Ejercicio2.
    *
    * </br>
    *
    *	Comparar las dos cadenas para ver si son iguales y mostrar por pantalla el resultado de la comparacion.
    * Volver a compararlas pero ahora sin tener en cuenta si estan en mayusculas o minusculas y mostrar por pantalla el resultado de la comparacion.
    *	Convertir las dos cadenas a minusculas, volver a compararlas y mostrar por pantalla el resultado de la comparacion.
    *
    */
       public void ejercicio02() {
         cabecera("02", "");
         String cadena = "Viaje al Parnaso";
         String otraCadena = "ViAje al pArnaso";
      // Inicio modificacion
	 int comparacion = cadena.compareTo(otraCadena);
	 int comparacion2 = cadena.compareToIgnoreCase(otraCadena);
	 System.out.println("El resultado de la comparación es"+comparacion+"El resultado de la comparación es"+comparacion2);
	 
	String cadena2 = cadena.toLowerCase();
	String otraCadena2 = otraCadena.toLowerCase();
	int comparacion3 = cadena2.compareTo(otraCadena2);
	int comparacion4 = cadena2.compareToIgnoreCase (otraCadena2);
	 System.out.println("El resultado de la comparación es:"+comparacion3+"El resultado de la comparación es:"+comparacion4);
	
	 
      // Fin modificacion
      }
   
   /**
    * Cadenas de caracteres - Clase <<String>> - Ejercicio3.
    *
    * </br>
    * Se pide anyadir el codigo necesario para realizar las siguientes tareas:
    *	Concatenar las dos cadenas formando una tercera usando el operador +
    * Concatenar las dos cadenas formando una tercera usando el metodo concat
    * Mostrar los resultados por pantalla.
    */
       public void ejercicio03() {
         cabecera("03", "");
      
         String cadena = "Viaje al Parnaso";
         String otraCadena = "Persiles y Segismunda";
      // Inicio modificacion
	String cadena2 = cadena + otraCadena;
	String cadena3 = cadena.concat(otraCadena);
		System.out.println("El resultado de concatenar las dos cadenas usando el operador + es"+ cadena2+"El resultado de concatenar 			las dos cadenas formando una tercera usando el método concat es"+cadena3);
	
		
        // Fin modificacion
      }
   
   /**
    * Cadenas de caracteres - Clase <<String>> - Ejercicio4.
    *
    * </br>
    *
    * Se pide anyadir el codigo necesario para realizar las siguientes tareas:
    * Comprobar si la cadena termina con la palabra Parnaso utilizando endsWith.
    * Comprobar si la cadena empieza con la palabra Viaje utilizando startsWith.
    * Mostrar los resultados por pantalla.
    */
       public void ejercicio04() {
         cabecera("04", "");
         String cadena = "Viaje al Parnaso";
        // Inicio modificacion
	if(cadena.endsWith("Parnaso")){
		System.out.println("La cadena termina con la palabra 'Parnaso'");
	 }
	if(cadena.startsWith("Viaje")){
		System.out.println("La cadena empieza con la palabra 'Viaje'");
	 }
        // Fin modificacion
      }
   
   /**
    * Cadenas de caracteres - Clase <<String>> - Ejercicio5.
    *
    * </br>
    *
    * Se pide anyadir el codigo necesario para realizar las siguientes busquedas en cadena utilizando indexOf:
    * Buscar si el caracter p esta en la cadena y mostrar el resultado por pantalla.
    * Buscar si la cadena Par esta en la cadena y mostrar el resultado por pantalla.
    * Buscar la ultima ocurrencia de la letra a en la cadena y mostrar el resultado por pantalla.
    * Buscar la letra a empezando por la posicion 3 y mostrar el resultado por pantalla.
    */
       public void ejercicio05() {
         cabecera("05","");
         String cadena = "Viaje al Parnaso";
      // Inicio modificacion
	cadena.indexOf("p");
		System.out.println("¿Está el carácter 'p' en la cadena?"+cadena.indexOf("p"));
	
	cadena.indexOf("Par");
		System.out.println("¿Está la cadena 'Par' en esta cadena?"+cadena.indexOf("Par"));
	
	cadena.lastIndexOf("a");
		System.out.println("La última ocurrencia de la letra 'a' en la cadena está en la posición:"+cadena.lastIndexOf("a"));
	 
	cadena.indexOf("a");
		System.out.println("La letra letra a empezando por la posición 3:"+(3+cadena.indexOf("a")));
	 
	
      // Fin modificacion  
      }
   
   /**
    * Cadenas de caracteres - Clase <<String>> - Ejercicio6.
    *
    * </br>
    *
    * Se pide anyadir el codigo necesario para realizar las siguientes tareas:
    *	Reemplazar las ocurrencias de la letra a por * y mostrar el resultado por pantalla.
    * Reemplazar las ocurrencias de la palabra Parnaso por Olimpo y mostrar en resultado por pantalla
    */
       public void ejercicio06() {
         cabecera("06", "");
      
         String cadena = "Viaje al Parnaso";
      // Inicio modificacion
	String modificacion1 = cadena.replace("a","*");
		System.out.println("La cadena obtenida reemplazando las ocurrencias de la letra'a' * es:"+modificacion1);
	 
	String modificacion2 = cadena.replaceAll("Parnaso","Olimpo");
		System.out.println("La cadena obtenida reemplazando las ocurrencias de la palabra 'Parnaso' por 'Olimpo' es:"+modificacion2);


      // Fin modificacion
      }
   
   /**
    * Cadenas de caracteres - Clase <<String>> - Ejercicio7.
    *
    * </br>
    *
    * Se pide anyadir el codigo necesario para realizar las siguientes tareas:
    * Obtener la subcadena que va desde la mitad al final.
    * Obtener la subcadena que empieza en la primera j y termina antes de la primera s
    */
       public void ejercicio07() {
         cabecera("07", "");
         String cadena = "Viaje al Parnaso";
      // Inicio modificacion
	int mitadCadena = cadena.length()/2;
	String nuevaCadena = cadena.substring (mitadCadena);		
	System.out.println("La cadena que va desde la mitad al final es:"+mitadCadena);
        // Fin modificacion
      }
   
   /**
    * Cadenas de caracteres - Clase <<String>> - Ejercicio8.
    *
    * </br>
    *
    * Se pide anyadir el codigo necesario quitar los espacios sobrantes al principio y al final.
    */
       public void ejercicio08() {
         cabecera("08", "");
         String cadena = " La Galatea   ";
      // Inicio modificacion
	String nuevaCadena = cadena.replace(" La Galatea   ","La Galatea");
	System.out.println("La cadena obtenida tras las modificaciones es:"+nuevaCadena);
        // Fin modificacion
      }
   
   /**
    * Cadenas de caracteres - Clase <<String>> - Ejercicio9.
    *
    * </br>
    *
    * Se pide anyadir el codigo necesario convertir las variables a String utilizando el metodo valueOf. Mostrar el resultado por pantalla.
    */
       public void ejercicio09() {
         cabecera("09", "");
         double numero = 1.12e12;
         boolean expresion = true;
         long enteroGrande = 1231231L;
      // Inicio modificacion
	 String valorNumero = String.valueOf(numero);
	 String valorExpresion = String.valueOf(expresion);
	 String valorenteroGrande = String.valueOf(enteroGrande);
	 
		System.out.println("El valor del número es:"+valorNumero+"El valor de la expresión es:"+valorExpresion+"El valor del entero 			Grande es:"+valorenteroGrande);
	 

        // Fin modificacion
      }
   
   /**
    * Cadenas de caracteres - Clase <<String>> - Ejercicio10.
    *
    * </br>
    *
    * Se pide comparar las dos cadenas lexicograficamente y mostrar el resultado por pantalla.
    */
       public void ejercicio10() {
         cabecera("10", "");
         String cadena = "Viaje al Parnaso";
         String otraCadena = "Viaje al Olimpo";
      // Inicio modificacion
	 cadena.compareTo(otraCadena);
	 System.out.println("El resultado de comparar las dos cadenas es:"+cadena.compareTo(otraCadena));
        // Fin modificacion
      }
   }
