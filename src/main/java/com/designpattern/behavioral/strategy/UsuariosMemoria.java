package com.designpattern.behavioral.strategy;

import java.util.ArrayList;

public class UsuariosMemoria implements Usuarios{
    private ArrayList<String> usuarios = new ArrayList<>();

    public void crear(String nombre){
        usuarios.add(nombre);
    }

    public ArrayList<String> listar(){
        return usuarios;
    }
}
