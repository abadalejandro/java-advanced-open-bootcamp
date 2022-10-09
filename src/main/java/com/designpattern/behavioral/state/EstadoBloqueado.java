package com.designpattern.behavioral.state;

public class EstadoBloqueado extends Estado{
    public EstadoBloqueado(Telefono telefono) {
        super(telefono);
    }

    @Override
    public String desbloquear() {
        telefono.cambiaEstado(new EstadoDesbloqueado(telefono));
        return "desbloquer(): Movil desbloqueado";
    }

    @Override
    public String abrirCamara() {
//        telefono.cambiaEstado(new EstadoCamaraAbierta(telefono));
        return "abrirCamara(): La camara esta bloqueada. Desbloquea el movil antes";
    }

    @Override
    public String hacerFoto() {
//        telefono.cambiaEstado(new EstadoHacerFoto(telefono));
        return "hacerFoto(): La camara esta bloqueada. Desbloquea el movil antes";
    }
}
