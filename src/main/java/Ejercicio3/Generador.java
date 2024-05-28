package Ejercicio3;

import java.io.File;
import java.io.IOException;

public interface Generador {

    void export(File file, String url) throws IOException;
}
