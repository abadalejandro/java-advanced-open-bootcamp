package com.designpattern.behavioral.mediator;


public class ColegaConcreto1 extends Colega{
    @Override
    void recibe() {
        System.out.println("He recibito un mensaje, soy ColegaConcreto1");
    }

    @Override
    void envia() {
        System.out.println("Soy ColegaConcreto1, envio un mensaje");
        super.mediator.reenvia(this);
    }
}
