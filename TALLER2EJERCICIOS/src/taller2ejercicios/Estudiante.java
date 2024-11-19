/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller2ejercicios;

/**
 *
 * @author yoven
 */
public class Estudiante {
    private String nombre;
    private int edad;

    // Constructor por defecto que llama al otro constructor
    public Estudiante() {
        this("Sin nombre", 0); // Llama al constructor con parametros
    }

    // Constructor con parametros
    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Metodo para mostrar los detalles del estudiante
    public void mostrarEstudiante() {
        System.out.println("Estudiante: " + this.nombre + ", Edad: " + this.edad);
    }

    public static void main(String[] args) {
        // Crear estudiantes y mostrar sus detalles
        Estudiante estudiante1 = new Estudiante();
        estudiante1.mostrarEstudiante(); // Salida: Estudiante: Sin nombre, Edad: 0

        Estudiante estudiante2 = new Estudiante("Ana", 20);
        estudiante2.mostrarEstudiante(); // Salida: Estudiante: Ana, Edad: 20
    }
}
