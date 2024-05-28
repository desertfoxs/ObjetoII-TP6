package Ejercicio4;

public class Combo implements Hamburguesas{

    public static final int BASICO = 0;
    public final static int FAMILIAR = 1;
    public final static int ESPECIAL = 2;

    private String nombre;
    private String descripcion;
    private int precio;

    public Combo(int tipoCombo, String descripcion, int precio) {
        this.nombre = nombreCombo(tipoCombo);
        this.descripcion = descripcion;
        this.precio = precio;
    }

    private String nombreCombo(int tipoSeguro) {
        if(tipoSeguro == BASICO){
            return "Basico";
        }
        if(tipoSeguro == FAMILIAR){
            return "Familiar";
        }

        //tipoSeguro == ESPECIAL
        return "Especial";
    }

    public int getPrecio(){
        return precio;
    }
    public String getNombre() {
        return nombre;
    }

    @Override
    public String armarHamburguesas() {
        return nombre + " " + precio;
    }

}
