/*Diseñar un programa en Java que emplee vectores para almacenar las edades de los estudiantes
de una sección bajo las siguientes condiciones:

 Mostrar:
    Vector Original 
    Vector ordenado de manera ascendente 
    Vector ordenado descendentemente
    El promedio de edad
    La edad más baja y la más alta
*/

// compilar y ejecutar
// javac ArregloEdad.java && java ArregloEdad

import java.util.*;

import javax.xml.transform.Source;

/**
 * Calculos
 */

class Calculos {

    private int vectorEdades[];
    public int edad_menor = 100;
    public int edad_mayor = 0;
    public int edad_promedio = 0;

    public Calculos(int edades[]){
        this.vectorEdades = edades;
        this.Calcular();
    }

    private void Calcular() {
        int edades = 0;

        for (int i = 0; i < this.vectorEdades.length; i++) {
            edades += this.vectorEdades[i];

            if (this.vectorEdades[i] > this.edad_mayor) {
                this.edad_mayor = this.vectorEdades[i];
            }

            if (this.vectorEdades[i] < this.edad_menor) {
                this.edad_menor = this.vectorEdades[i];
            }

        }

        this.edad_promedio = edades / this.vectorEdades.length;

    }

}

public class ArregloEdad {
    public static void main(String[] args) {

        int T;
        Scanner teclado= new Scanner(System.in);
        System.out.println("Ingrese la cantidad de alumnos en la seccion");
        T = teclado.nextInt();

        if (T<3 || T> 50){
            System.out.println("La cantidad de alumnos no es valida, en una seccion no se permiten menos de 3 ni mas de 50 alumnos ");
        } else {
        String vectorNombres[];
        int vectorEdades[];
        vectorNombres = new String[T];
        vectorEdades = new int[T];

        // Llenado de vectores

        for(int i =0; i<vectorNombres.length; i++){
            System.out.println("Ingrese el NOMBRE del estudiante " +i+ ": ");
            vectorNombres[i] = teclado.next();
            System.out.println("Ingrese la EDAD del estudiante " +i+ ": ");
            vectorEdades[i] = teclado.nextInt();
            }
        // Imprimir vectores
        System.out.println("Las edades de los alumnos de la seccion son: ");
    for(int i =0; i< vectorNombres.length; i++){
    System.out.println(" " +vectorNombres[i]+ " " + vectorEdades[i]+ " ");

        }

        System.out.println("EDADES de los estudiantes ordenadas de menor a mayor: ");
        Arrays.sort(vectorEdades);
        for(int i =0; i<vectorNombres.length; i++){
            System.out.println(vectorEdades[i]);
        }

        System.out.println("EDADES de los estudiantes ordenadas de mayor a menor: ");
        Arrays.sort(vectorEdades);
        for(int i = vectorNombres.length-1; i>= 0; i--){
            System.out.println(vectorEdades[i]);
        }

        Calculos Cal = new Calculos(vectorEdades);
        System.out.println("Promedio de edades de los estudiantes: " + Cal.edad_promedio + " ");
        System.out.println("Edad Mayor: " + Cal.edad_mayor + " ");
        System.out.println("Edad Menor: " +Cal.edad_menor + " ");



    }
}

}
