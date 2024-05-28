package Ejercicio4;

public class Papa  implements Hamburguesas{
    private Hamburguesas hamburguesas;
    private int costo = 150;

    public Papa(Hamburguesas hamburguesas) {
        this.hamburguesas = hamburguesas;
    }

    @Override
    public String armarHamburguesas() {
        return hamburguesas.armarHamburguesas() + ", Agregado Papa: " + costo;
    }
}
