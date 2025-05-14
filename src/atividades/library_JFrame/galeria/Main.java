package atividades.library_JFrame.galeria;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main {
    private int currentImage = 0;
    private JLabel imageLabel;
    private String[] images = {
            "C:\\Users\\ercil\\Downloads\\R.jpeg",
            "C:\\Users\\ercil\\Downloads\\Captura de tela 2025-05-13 212326.png",
            "C:\\Users\\ercil\\Downloads\\R.png"
    };

    public static void main(String[] args) {
        new Main().createAndShowGUI();
    }

    public void createAndShowGUI() {
        JFrame frame = new JFrame("Galeria de Imagens");

        imageLabel = new JLabel(new ImageIcon(images[currentImage]));

        JButton nextButton = new JButton("Próxima");
        JButton prevButton = new JButton("Anterior");

        nextButton.addActionListener(e -> {
            currentImage = (currentImage + 1) % images.length;
            imageLabel.setIcon(new ImageIcon(images[currentImage]));
        });

        prevButton.addActionListener(e -> {
            currentImage = (currentImage - 1 + images.length) % images.length;
            imageLabel.setIcon(new ImageIcon(images[currentImage]));
        });

        JPanel panel = new JPanel();
        panel.add(prevButton);
        panel.add(imageLabel);
        panel.add(nextButton);

        frame.add(panel);
        frame.setSize(100, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}