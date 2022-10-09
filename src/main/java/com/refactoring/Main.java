package com.refactoring;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        int[] numeros = {12, 23, 45, 1, 9, 0, -4};
//        imprimeMayorYMenor(numeros);

//        ConstructorLargo myCar = new ConstructorLargo("Renault", "Megan", "Nafta", 5);
//        ConstructorLargoBuilder myCar2 = new ConstructorLargoBuilder("Fiat").conModelo("Punto").conMotor("Gasoil").conPuertas(4);
//        esOracleJavaEnMacOS();

    }

    public static boolean esOracleJavaEnMacOS() {
        boolean runtimeOracle = System.getProperty("java.runtime.name").contains("Oracle");
        boolean osVersion = System.getProperty("os.version").compareTo("11.6") == 0;
        if (runtimeOracle && osVersion) {
            return true;
        }
        return false;
    }

    public boolean hoyEsDomingo(int numero) {
        boolean isDomingo = (numero == 7) ? true : false;
        if (isDomingo) {
            System.out.println(isDomingo);
        }

        return isDomingo;
    }


    public static void imprimeMayorYMenor(int[] numeros) {
        int mayor = Arrays.stream(numeros).reduce(0, (a, b) -> (a > b) ? a : b);
        int menor = Arrays.stream(numeros).reduce(numeros[0], (a, b) -> (a < b) ? a : b);

        System.out.println("Mayor: " + mayor + " Menor: " + menor);
    }

    public static int ifAnidado1() {
        int valor1 = 10;
        int valor2 = 10;
        if (valor1 > valor2) {
            return valor1;
        }

        return valor2;

    }

}
