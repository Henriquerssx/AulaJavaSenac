package atividades.library_JFrame.botao;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Entrada de Nome");
        frame.setSize(400, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel label = new JLabel("Digite seu nome:");
        label.setBounds(10, 10, 150, 25);
        JTextField textField = new JTextField();
        textField.setBounds(150, 10, 200, 25);
        JButton button = new JButton("Enviar");
        button.setBounds(150, 50, 100, 30);

        button.addActionListener(e -> {
            String nome = textField.getText();
            JOptionPane.showMessageDialog(frame, "Você digitou: " + nome);
        });

        frame.add(label);
        frame.add(textField);
        frame.add(button);
        frame.setVisible(true);
    }
}