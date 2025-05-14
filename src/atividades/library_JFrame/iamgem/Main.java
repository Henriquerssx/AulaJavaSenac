package atividades.library_JFrame.iamgem;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Imagem");
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon icone = new ImageIcon("C:\\Users\\ercil\\Downloads\\R.jpeg");
        JLabel label = new JLabel(icone);
        frame.add(label);

        frame.setVisible(true);
    }
}
