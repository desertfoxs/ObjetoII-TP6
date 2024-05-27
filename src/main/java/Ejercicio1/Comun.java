package Ejercicio1;

public class Comun implements Motor {


    @Override
    public void arrancar() {
        System.out.println("arranco el auto");
    }

    @Override
    public void acelerar() {
        System.out.println("el auto acelero");
    }

    @Override
    public void apagar() {
        System.out.println("El auto se apago");
    }
}
