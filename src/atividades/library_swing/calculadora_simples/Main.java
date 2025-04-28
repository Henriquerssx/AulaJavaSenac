package atividades.library_swing.calculadora_simples;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        double a, b, resultado;
        String operacao;
        String continuar;

        while (true) {
            a = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número:"));
            operacao = JOptionPane.showInputDialog("Qual operação? (+, -, *, /)");
            b = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número:"));

            switch (operacao) {
                case "+":
                    resultado = a + b;
                    break;
                case "-":
                    resultado = a - b;
                    break;
                case "*":
                    resultado = a * b;
                    break;
                case "/":
                    if (b == 0) {
                        JOptionPane.showMessageDialog(null, "Não é possível dividir por zero!");
                        continue;
                    }
                    resultado = a / b;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Operação inválida!");
                    continue;
            }

            JOptionPane.showMessageDialog(null, "O resultado é: " + resultado);

            continuar = JOptionPane.showInputDialog("Deseja fazer outro cálculo? Digite 'sair' para encerrar ou qualquer outra coisa para continuar.");

            if (continuar != null && continuar.equalsIgnoreCase("sair")) {
                JOptionPane.showMessageDialog(null, "Calculadora encerrada. Obrigado por usar!");
                break;
            }
        }
    }
}
