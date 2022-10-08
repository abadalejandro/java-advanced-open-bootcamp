package com.designpattern.creational.factory;

public class PrecioFactory {
    private Precio precio;

    private PrecioFactory() {
    }

    ;

    public PrecioFactory(String pais) {
        if (pais.equalsIgnoreCase("españa")) {
            System.out.println("España precio en EUR");
            this.precio = new PrecioEUR();
        } else if (pais.equalsIgnoreCase("uk")) {
            System.out.println("UK precio en GRP");
            this.precio = new PrecioGBP();
        } else {
            System.out.println("Otro pais precio en USD");
            this.precio = new PrecioUSD();
        }
    }

    public double getPrecio() {
        return precio.getPrecio();
    }


}
