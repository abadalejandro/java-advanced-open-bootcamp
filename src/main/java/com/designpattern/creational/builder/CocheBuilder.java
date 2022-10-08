package com.designpattern.creational.builder;

public class CocheBuilder {
    Vehiculo vehiculo;
    public CocheBuilder(String marca){
        vehiculo = new Vehiculo();
        vehiculo.marca = marca;
    }

    public CocheBuilder setPuertas(int puertas){
        vehiculo.puertas = puertas;
        return this;
    }
    public CocheBuilder setMotor(String motor){
        vehiculo.motor = motor;
        return this;
    }

    public CocheBuilder setTipo(String tipo){
        vehiculo.tipo = tipo;
        return this;
    }

    public Vehiculo build(){
        return this.vehiculo;
    }
}
