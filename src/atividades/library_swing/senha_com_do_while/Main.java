package atividades.library_swing.senha_com_do_while;

import javax.swing.JOptionPane;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random rand = new Random();
        int senhaCorreta = rand.nextInt(0,20);
        int tentativasRestantes = 5;
        boolean acertou = false;

        do {
            String entrada = JOptionPane.showInputDialog(
                    "Tentativas restantes: " + tentativasRestantes + "\nDigite a senha( 0 a 20) :");

            if (entrada == null) {
                JOptionPane.showMessageDialog(null, "Operação cancelada.");
                return;
            }
            int senhaDigitada = Integer.parseInt(entrada);
            if (senhaDigitada == senhaCorreta) {
                JOptionPane.showMessageDialog(null, "Senha correta! Acesso liberado.");
                acertou = true;
            } else {
                JOptionPane.showMessageDialog(null,
                        "Senha incorreta!\nA senha correta era: " + senhaCorreta +
                                "\nGerando nova senha...");
                senhaCorreta = rand.nextInt(0,20);
                tentativasRestantes--;
            }

        } while (!acertou && tentativasRestantes > 0);

        if (!acertou) {
            JOptionPane.showMessageDialog(null, "Suas tentativas acabaram! Acesso negado.");
        }
    }
}
