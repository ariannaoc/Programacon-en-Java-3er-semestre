
/* Diseñe un programa que emplee matrices para almacenar las calificaciones de los estudiantes
de una sección bajo las siguientes condiciones:
    En la sección nunca hay menos de 3 ni más de 50 estudiantes
    Cada estudiante realiza 4 pruebas cuya calificación esta entre 1 y 20 puntos.
    El promedio mínimo aprobatorio son 10 puntos
    Mostrar la calificación promedio y el Status del estudiante, así como la cantidad de
 aprobados y reprobados
*/

import java.util.*;

import javax.xml.transform.Source;

public class ArregloCalificaciones {

    private static void listar(int matriz[][]) {
        System.out.println("Alumno\t\tCorte 1\t\tCorte 2\t\tCorte 3\t\tPromedio\tEstatus");

        for (int x = 0; x < matriz.length; x++) {
            int notas = 0;
            float promedio = 0;
            String estatus = "";
            String line = "";

            for (int y = 0; y < matriz[0].length; y++) {
                notas += matriz[x][y];
                line += " " + matriz[x][y] + "\t\t";
            }
            promedio = notas / 3;

            if (promedio < 10) {
                estatus = "Reprobado";
            } else{
                estatus = "Aprobado";
            }

            System.out.println((x+1) + "\t\t" + line  + promedio + "\t\t" + estatus);
        }

    }

    public static void main(String[] args) {
        int T;
        int nota = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de alumnos en la seccion");
        T = teclado.nextInt();
        int matriz [][]= new int [T][3];



        if (T<3 || T> 50){
            System.out.println("La cantidad de alumnos no es valida, en una seccion no se permiten menos de 3 ni mas de 50 alumnos ");
        } else {
            // llenar matriz
            for(int x =0; x <= T-1; x++){
                // System.out.println(x);
                System.out.println("Introduzca las calificaciones del alumno " + (x+1)+ " ");

                for(int y =0; y <= 2; y++){
                    System.out.println("Calificación corte " + (y+1) + " ");
                    nota = teclado.nextInt();
                    if (nota >= 1 && nota <=20){
                        matriz[x][y] = nota;
                    } else {
                        System.out.println("Calificación invalida");
                        y--;
                    }
                }
            }

        }

        listar(matriz);
    }
}
