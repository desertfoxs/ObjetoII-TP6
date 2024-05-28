package Ejercicio5;

public class EnviarGmailFelicitaciones implements EnviarMensaje {

    EnviarMensaje enviarMensaje;

    public EnviarGmailFelicitaciones(EnviarMensaje enviarMensaje) {
        this.enviarMensaje = enviarMensaje;
    }

    @Override
    public void enviar(String registro) {
        registro = registro + "usted fue registrado en el concurso FELICITACIONES \n";
        this.enviarMensaje.enviar(registro);
    }
}
