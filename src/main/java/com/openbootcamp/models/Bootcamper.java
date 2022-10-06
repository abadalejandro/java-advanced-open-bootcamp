package com.openbootcamp.models;

// POJO => Plain old java object
public class Bootcamper {
    private String nombre;
    private String apellido;
    private double value;

    public Bootcamper() {
    }

    public Bootcamper(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.value = Math.ceil(Math.random() * 10);
    }

    public String getNombre() {
        return nombre;
    }

    public double getValue() {
        return value;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
