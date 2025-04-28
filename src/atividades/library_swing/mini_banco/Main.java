package atividades.library_swing.mini_banco;

import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {

        double saldo = 1000.00;
        int opcao;

        do {
            String menu = "Bem vindo!! \n" +
                    "1 - Depositar\n" +
                    "2 - Sacar\n" +
                    "3 - Sair\n" +
                    "Saldo Atual: R$ " + saldo + "\n" ;
            opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (opcao) {
                case 1:
                    double deposito = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor para depositar:"));
                    saldo += deposito;
                    JOptionPane.showMessageDialog(null, "Depósito realizado!\nNovo saldo: R$ " + saldo);
                    break;
                case 2:
                    double saque = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor para sacar:"));
                    if (saque <= saldo) {
                        saldo -= saque;
                        JOptionPane.showMessageDialog(null, "Saque realizado!\nNovo saldo: R$ " + saldo);
                    } else {
                        JOptionPane.showMessageDialog(null, "Saldo insuficiente.");
                    }
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Saindo...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
            }
        } while (opcao != 3);
    }
}
