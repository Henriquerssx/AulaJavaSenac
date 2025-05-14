package atividades.library_JFrame.menu_simples;

import javax.swing.*;

public class Main{
    public static void main(String[] args) {
        JFrame frame = new JFrame("Menu Simples");
        JMenuBar menuBar = new JMenuBar();

        // Menu Arquivo
        JMenu arquivoMenu = new JMenu("Aba");
        JMenuItem novoItem = new JMenuItem("Novo");
        JMenuItem sairItem = new JMenuItem("Sair");

        novoItem.addActionListener(e -> {
            JFrame novaJanela = new JFrame("Nova Janela");
            novaJanela.setSize(400, 300);
            novaJanela.setVisible(true);
        });

        sairItem.addActionListener(e -> System.exit(0));

        arquivoMenu.add(novoItem);
        arquivoMenu.add(sairItem);

        // Menu Ajuda
        JMenu ajudaMenu = new JMenu("Ajuda");
        JMenuItem sobreItem = new JMenuItem("Sobre");

        sobreItem.addActionListener(e -> JOptionPane.showMessageDialog(frame, "Autor: José Henrique\nProjeto: Menu"));

        ajudaMenu.add(sobreItem);

        menuBar.add(arquivoMenu);
        menuBar.add(ajudaMenu);

        frame.setJMenuBar(menuBar);
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}