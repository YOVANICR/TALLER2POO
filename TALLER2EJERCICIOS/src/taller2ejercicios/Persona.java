/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller2ejercicios;

/**
 *
 * @author yoven
 */
public class Persona {
    private String nombre;

    // Metodo normal para mostrar el nombre
    public void mostrarNombre() {
        System.out.println("Nombre: " + this.nombre);
    }

    
    public static void mostrarNombre2() {
         //System.out.println(this.nombre); // Error: No se puede usar this en un metodo estatico
    }
    
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.nombre = "Carlos"; // Asignar nombre
        persona.mostrarNombre2(); // Salida: Nombre: Carlos
    }
}
