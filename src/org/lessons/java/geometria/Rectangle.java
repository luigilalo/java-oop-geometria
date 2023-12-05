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
        calcolaArea();
        calcolaPerimetro();
    }

    void calcolaArea() {
        this.area = base * altezza;
    }

    void calcolaPerimetro() {
        this.perimetro = (2 * base) + (2 * altezza);
    }

    @Override
    public String toString() {
        return "Rectangle [" +
                "base='" + base + '\'' +
                ", altezza=" + altezza +
                ", area='" + area + '\'' +
                ", perimetro='" + perimetro + '\'' +
                ']';
    }

    public String toString2() {
        return "Rectangle [" +
                ", area='" + area + '\'' +
                ", perimetro='" + perimetro + '\'' +
                ']';
    }

    void disegna() {
        for (int i = 0; i <= base; i++) {
            for (int j = 0; j <= altezza; j++) {
                if ((i == 0 || i == base))
                    System.out.print("0");
                else {
                    if ((j == 0 || j == altezza) && (i > 0 && i < base)) {
                        System.out.print("0");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
                System.out.println();
            }
        }
    }

