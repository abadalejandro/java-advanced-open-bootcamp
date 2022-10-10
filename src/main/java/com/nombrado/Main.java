package com.nombrado;

import javax.swing.*;
import java.util.Hashtable;

public class Main {
    public static void main(String[] args) {

    }




}

// Las classes se nombran con sustantivos
class ReverseString{}
class UserManager{
    private int contador = 0;

    // Constantes en mayusculas separadas con guion
    public static final int MAX_USERS = 15;

    // Metodos son verbos con camel case
    public void createUser(){
        int []aNumeros = {1,2,3,4,5};
        boolean bEsDeDia = false;
        char cletra = 'a';
        double dValor = 5.1d;
        Hashtable<String, Integer> hUsuarios = new Hashtable();

        int iValores = 5;
        long iValoresLong = 5;

        String sCadena = "Hola, mundo";
        var vVariable = 5;
        byte byByte = 1;
        float flFloat = 1.5f;

        JButton btnBotonAceptar;
        JButton btnBotonCancelar;
        JLabel lblLabel;
    }

}

// Las interfaces se nombran con adjetivos
// si estan en ingles terminan en "able"
// si estan en castellano terminan en "ador"
interface Iterable{}
interface Serializable{}
interface Iterador{}
interface Serializador{}



