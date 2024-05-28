package Ejercicio3;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Report implements Generador{

    private String reporte;
    private String url;

    public Report(String reporte, String url) {
        this.reporte = reporte;
        this.url = url;
    }

    @Override
    public void export(File file, String url) throws IOException {
        Files.writeString(Paths.get(url+ reporte), "\n"+ file.getName() + "\n", StandardOpenOption.CREATE);
    }

    public String urlCompleta(){
        return url+ reporte;
    }
}
