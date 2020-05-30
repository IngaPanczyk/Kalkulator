package com.kodilla;

import org.springframework.boot.SpringApplication;

public class CalcRunner {
    public static void main(String[] args) {
        Kalkulator kalkulator = new Kalkulator();
        kalkulator.add();
        System.out.println(kalkulator);
        kalkulator.subtract();
        System.out.println(kalkulator);
    }
}
