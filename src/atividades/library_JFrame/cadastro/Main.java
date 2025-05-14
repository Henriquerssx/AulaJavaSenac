package atividades.library_JFrame.cadastro;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Cadastro");

        JLabel nomeLabel = new JLabel("Nome:");
        JTextField nomeField = new JTextField(20);
        JLabel idadeLabel = new JLabel("Idade:");
        JTextField idadeField = new JTextField(20);
        JButton cadastrarButton = new JButton("Cadastrar");

        cadastrarButton.addActionListener(e -> {
            String nome = nomeField.getText();
            String idade = idadeField.getText();
            JOptionPane.showMessageDialog(frame, "Cadastro realizado com sucesso para " + nome + ", idade " + idade + ".");
        });

        JPanel panel = new JPanel();
        panel.add(nomeLabel);
        panel.add(nomeField);
        panel.add(idadeLabel);
        panel.add(idadeField);
        panel.add(cadastrarButton);

        frame.add(panel);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
