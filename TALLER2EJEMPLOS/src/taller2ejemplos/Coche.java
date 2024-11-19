/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller2ejemplos;

/**
 *
 * @author yoven 
 * 
 * Ejemplo Correcto 1: Diferenciación de Atributos y Parámetros
 */
public class Coche {
    private String marca;

    // Constructor que utiliza `this` para diferenciar atributo y parámetro
    public Coche(String marca) {
        this.marca = marca; // `this.marca` es el atributo, `marca` es el parámetro
    }

    // Método para establecer la marca
    public void setMarca(String marca) {
        this.marca = marca; // `this` para evitar confusión
    }

    // Método para mostrar la marca
    public void mostrarMarca() {
        System.out.println("Marca: " + this.marca); // Usamos `this` para referirnos al atributo
    }

    public static void main(String[] args) {
        Coche coche = new Coche("Toyota");
        coche.mostrarMarca(); // Salida: Marca: Toyota

        coche.setMarca("Honda");
        coche.mostrarMarca(); // Salida: Marca: Honda
    }
}
