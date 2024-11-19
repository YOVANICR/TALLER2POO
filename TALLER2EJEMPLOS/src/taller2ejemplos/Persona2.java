/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller2ejemplos;

/**
 *
 * @author yoven
 */
public class Persona2 {
    private String nombre;

    public void setNombre(String nombre) {
        this.nombre = nombre; // `this` es necesario aquí

        // Uso innecesario de `this` en una llamada interna
        this.mostrarNombre(); // Aunque compila, `this` es innecesario
    }

    public void mostrarNombre() {
        System.out.println("Nombre: " + nombre); // Aquí no es necesario usar `this`
    }

    public static void main(String[] args) {
        Persona2 persona = new Persona2();
        persona.setNombre("Juan");
        persona.mostrarNombre(); // Salida: Nombre: Juan
    }
}