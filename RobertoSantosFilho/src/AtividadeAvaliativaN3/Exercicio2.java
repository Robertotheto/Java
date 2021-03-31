package AtividadeAvaliativaN3;
import javax.swing.*;

public class Exercicio2 {
	public void calculaEx2() {
		String entrada;
		float valorProduto, valorDesconto, percentualDesconto;
		try {
			entrada = JOptionPane.showInputDialog("Informe o valor do Produto");
			valorProduto = Float.parseFloat(entrada);
			entrada = JOptionPane.showInputDialog("Informe o desconto do Produto");
			percentualDesconto = Float.parseFloat(entrada);
			
			valorDesconto = (valorProduto * percentualDesconto)/100;
			
			JOptionPane.showMessageDialog(null, "O valor a ser descontado é: " + valorDesconto);
			JOptionPane.showMessageDialog(null, "O valor final do produto: " + (valorProduto - valorDesconto));
			
		}catch(NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Digite apenas caracteres numericos");
		}finally {
			JOptionPane.showMessageDialog(null, "Fim da Execução");
		}
	}
	
}
