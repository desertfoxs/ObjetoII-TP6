package Ejercicio2;

import java.awt.*;

public class AdapterGraphics implements Panel{

    private Graphics graphics;
    private Graphics2D g2d;

    public AdapterGraphics(Graphics graphics) {
        this.graphics = graphics;
        g2d = (Graphics2D) graphics;
    }
    @Override
    public void pintarCirculo(Coordenada coordenada, int radio) {

        g2d.drawOval(coordenada.x() - radio,
                coordenada.y() - radio,
                radio * 2,
                radio * 2);
    }

    @Override
    public void pintarLinea(Coordenada coordenada, int longitud) {
            g2d.drawLine(coordenada.x(), coordenada.y(), coordenada.x() + longitud, coordenada.y());
    }

    @Override
    public void pintarTexto(Coordenada coordenada, String texto) {
        g2d.drawString(texto, coordenada.x(), coordenada.y());
    }
}
