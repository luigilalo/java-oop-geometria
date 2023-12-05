package org.lessons.java.geometria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Rectangle rectangle = new Rectangle(10, 20);

        // METTO A SCHERMO BASE E ALTEZZA
        /*
        System.out.println("La base del rettangolo misura " + rectangle.base);
        System.out.println("L'altezza del rettangolo misura " + rectangle.altezza);
        System.out.println("L'area del rettangolo misura " + rectangle.area);
        System.out.println("Il perimetro del rettangolo misura " + rectangle.perimetro);
        */
        System.out.println(rectangle);

        System.out.println("Vuoi creare un nuovo rettangolo? (y/n)");
        String rectangleChoice = scan.next();
        if (rectangleChoice.equalsIgnoreCase("y")) {
            System.out.println("Quanto deve misurare la base?");
            int base = scan.nextInt();
            System.out.println("Quanto deve misurare l'altezza?");
            int altezza = scan.nextInt();
            Rectangle rectangleCreated = new Rectangle(base, altezza);
           /* System.out.println ("L'area del nuovo rettangolo sarà " + rectangleCreated.area);
              System.out.println ("Il perimetro del nuovo rettangolo sarà " + rectangleCreated.perimetro); */
              System.out.println(rectangleCreated.toString2());
        }
    }
}
