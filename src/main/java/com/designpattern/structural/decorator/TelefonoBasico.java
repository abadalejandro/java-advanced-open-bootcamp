package com.designpattern.structural.decorator;

public class TelefonoBasico implements Telefono{
    @Override
    public void crear(){
        System.out.println("Soy un telefono basico. Tengo estas caracteristicas");
        this.tengoGSM();
        this.tengoSMS();
    }

    private void tengoGSM(){
        System.out.println("   -> basico: Tengo GSM");
    }

    private void tengoSMS(){
        System.out.println("   -> basico: Tengo SMS");
    }
}
