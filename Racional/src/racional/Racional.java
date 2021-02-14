package racional;

public class Racional {

    int numerador;
    int denominador;

    public Racional() {
        numerador = 0;
        denominador = 1;
    }

    public Racional(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    //Método set
    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    //Método get
    public int getNumerador() {
        return numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    //Suma racionales
    public Racional suma(Racional obj1, Racional obj2) {
        int a = obj1.getNumerador();
        int b = obj1.getDenominador();
        int c = obj2.getNumerador();
        int d = obj2.getDenominador();

        this.setNumerador((a * d) + (b * c));
        this.setDenominador(b * d);
        return this;
    }

    //Resta racionales
    public Racional resta(Racional obj1, Racional obj2) {
        int a = obj1.getNumerador();
        int b = obj1.getDenominador();
        int c = obj2.getNumerador();
        int d = obj2.getDenominador();

        this.setNumerador((a * d) - (b * c));
        this.setDenominador(b * d);
        return this;
    }

    //Multiplicación racionales
    public Racional multiplica(Racional obj1, Racional obj2) {
        int a = obj1.getNumerador();
        int b = obj1.getDenominador();
        int c = obj2.getNumerador();
        int d = obj2.getDenominador();

        this.setNumerador(a * c);
        this.setDenominador(b * d);
        return this;
    }

    public Racional division(Racional obj1, Racional obj2) {
        int a = obj1.getNumerador();
        int b = obj1.getDenominador();
        int c = obj2.getNumerador();
        int d = obj2.getDenominador();

        this.setNumerador(a * d);
        this.setDenominador(b * c);
        return this;
    }

    //Método toString
    public String toString() {
        return numerador + "/" + denominador;
    }
}

