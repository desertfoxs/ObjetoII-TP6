package Ejercicio1;

public class AdapterElectrico implements Motor{

    Electrico autoE = new Electrico();

    @Override
    public void arrancar() {
        autoE.conectarActivar();
    }

    @Override
    public void acelerar() {
        autoE.moverMasRapido();
    }

    @Override
    public void apagar() {
        autoE.detenerDesconectar();
    }
}
