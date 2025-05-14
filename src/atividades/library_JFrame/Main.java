/*
package atividades.library_JFrame;

import javax.swing.*;

public class janelaBasica {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Bem-vindo");
        frame.setSize(1920, 1080);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

package atividadeSenac.src;

import javax.swing.*;

public class menuSimples {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Menu Simples");
        JMenuBar menuBar = new JMenuBar();

        // Menu Arquivo
        JMenu arquivoMenu = new JMenu("Arquivo");
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

        sobreItem.addActionListener(e -> JOptionPane.showMessageDialog(frame, "Autor: Seu Nome\nProjeto: Menu Simples"));

        ajudaMenu.add(sobreItem);

        menuBar.add(arquivoMenu);
        menuBar.add(ajudaMenu);

        frame.setJMenuBar(menuBar);
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}


package atividadeSenac;

import javax.swing.*;

public class cadastroMenu {
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


package atividadeSenac;

    import javax.swing.*;

public class cadastroSimples {
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


package atividadeSenac;

import javax.swing.*;

public class editorTexto {
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


package atividadeSenac;
import javax.swing.*;
        import java.awt.*;
        import java.awt.event.*;

public class galeriaImagens {
    private int currentImage = 0;
    private JLabel imageLabel;
    private String[] images = {
            "C:\\Users\\felipe.fcmota\\Downloads\\atividadeSenac\\src\\img\\1.png",
            "C:\\Users\\felipe.fcmota\\Downloads\\atividadeSenac\\src\\img\\2.png",
            "C:\\Users\\felipe.fcmota\\Downloads\\atividadeSenac\\src\\img\\3.png"
    };

    public static void main(String[] args) {
        new galeriaImagens().createAndShowGUI();
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
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}


package atividadeSenac;

import javax.swing.*;

public class imageIcon {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Imagem");
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon icone = new ImageIcon("C:\\Users\\felipe.fcmota\\Downloads\\atividadeSenac\\src\\img\\java.png");
        JLabel label = new JLabel(icone);
        frame.add(label);

        frame.setVisible(true);
    }
}

package atividadeSenac;

import javax.swing.*;

public class layout {
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



package atividadeSenac;

import javax.swing.*;

public class sistemaLogin {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Login");

        JTextField usuarioField = new JTextField(20);
        JPasswordField senhaField = new JPasswordField(20);
        JButton entrarButton = new JButton("Entrar");

        entrarButton.addActionListener(e -> {
            String usuario = usuarioField.getText();
            String senha = new String(senhaField.getPassword());

            if ("admin".equals(usuario) && "123".equals(senha)) {
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



package atividadeSenac;

import javax.swing.*;

public class textoBotao {
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
}*/
