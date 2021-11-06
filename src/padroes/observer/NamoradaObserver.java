package padroes.observer;

public class NamoradaObserver implements ObservadorChegadaAniversariante{
    @Override
    public void chegouAniversariante(EventoChegadaAniversariante evento) {
        System.out.println("Avisar os convidados.");
        System.out.println("Apagar as luzes.");
        System.out.println("Surpresa!!!");
    }
}
