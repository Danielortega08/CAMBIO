/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dinero_restante_cine;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Dinero_restante_cine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      //declarar todas las 
        int edad;
      int dinero;
      int dinero_total;
      Scanner teclado = new Scanner(System.in);
      // Mostrar "dime la edad"
        System.out.println("dime la edad que tienes");
      //conectas con teclado para pedir la edad
        edad=teclado.nextInt();
      //muestras la edad
        System.out.println("tienes" + edad);
      //pides el dinero que tiene
        System.out.println("dime el dinero que tienes");
      // conectas con teclado para pedir el dinero
        dinero=teclado.nextInt();
      //muestras el dinero que tiene
        System.out.println("tienes" + dinero);
      //avisamos del regalo de los 1000 euros
        System.out.println("te regalan 1000 euros");
      // haces la suma del dinero
        dinero_total=(dinero+1000);
      //muestras el total de dinero que tiene haciendo la suma
        System.out.println("ahora tienes" + dinero_total + "euros");
      
   
      
      
    }
    
}
