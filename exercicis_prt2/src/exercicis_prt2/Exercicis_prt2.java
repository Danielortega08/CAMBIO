/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicis_prt2;

import java.util.Scanner;


/**
 *
 * @author alumne
 */
public class Exercicis_prt2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double radi;
        double longitud;
        double area;
        double volum;
       //preguntar radi 
        System.out.println("radi de la circunferencia");
        radi=teclado.nextDouble();
        //longitud=2*PI*radi
        longitud=radi*2*3.14;
       //radi r2*PI
        area=radi*radi*3.14;
        volum=radi*radi*radi*4/3*3.14;
        System.out.println("longitud es de "+longitud);
        System.out.println("area es de "+area);
        System.out.println("volum es de "+volum);
        
        
        double preu_producte;
        int descompte;
        double preu_final;
        
        System.out.println("preu inicial del producte");
        preu_producte=teclado.nextDouble();
        System.out.println("percentatge de descompte");
        descompte= teclado.nextInt();
        preu_final=preu_producte*descompte/100;
        System.out.println("el preu final es de "+ preu_final);
        
        
        double preu_descompte;
        double preu_principi;
        double percentatge;
        
        System.out.println("el preu actual ");
        preu_descompte=teclado.nextDouble();
        System.out.println("el preu inicial ");
        preu_principi=teclado.nextDouble();
        percentatge=preu_descompte*100/preu_principi;
        System.out.println("el descompte es de "+percentatge+"%");
        
        
        
        double graus_fahrenheit;
        double graus_celsius;
        System.out.println("temperatura en Fahrenheit ");
        graus_fahrenheit=teclado.nextDouble();
        graus_celsius=graus_fahrenheit-32;
        System.out.println("en graus celsius es "+ graus_celsius);
        
        
        
        
       double milles_nautiques;
       double metres;
        System.out.println("milles nautiques ");
        milles_nautiques=teclado.nextDouble();
        metres=milles_nautiques*1852;
        System.out.println("en metres es "+metres);
       
        
        
        
        
        
        
        
        
        
        
    }
    
}
