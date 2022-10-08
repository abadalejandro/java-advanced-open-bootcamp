package com.designpattern.behavioral.iterator;

public class Main {
    public static void main(String[] args) {
        Usuarios usuarios = new Usuarios();
        usuarios.crear(new Usuario("uno", 5));
        usuarios.crear(new Usuario("dos", 15));
        usuarios.crear(new Usuario("tres", 25));
        usuarios.crear(new Usuario("cuatro", 35));
        usuarios.crear(new Usuario("cinco", 45));

        while(usuarios.hayMas()){
            Usuario usuario = usuarios.siquiente();
            System.out.println("Usuario es: " + usuario.getNombre());
        }


//        System.out.println(usuarios.hayMas());
//        System.out.println(usuarios.siquiente().toString());
//        System.out.println(usuarios.siquiente().toString());
//        System.out.println(usuarios.siquiente().toString());
//        usuarios.reinicia();
//        System.out.println("After reset: ");
//        System.out.println(usuarios.siquiente().toString());

    }
}
