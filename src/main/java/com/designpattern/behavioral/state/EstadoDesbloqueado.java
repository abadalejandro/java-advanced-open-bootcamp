package com.designpattern.behavioral.state;

public class EstadoDesbloqueado extends Estado{
    public EstadoDesbloqueado(Telefono telefono) {
        super(telefono);
    }

    @Override
    public String desbloquear() {
        return "desbloquear(): El movil ya estaba desbloqueado";
    }

    @Override
    public String abrirCamara() {
        telefono.cambiaEstado(new EstadoCamaraAbierta(telefono));
        return "abrirCamara(): La camara esta abierta";
    }

    @Override
    public String hacerFoto() {
        return "hacerFoto(): No se puede hacer una foto sin abrir la camara";
    }
}
