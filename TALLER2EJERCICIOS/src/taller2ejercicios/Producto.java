/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller2ejercicios;

/**
 *
 * @author yoven
 */
public class Producto {
    private String nombre;
    private double precio;

    // Constructor con parametros
    public Producto(String nombre, double precio) {
        this.nombre = nombre; // Usamos this para el atributo
        this.precio = precio; // Usamos this para el atributo
    }

    // Metodo para mostrar los detalles del producto
    public void mostrarProducto() {
        System.out.println("Producto: " + this.nombre + ", Precio: " + this.precio);
    }

    public static void main(String[] args) {
        // Crear un producto y mostrar sus detalles
        Producto producto = new Producto("Laptop", 1500.50);
        producto.mostrarProducto(); // Salida: Producto: Laptop, Precio: 1500.5
    }
}
