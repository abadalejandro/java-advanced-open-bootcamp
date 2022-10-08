package com.designpattern.creational.builder;

public class Main {
    public static void main(String[] args) {
//        Vehiculo vehiculo = new Vehiculo();
//        vehiculo.setMarca("Renault");
//        vehiculo.setMotor("Diesel");
//        vehiculo.setTipo("Combustion");
//        vehiculo.setPuertas(5);

//        Vehiculo coche = new CocheBuilder("Fiat").build();
        Vehiculo coche = new CocheBuilder("Fiat")
                .setMotor("Electrico")
                .setTipo("Electricidad")
                .setPuertas(4)
                .build();

        System.out.println(coche.toString());

    }
}
