/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teoria_switch;
import java.util.Scanner;
/**
 *
 * @author alumne
 */
public class Teoria_switch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numDies;
        int mes;
        String mesTexto;
        Scanner teclado=new Scanner(System.in);
        System.out.println("En quin mes estas?");
        mes=teclado.nextInt();
        switch(mes)
        {
            case 1:
                mesTexto="enero";
                break;
            case 2:
                mesTexto="febrero";                
                break;
            case 3:
                mesTexto="marzo";
                break;
            case 4:
                mesTexto="abril";
                break;
            case 5:
                mesTexto="mayo";
                break;
            case 6:
                mesTexto="junio";
                break;
            case 7:
                mesTexto="julio";
                break;
            case 8:
                mesTexto="agosto";
                break;
            case 9:
                mesTexto="setiembre";
                break;
            case 10:
                mesTexto="octubre";
                break;
            default:
                mesTexto="Mes inxistente";
        }
        System.out.println("estas en el mes de "+mesTexto);
        switch(mes){
            case 1:
            case 3:
            case 5:
               numDies=31;
               break;
            case 6:
            case 4:
            case 8:
               numDies=30;
               break;
               
        }
    }
    
}
