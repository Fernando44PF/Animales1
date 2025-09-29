/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Taylor
 */
public class Chango extends Animal implements Mascota {

    public Chango(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println("Soy un Chango llamado \"" + nombre + "\", tengo " + edad + " anos.");
        System.out.println(" ¡Uh uh ah ah! ");
    }

    @Override
    public void moverse() {
        System.out.println("Estoy trepando los arboles.");
    }

    @Override
    public void jugar() {
        System.out.println(nombre + " juega lanzando platanos.");
    }
}