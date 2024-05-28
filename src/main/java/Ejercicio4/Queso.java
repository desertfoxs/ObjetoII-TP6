package Ejercicio4;

public class Queso implements Hamburguesas{
    private Hamburguesas hamburguesas;
    private int costo = 250;

    public Queso(Hamburguesas hamburguesas) {
        this.hamburguesas = hamburguesas;
    }

    @Override
    public String armarHamburguesas() {
        return hamburguesas.armarHamburguesas() + ", Agregado Queso: " + costo;
    }
}
