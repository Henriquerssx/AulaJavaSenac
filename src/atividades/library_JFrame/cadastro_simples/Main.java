package atividades.library_JFrame.cadastro_simples;

import javax.swing.*;

public class Main{
    public static void main(String[] args) {
        JFrame mainFrame = new JFrame("Janela Principal");

        JButton novoCadastroButton = new JButton("Novo Cadastro");

        novoCadastroButton.addActionListener(e -> {
            new CadastroFrame();
        });

        mainFrame.add(novoCadastroButton);
        mainFrame.setSize(300, 200);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setVisible(true);
    }

    static class CadastroFrame {
        public CadastroFrame() {
            JFrame cadastroFrame = new JFrame("Cadastro");

            JTextField nomeField = new JTextField(20);
            JTextField idadeField = new JTextField(20);
            JRadioButton masculino = new JRadioButton("Masculino");
            JRadioButton feminino = new JRadioButton("Feminino");
            ButtonGroup grupoGenero = new ButtonGroup();
            grupoGenero.add(masculino);
            grupoGenero.add(feminino);

            JButton salvarButton = new JButton("Salvar");

            salvarButton.addActionListener(e -> {
                JOptionPane.showMessageDialog(cadastroFrame, "Cadastro realizado com sucesso!");
                cadastroFrame.dispose();
            });

            JPanel panel = new JPanel();
            panel.add(new JLabel("Nome:"));
            panel.add(nomeField);
            panel.add(new JLabel("Idade:"));
            panel.add(idadeField);
            panel.add(masculino);
            panel.add(feminino);
            panel.add(salvarButton);

            cadastroFrame.add(panel);
            cadastroFrame.setSize(300, 200);
            cadastroFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            cadastroFrame.setVisible(true);
        }
    }
}