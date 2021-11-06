package padroes.observer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class PorteiroSubject {

    private List<ObservadorChegadaAniversariante> observadores = new ArrayList<>();

    public void registrarObservador(ObservadorChegadaAniversariante observer){
        observadores.add(observer);
    }

    public void monitorar(){
        Scanner entrada = new Scanner(System.in);
        String valor = "";

        /* Laço para sair do menu */
        while (!"sair".equalsIgnoreCase(valor)){
            System.out.print("Aniversariante chegou?  ");
            valor = entrada.nextLine();

            if ("sim".equalsIgnoreCase(valor)){
                /*Criando evento pois o aniversariante chegou*/
                EventoChegadaAniversariante evento = new EventoChegadaAniversariante(new Date());

                /*Notificar observadores*/
                observadores.stream().forEach(o -> o.chegouAniversariante(evento));

                valor = "sair";
            }else {
                System.out.println("Alarme falso!!!");
            }
        }
        entrada.close();
    }
}
