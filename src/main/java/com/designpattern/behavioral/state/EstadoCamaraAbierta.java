package com.designpattern.behavioral.state;

public class EstadoCamaraAbierta extends Estado{
    public EstadoCamaraAbierta(Telefono telefono) {
        super(telefono);
    }

    @Override
    public String desbloquear() {
        return "desbloquera(): Ya estaba desbloqueado el movil";
    }

    @Override
    public String abrirCamara() {
        return "abrirCamara(): La camara ya la habias abierto";
    }

    @Override
    public String hacerFoto() {
        telefono.cambiaEstado(new EstadoHacerFoto(telefono));
        return "hacerFoto(): La foto se va a disparar ya";
    }
}
