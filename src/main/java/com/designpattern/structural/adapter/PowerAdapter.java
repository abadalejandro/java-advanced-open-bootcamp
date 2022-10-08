package com.designpattern.structural.adapter;

public class PowerAdapter implements Enchufable{
    public Lightbulb lightbulb = new Lightbulb();
    @Override
    public void enciende() {
        lightbulb.turnOn(110);
    }

    @Override
    public void apaga() {
        lightbulb.turnOff();

    }

    @Override
    public boolean estaEncendido() {
       lightbulb.isPoweredOn();
       return true;
    }
}
