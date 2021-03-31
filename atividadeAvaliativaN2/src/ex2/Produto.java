package ex2;
import javax.swing.*;

public class Produto {

	public static void main(String[] args) {
		String ler;
		float valorProduto, valorDesconto, percentualDesconto;
		
		ler = JOptionPane.showInputDialog("Informe o valor do Produto");
		valorProduto = Float.parseFloat(ler);
		ler = JOptionPane.showInputDialog("Informe o desconto do Produto");
		percentualDesconto = Float.parseFloat(ler);
		
		Desconto desc = new Desconto();
		
		valorDesconto = desc.desconto(valorProduto, percentualDesconto);
		
		JOptionPane.showMessageDialog(null, "O valor de desconto é: " + valorDesconto);
		JOptionPane.showMessageDialog(null, "Valor Total com desconto: " + (valorProduto-valorDesconto));
		System.exit(0);
	}

}
