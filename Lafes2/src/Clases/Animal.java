/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Taylor
 */
public abstract class Animal {
    
     protected String nombre;
    protected int edad;

    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Métodos abstractos que las subclases deben implementar
    public abstract void hacerSonido();
    public abstract void moverse();
      
}
