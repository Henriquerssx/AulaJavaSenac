package atividades.library_JFrame.editor_texto;
import javax.swing.*;
public class Main {

        public static void main(String[] args) {
            JFrame frame = new JFrame("Editor de Texto");

            JTextArea textArea = new JTextArea(20, 40);
            JScrollPane scrollPane = new JScrollPane(textArea);

            JMenuBar menuBar = new JMenuBar();
            JMenu arquivoMenu = new JMenu("Arquivo");
            JMenuItem novoItem = new JMenuItem("Novo");
            JMenuItem salvarItem = new JMenuItem("Salvar");
            JMenuItem sairItem = new JMenuItem("Sair");

            novoItem.addActionListener(e -> textArea.setText(""));
            salvarItem.addActionListener(e -> JOptionPane.showMessageDialog(frame, "Texto salvo"));
            sairItem.addActionListener(e -> System.exit(0));

            arquivoMenu.add(novoItem);
            arquivoMenu.add(salvarItem);
            arquivoMenu.add(sairItem);
            menuBar.add(arquivoMenu);

            frame.setJMenuBar(menuBar);
            frame.add(scrollPane);
            frame.setSize(500, 400);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        }
    }

