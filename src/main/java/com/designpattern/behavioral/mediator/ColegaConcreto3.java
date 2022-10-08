package com.designpattern.behavioral.mediator;

public class ColegaConcreto3 extends Colega{
    @Override
    void recibe() {
        System.out.println("He recibito un mensaje, soy ColegaConcreto3");
    }

    @Override
    void envia() {
        System.out.println("Soy ColegaConcreto3, envio un mensaje");
        super.mediator.reenvia(this);
    }
}
