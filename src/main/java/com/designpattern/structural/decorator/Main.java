package com.designpattern.structural.decorator;

public class Main {
    public static void main(String[] args) {
//        TelefonoBasico telefonoBasico = new TelefonoBasico();
//        telefonoBasico.crear();

        TelefonoInteligente ti = new TelefonoInteligente(new TelefonoBasico());
        ti.crear();

        System.out.println("********************************************");

        TelefonoNextGen tng = new TelefonoNextGen((new TelefonoInteligente(new TelefonoBasico())));
        tng.crear();
    }
}
