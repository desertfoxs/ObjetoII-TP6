package Ejercicio1;

public class Main {

    public static void main(String[] args) {

        AdapterElectrico electrico = new AdapterElectrico();

        electrico.arrancar();
        electrico.acelerar();
        electrico.apagar();

    }
}
