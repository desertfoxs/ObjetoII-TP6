package Ejercicio4;

public class Carne  implements Hamburguesas{
    private Hamburguesas hamburguesas;
    private int costo = 250;

    public Carne(Hamburguesas hamburguesas) {
        this.hamburguesas = hamburguesas;
    }

    @Override
    public String armarHamburguesas() {
        return hamburguesas.armarHamburguesas() + ", Agregado Carne: " + costo;
    }
}
