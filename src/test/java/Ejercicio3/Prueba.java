package Ejercicio3;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

public class Prueba {

    @Test
    public void TestExportarUnico(){
        File file = new File("holaMundo");
        Generador reporte = new ReportUnico(new Report("reporte.txt", "C:/Users/desertfoxs/Desktop/txt Tp6/"));
        try{
            reporte.export(file, "C:/Users/desertfoxs/Desktop/txt Tp6/reporte.txt");
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void TestExportarSobreEscribir(){
        File file = new File("holaMundo");
        Generador reporte = new ReportSobreEscribir(new Report("reporte.txt", "C:/Users/desertfoxs/Desktop/txt Tp6/"));
        try{
            reporte.export(file, "C:/Users/desertfoxs/Desktop/txt Tp6/reporte.txt");
            reporte.export(file, "C:/Users/desertfoxs/Desktop/txt Tp6/reporte.txt");
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
