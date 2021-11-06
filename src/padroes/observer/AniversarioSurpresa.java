package padroes.observer;

public class AniversarioSurpresa {

    public static void main(String[] args) {
        NamoradaObserver namoradaObserver = new NamoradaObserver();
        PorteiroSubject porteiroSubject = new PorteiroSubject();

        porteiroSubject.registrarObservador(namoradaObserver);
        porteiroSubject.monitorar();
    }
}
