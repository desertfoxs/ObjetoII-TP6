package Ejercicio3;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class ReportSobreEscribir implements Generador{

    private Generador generador;
    public ReportSobreEscribir(Generador generador) {
        this.generador = generador;
    }

    public void export(File file, String url) throws IOException {
        this.generador.export(file, url);

        if (file == null) {
            throw new IllegalArgumentException(
                    "File es NULL; no puedo exportar..."
            );
        }
        if (Files.notExists(Path.of(url))) {
            //Files.writeString(Paths.get(url), "\n"+ file.getName() + "\n", StandardOpenOption.CREATE);
            this.generador.export(file, url);
        }
        else{
            //Files.writeString(Paths.get(url), file.getName(), StandardOpenOption.CREATE);
            this.generador.export(file, url);
        }
    }

}
