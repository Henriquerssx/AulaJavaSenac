package atividades.library_JFrame.layout;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Layout com Componentes");

        JLabel titulo = new JLabel("Escolha uma opção", JLabel.CENTER);

        JRadioButton op1 = new JRadioButton("Opção 1");
        JRadioButton op2 = new JRadioButton("Opção 2");
        JRadioButton op3 = new JRadioButton("Opção 3");

        ButtonGroup group = new ButtonGroup();
        group.add(op1);
        group.add(op2);
        group.add(op3);

        JButton confirmarButton = new JButton("Confirmar");

        JTextArea resultadoArea = new JTextArea(5, 20);
        resultadoArea.setEditable(false);

        confirmarButton.addActionListener(e -> {
            if (op1.isSelected()) {
                resultadoArea.setText("Você escolheu a Opção 1.");
            } else if (op2.isSelected()) {
                resultadoArea.setText("Você escolheu a Opção 2.");
            } else if (op3.isSelected()) {
                resultadoArea.setText("Você escolheu a Opção 3.");
            }
        });

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.add(titulo);
        panel.add(op1);
        panel.add(op2);
        panel.add(op3);
        panel.add(confirmarButton);
        panel.add(new JScrollPane(resultadoArea));

        frame.add(panel);
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
