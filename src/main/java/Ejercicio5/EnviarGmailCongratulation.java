package Ejercicio5;

public class EnviarGmailCongratulation implements EnviarMensaje{

    EnviarMensaje enviarMensaje;

    public EnviarGmailCongratulation(EnviarMensaje enviarMensaje) {
        this.enviarMensaje = enviarMensaje;
    }


    @Override
    public void enviar(String registro) {
        registro = registro + "you were registered in the contest CONGRATULATIONS \n";
        this.enviarMensaje.enviar(registro);
    }
}
