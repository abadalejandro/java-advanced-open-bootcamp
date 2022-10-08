package com.designpattern.creational.singleton;

public class Main {
    public static void main(String[] args) {
//        Singleton singleton = Singleton.getInstance();
//        singleton.setContador(15);
//        System.out.println(singleton.getContador());
//        System.out.println(singleton);
//
//        Singleton singleton2 = Singleton.getInstance();
//        System.out.println(singleton2.getContador());
//        System.out.println(singleton2);

        // *****************************************

        Aplicacion aplicacion = Aplicacion.getInstance();
        Aplicacion aplicacion2 = Aplicacion.getInstance();

        aplicacion.Run();
        aplicacion2.Run();

        System.out.println(aplicacion);
        System.out.println(aplicacion2);



    }
}
