package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Observador {

    public static void main(String[] args) {

        JFrame janela = new JFrame("Observador"); //Cria uma nova janela
        janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Altera o comportamento padrão para encerrar a aplicação ao fechar a janela
        janela.setSize(600, 200); // Dimensiona o tamanha da janela
        janela.setLayout(new FlowLayout()); // Cria um layout padrão
        janela.setLocationRelativeTo(null); // Centraliza na tela

        JButton botao = new JButton("Clicar");
        janela.add(botao);

        /** Criado evento no botão utilizando uma classe anônima,
         * a qual pode ser trandormada em uma lambda por ser uma FunctionalInterface.
         */
        botao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Evento ocorreu");
            }
        });

        janela.setVisible(true);
    }
}
