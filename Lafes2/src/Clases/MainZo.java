/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Taylor
 */
public class MainZo {

    public static void main(String[] args) {

        Animal[] zoo = new Animal[3];
        zoo[0] = new Chango("Chito", 4);
        zoo[1] = new Venado("Bambi", 2);
        zoo[2] = new Coyote("Jelty", 5); 

        for (Animal animal : zoo) {
            animal.hacerSonido();
            animal.moverse();

            if (animal instanceof Mascota) {
                Mascota mascota = (Mascota) animal;
                mascota.jugar();
            }

            System.out.println("-----------------------------");
        }
    }
}
