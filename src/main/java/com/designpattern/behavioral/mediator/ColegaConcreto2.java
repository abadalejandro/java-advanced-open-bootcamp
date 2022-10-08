package com.designpattern.behavioral.mediator;

public class ColegaConcreto2 extends Colega{
    @Override
    void recibe() {
        System.out.println("He recibito un mensaje, soy ColegaConcreto2");
    }

    @Override
    void envia() {
        System.out.println("Soy ColegaConcreto2, envio un mensaje");
        super.mediator.reenvia(this);
    }
}
