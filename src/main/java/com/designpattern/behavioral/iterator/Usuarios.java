package com.designpattern.behavioral.iterator;

import java.util.ArrayList;

public class Usuarios implements UsuarioIterator {
    private ArrayList<Usuario> usuarios = new ArrayList<>();
    private int posicion = 0;

    public void crear(Usuario usuario) {
        this.usuarios.add(usuario);
    }

    @Override
    public boolean hayMas() {
        return posicion < usuarios.size();
    }

    @Override
    public void reinicia() {
        posicion = 0;
    }

    @Override
    public Usuario siquiente() {
        Usuario usuario = this.usuarios.get(posicion);
        posicion++;
        return usuario;
    }

}
