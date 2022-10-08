package com.designpattern.behavioral.observer;

public class Main {
    public static void main(String[] args) {
        Emisora emisora = new Emisora();

        ReceptorTV tv = new ReceptorTV();
        ReceptorRadio radio = new ReceptorRadio();
        ReceptorSatelite satelite = new ReceptorSatelite();

        emisora.meteReceptor(tv);
        emisora.meteReceptor(tv);
        emisora.meteReceptor(satelite);

        emisora.emite();
    }
}
