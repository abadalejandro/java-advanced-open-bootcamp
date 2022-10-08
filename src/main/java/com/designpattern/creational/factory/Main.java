package com.designpattern.creational.factory;

public class Main {
    public static void main(String[] args) {
        PrecioFactory precioEUR = new PrecioFactory("españa");
        System.out.println(precioEUR.getPrecio());

        PrecioFactory precioUSD = new PrecioFactory("usa");
        System.out.println(precioUSD.getPrecio());

        PrecioFactory precioUK = new PrecioFactory("uk");
        System.out.println(precioUK.getPrecio());
    }
}
