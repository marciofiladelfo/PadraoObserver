package padroes.observer;

import lombok.Getter;

import java.util.Date;

@Getter
public class EventoChegadaAniversariante {

    private final Date momentoEvento;

    public EventoChegadaAniversariante(Date momentoEvento) {
        this.momentoEvento = momentoEvento;
    }


}
