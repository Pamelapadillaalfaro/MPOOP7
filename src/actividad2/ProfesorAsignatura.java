/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad2;

/**
 *Clase que crea un Profesor de Asignatura
 * @author alumno
 */
public class ProfesorAsignatura extends Profesor{
    private String nombreAsignatura;
    /**
     * Constructor vacío
     */
    public ProfesorAsignatura() {
    }
    /**
     * Constructor con atributos
    * @param nombreAsignatura Nombre de la asignatura que da el profesor de asignatura
    * @param numAlumnos NÃºmero de alumnos del profesor de asignatura
    * @param salario Salario que gana el profesor de asignatura
    * @param horaEntrada Hora de entrada del profesor de asignatura
    * @param horaSalida Hora de salida del profesor de asignatura
    * @param mascota Mascota del profesor de asignatura con sus atributos
    * @param nombre Nombre del profesor de asignatura
    * @param edad  Edad del profesor de asignatura
    */
    public ProfesorAsignatura(String nombreAsignatura, int numAlumnos, float salario, int horaEntrada, int horaSalida, Mascota mascota, String nombre, int edad) {
        super(numAlumnos, salario, horaEntrada, horaSalida, mascota, nombre, edad);
        this.nombreAsignatura = nombreAsignatura;
    }
    public String getNombreAsignatura() {
        return nombreAsignatura;
    }
    public void setNombreAsignatura(String nombreAsignatura) {
        this.nombreAsignatura = nombreAsignatura;
    }
    /**
    * ToString que imprime todos los atributos de un profesor de asignatura
    * @return Atributos del profesor de asignatura
    */

    @Override
    public String toString() {
        return super.toString()+"ProfesorAsignatura{" + "nombreAsignatura=" + nombreAsignatura + '}';
    }
}
