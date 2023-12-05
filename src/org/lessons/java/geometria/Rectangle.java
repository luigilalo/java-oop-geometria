package org.lessons.java.geometria;

public class Rectangle {
    // AGGIUNGO GLI ATTRIBUTI DEL RETTANGOLO
    int base;
    int altezza;
    int area;
    int perimetro;

    // METODI
    Rectangle(int base, int altezza) {
        this.base = base;
        this.altezza = altezza;
        calcolaArea(base, altezza);
        calcolaPerimetro(base, altezza);
    }

    public void calcolaArea(int base, int altezza) {
        this.area = base * altezza;
    }

    public void calcolaPerimetro(int base, int altezza) {
        this.perimetro = (2 * base) + (2 * altezza);
    }
}
