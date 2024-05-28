package Ejercicio4;

import org.junit.jupiter.api.Test;

public class Prueba {

    @Test
    public void TestArmadoHamburguesa(){

        Hamburguesas hamburguesas = new Carne(new Tomate( new Queso( new Combo(2, "comboEspecial", 1500))));
        System.out.println(hamburguesas.armarHamburguesas());
    }

    @Test
    public void TestArmadoHamburguesaBuilder(){

        //Hamburguesas hamburguesas = new Carne(new Tomate( new Queso( new Combo(2, "comboEspecial", 1500))));
        var builder = new Builder(new Combo(2, "comboEspecial", 1500));
        String hambuerguesa = builder.conTomate().conQueso().conCarne().pedirHamburguesa().armarHamburguesas();

        System.out.println(hambuerguesa);
    }

}
