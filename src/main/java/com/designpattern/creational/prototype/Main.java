package com.designpattern.creational.prototype;

public class Main {
    public static void main(String[] args) {
        Coche coche = new Coche();
        coche.marca = "Fiat";
        coche.puertas = 5;
        coche.modelo = "Punto";
        System.out.println(coche.toString());
        try {
            Coche clonado = coche.clonar();
            clonado.puertas = 4;
            System.out.println(clonado.toString());
        }catch(CloneNotSupportedException e){
            System.out.println("No se puede clonar: " + e.getMessage());
        }
    }
}
