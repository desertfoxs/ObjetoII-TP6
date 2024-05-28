package Ejercicio4;

public class Tomate implements Hamburguesas{

    private Hamburguesas hamburguesas;
    private int costo = 50;

    public Tomate(Hamburguesas hamburguesas) {
        this.hamburguesas = hamburguesas;
    }

    @Override
    public String armarHamburguesas() {
        return hamburguesas.armarHamburguesas() + ", Agregado Tomate: " + costo;
    }
}
