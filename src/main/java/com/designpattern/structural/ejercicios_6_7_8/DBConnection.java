package com.designpattern.structural.ejercicios_6_7_8;

public class DBConnection {
    private static DBConnection dbConnection;

    boolean isRunning = false;

    public static DBConnection getInstance(){
        if(dbConnection == null){
            dbConnection = new DBConnection();
        }

        return dbConnection;
    }

    private DBConnection(){};


    public void Run() {
        if (!isRunning) {
            System.out.println("Arrancando");
            isRunning = true;
        }else{
            System.out.println("Ya esta en ejecución");
        }
    }
}
