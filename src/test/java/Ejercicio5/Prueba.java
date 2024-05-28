package Ejercicio5;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Prueba {

    @Test
    public void registroParticipanteDecoratorEspañol() {

        var enviador = new EnviarGmailFelicitaciones(new EnviarGmail());

        Participante participante0 = new Participante("Angel", 44705032);
        Concurso concurso0 = new Concurso(2, "Boletira", LocalDateTime.now().plusMonths(1), enviador);
        concurso0.inscribir(participante0);

    }
    @Test
    public void registroParticipanteDecoratorIngles() {

        var enviador = new EnviarGmailCongratulation(new EnviarGmail());

        Participante participante0 = new Participante("Angel", 44705032);
        Concurso concurso0 = new Concurso(2, "Boletira", LocalDateTime.now().plusMonths(1), enviador);
        concurso0.inscribir(participante0);

    }

    @Test
    public void registroParticipanteDecoratorInglesEspañol() {

        var enviador = new EnviarGmailFelicitaciones(new EnviarGmailCongratulation(new EnviarGmail()));

        Participante participante0 = new Participante("Angel", 44705032);
        Concurso concurso0 = new Concurso(2, "Boletira", LocalDateTime.now().plusMonths(1), enviador);
        concurso0.inscribir(participante0);

    }


}
