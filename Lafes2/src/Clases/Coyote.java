/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Taylor
 */
public class Coyote extends Animal {

    public Coyote(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println("Soy un Coyote llamado \"" + nombre + "\", tengo " + edad + " anos.");
        System.out.println("¡Auuuuuuuu!");
    }

    @Override
    public void moverse() {
        System.out.println("Estoy trotando sigilosamente por el desierto");
    }
}
