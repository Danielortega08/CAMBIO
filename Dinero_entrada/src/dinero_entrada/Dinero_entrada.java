/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dinero_entrada;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Dinero_entrada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int dinero_principal;
     int dinero_entrada;
     int cuantas_entradas;
     int dinero_restante;
     
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("cuanto dinero tienes?");
        dinero_principal=teclado.nextInt();
        System.out.println("cual es el precio de la entrada?");
        dinero_entrada=teclado.nextInt();
        System.out.println("cuantas entradas has comprado?");
        cuantas_entradas=teclado.nextInt();
        dinero_restante=(dinero_principal - dinero_entrada * cuantas_entradas);
        System.out.println("te han quedado" + dinero_restante + "euros");
        
        
        
        
     
        // TODO code application logic here
    }
    
}
