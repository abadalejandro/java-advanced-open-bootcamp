package com.designpattern.behavioral.observer;

public class ReceptorRadio implements Receptor{
    @Override
    public void recibe() {
        System.out.println("Señal recibida en radio");
    }
}
