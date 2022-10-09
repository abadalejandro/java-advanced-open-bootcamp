package com.designpattern.behavioral.strategy;

import com.designpattern.behavioral.iterator.Usuario;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int tipo = 0;

        UsuariosMemoria usuarios = new UsuariosMemoria();
//        UsuariosFichero usuarios = new UsuariosFichero();
        crear(usuarios,"Fulano");
        crear(usuarios,"Mengano");
        crear(usuarios,"Pepe");

        for (String usuario:usuarios.listar()) {
            System.out.println(usuario);
        }
    }

    public static void crear(Usuarios usuarios, String nombre){
        usuarios.crear(nombre);
    }

    public static ArrayList<String> listar(Usuarios usuarios){
        return usuarios.listar();
    }
}
