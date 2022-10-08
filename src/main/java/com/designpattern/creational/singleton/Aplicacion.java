package com.designpattern.creational.singleton;

public class Aplicacion {
    private static Aplicacion aplicacion;
    boolean isRunning = false;

    private Aplicacion(){}

    public static Aplicacion getInstance(){
        if(aplicacion == null){
            aplicacion = new Aplicacion();
        }

        return aplicacion;
    }

    public void Run() {
        if (!isRunning) {
            System.out.println("Arrancando");
            isRunning = true;
        }else{
            System.out.println("Ya esta en ejecución");
        }
    }
}
