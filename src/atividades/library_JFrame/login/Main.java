package atividades.library_JFrame.login;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Login");

        JTextField usuarioField = new JTextField(20);
        JPasswordField senhaField = new JPasswordField(20);
        JButton entrarButton = new JButton("Entrar");

        entrarButton.addActionListener(e -> {
            String usuario = usuarioField.getText();
            String senha = new String(senhaField.getPassword());

            if ("adm".equals(usuario) && "12345".equals(senha)) {
                JOptionPane.showMessageDialog(frame, "Acesso autorizado");
            } else {
                JOptionPane.showMessageDialog(frame, "Usuário ou senha incorretos");
            }
        });

        JPanel panel = new JPanel();
        panel.add(new JLabel("Usuário:"));
        panel.add(usuarioField);
        panel.add(new JLabel("Senha:"));
        panel.add(senhaField);
        panel.add(entrarButton);

        frame.add(panel);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}