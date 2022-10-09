package com.refactoring;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numeros = {12, 23, 45, 1, 9, 0, -4};

        imprimeMayorYMenor(numeros);
    }

    public static void imprimeMayorYMenor(int[] numeros) {
        int mayor = Arrays.stream(numeros).reduce(0, (a, b) -> (a > b) ? a : b );
        int menor = Arrays.stream(numeros).reduce(numeros[0], (a, b) -> (a < b) ? a : b );

        System.out.println("Mayor: " + mayor + " Menor: " + menor);
    }

    public static int ifAnidado1(){
        int valor1 = 10;
        int valor2 = 10;
        if(valor1 > valor2){
            return valor1;
        }else{
            return valor2;
        }
    }

}
