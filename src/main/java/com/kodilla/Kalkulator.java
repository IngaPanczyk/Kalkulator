package com.kodilla;

public class Kalkulator {
    int b = 8;
    int a = 5;
    int c;
    public void add () {
        c = a + b;
    }
    public void subtract () {
        c = a - b;
    }

    public String toString(){
        return "wynik " + c;
    }

}

