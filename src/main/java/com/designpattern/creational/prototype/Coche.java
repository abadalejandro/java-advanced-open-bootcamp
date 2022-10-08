package com.designpattern.creational.prototype;

public class Coche implements Cloneable{
    public String marca;
    public String modelo;
    int puertas;

    public Coche(){

    }

    public Coche clonar() throws CloneNotSupportedException{
//        Coche cocheClone = new Coche();
//        cocheClone.marca = this.marca;
//        cocheClone.modelo = this.modelo;
//        cocheClone.puertas = this.puertas;
//        return cocheClone;
        return (Coche)this.clone();
    }

    @Override
    public String toString() {
        return "Coche{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", puertas=" + puertas +
                '}';
    }
}
