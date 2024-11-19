/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller2ejemplos;

/**
 *
 * @author yoven
 * 
 * 
 * Ejemplo Correcto 2: Llamada a Otro Constructor con this()
 */
public class Coche2 {
    private String marca;
    private int velocidadMaxima;

    // Constructor sin parámetros que llama al otro constructor
    public Coche2() {
        this("Desconocida", 0); // Llama al constructor con dos parámetros
    }

    // Constructor con parámetros
    public Coche2(String marca, int velocidadMaxima) {
        this.marca = marca;
        this.velocidadMaxima = velocidadMaxima;
    }

    // Método para mostrar la información del coche
    public void mostrarInformacion() {
        System.out.println("Marca: " + this.marca + ", Velocidad máxima: " + this.velocidadMaxima);
    }

    public static void main(String[] args) {
        Coche2 coche1 = new Coche2(); // Usa el constructor sin parámetros
        Coche2 coche2 = new Coche2("Toyota", 180); // Usa el constructor con parámetros

        coche1.mostrarInformacion(); // Salida: Marca: Desconocida, Velocidad máxima: 0
        coche2.mostrarInformacion(); // Salida: Marca: Toyota, Velocidad máxima: 180
    }
}