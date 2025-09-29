/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Taylor
 */
public class Venado extends Animal {

    public Venado(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println("Soy un Venado llamado \"" + nombre + "\", tengo " + edad + " anos.");
        System.out.println("¡Snif snif! (resopla suavemente)");
    }

    @Override
    public void moverse() {
        System.out.println("Estoy corriendo agilmente por el bosque.");
    }
}
