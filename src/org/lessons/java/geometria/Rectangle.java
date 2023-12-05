package org.lessons.java.geometria;

public class Rectangle {
    // AGGIUNGO GLI ATTRIBUTI DEL RETTANGOLO
    int base;
    int altezza;
    int area;
    int perimetro;

    // METODO
    Rectangle(int base, int altezza) {
        this.base = base;
        this.altezza = altezza;
        this.area = base * altezza;
        this.perimetro = 2*base + 2*altezza;
    }


}
