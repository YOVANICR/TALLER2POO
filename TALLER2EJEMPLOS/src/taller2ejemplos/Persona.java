/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller2ejemplos;

/**
 *
 * @author yoven
 */
public class Persona {
    private String nombre;

    // Método estático que intenta usar `this`
    public static void mostrarNombre() {
        // System.out.println(this.nombre); // Esto genera un error de compilación
    }

    public static void main(String[] args) {
        System.out.println("Este código no compila porque `this` no puede usarse en un contexto estático.");
    }
}