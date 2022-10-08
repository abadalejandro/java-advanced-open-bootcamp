package com.designpattern.structural.decorator;

public class TelefonoInteligente extends TelefonoDecorator{
    public TelefonoInteligente(Telefono telefono) {
        super(telefono);
    }

    @Override
    public void crear(){
        super.crear();
        System.out.println("   -> Inteligente: Tengo tambien 4G");
    }
}
