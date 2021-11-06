package padroes.observer;

@FunctionalInterface
public interface ObservadorChegadaAniversariante {

    /** Interface de um único método -> Functional Interface.
     * Pode ser anotada com @FunctionalInterface. */
    void chegouAniversariante(EventoChegadaAniversariante evento);
}
