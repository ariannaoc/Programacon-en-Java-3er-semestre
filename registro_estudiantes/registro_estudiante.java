/* Diseñe un programa que implemente una case llamada Estudiante 
para el departamento de control de estudios, el cual tiene los siguientes atributos:
apellidos, nombres, fecha de nacimiento, sexo, año de ingreso, carrera,
procedencia, turno. 
El programa debe leer los datos del participante y mostrar los mismos adicionando 
la edad y los años de estudios.
 */

package com.mycompany.l_p_estudiante;
/**
 * @author Arianna Olivares 
 */
public class L_P_estudiante {

    public static void main(String[] args) {
       String apellidosEstudiante;
       String nombresEstudiante;
       int fecha_nacimientoEstudiante;
       char sexoEstudiante;
       int año_ingresoEstudiante;
       char carreraEstudiante;
       char procedenciaEstudiante;
       char turnoEstudiante;
       
       Estudiante oEstudiante = new Estudiante("Olivares Cegarra", "Arianna Alejandra",
               2004, "femenino", 2021, "informatica", "merida", "tarde");
       
       apellidosEstudiante= oEstudiante.retornaApellidos();
       nombresEstudiante= oEstudiante.retornaNombres();
       fecha_nacimientoEstudiante = oEstudiante.retornaFechaNacimiento();
       sexoEstudiante = oEstudiante.retornaSexo();
       año_ingresoEstudiante= oEstudiante.retornaAñoIngreso();
       carreraEstudiante= oEstudiante.retornaCarrera();
       procedenciaEstudiante= oEstudiante.retornaProcedencia();
       turnoEstudiante= oEstudiante.retornaTurno();
       System.out.println("Datos del estudiante: "
               + "Apellidos:" +apellidosEstudiante+ 
               + "Nombres: " +nombresEstudiante+ 
               + "Año de nacimiento: " +fecha_nacimientoEstudiante+
               + "Sexo:" +sexoEstudiante+ 
               + "Año de ingreso: " +año_ingresoEstudiante+ 
               + "Carrera: " +carreraEstudiante+
               + "Procedencia: " +procedenciaEstudiante+ ""
               + "Turno: " +turnoEstudiante);
    }
}

class Estudiante{
    private String apellidos;
    private String nombres;
    private int fecha_nacimiento;
    private char sexo;
    private int año_ingreso;
    private char carrera;
    private char procedencia;
    private char turno;
    
    // Constructor de la clase 
    
    public Estudiante(String apellidos, String nombres, int fecha_nacimiento,
            char sexo, int año_ingreso,char carrera, char procedencia, char turno) {
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.fecha_nacimiento = fecha_nacimiento;
        this.sexo = sexo;
        this.año_ingreso = año_ingreso;
        this.carrera = carrera;
        this.procedencia = procedencia;
        this.turno = turno;
    }
    // Fin constructor 
    
   public String retornaApellidos(){
       return apellidos;
   }
   public String retornaNombres(){
       return nombres;
   }
   public int retornaFechaNacimiento(){
       return fecha_nacimiento;
   }
    public char retornaSexo(){
        return sexo;
    }
    public int retornaAñoIngreso(){
        return año_ingreso;
    }
    public char retornaCarrera(){
        return carrera;
    }
    public char retornaProcedencia(){
        return procedencia;
    }
    public char retornaTurno(){
        return turno;
    } 
}