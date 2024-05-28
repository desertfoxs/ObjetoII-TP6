package Ejercicio3;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ReportUnico implements Generador{


    private Generador generador;

    public ReportUnico(Generador generador) {
        this.generador = generador;
    }

    @Override
    public void export(File file, String url) throws IOException {
        this.generador.export(file, url);

        if (file == null) {
            throw new IllegalArgumentException(
                    "File es NULL; no puedo exportar..."
            );
        }
        if (Files.notExists(Path.of(url))) {
            //Files.writeString(Paths.get(url+ reporte), "\n"+ file.getName() + "\n", StandardOpenOption.CREATE);
            this.generador.export(file, url);
        }
        else{
            throw new IllegalArgumentException(
                    "El archivo ya existe..."
            );
        }
    }
}
