package atividades.library_swing.simulador_de_caixa;
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {

        double valorProduto = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor:"));
        double valorPago = Double.parseDouble(JOptionPane.showInputDialog("Valor a ser pago:"));

        if (valorPago >= valorProduto) {
            double troco = valorPago - valorProduto;
            JOptionPane.showMessageDialog(null, "Obrigado pela compra, troco: R$ " + troco);
        } else {
            JOptionPane.showMessageDialog(null, "Valor invalido para a compra");
        }
    }
}
