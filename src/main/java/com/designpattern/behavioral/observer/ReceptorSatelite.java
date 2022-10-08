package com.designpattern.behavioral.observer;

public class ReceptorSatelite implements Receptor{
    @Override
    public void recibe() {
        System.out.println("Señal recibida en satelite");
    }
}
