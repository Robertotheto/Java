package ex6;
import javax.swing.*;

public class ProdutoNew {

	public static void main(String[] args) throws Throwable {
		String ler, nomeProduto;
		try {
			
			float valorproduto, descontoValor;
			
			ler = JOptionPane.showInputDialog("Nome do Produto: ");
			nomeProduto = ler;
			ler = JOptionPane.showInputDialog("Informe o valor do Produto: ");
			valorproduto = Float.parseFloat(ler);
			if(valorproduto < 0) {
				throw new Excecao(valorproduto);
			}
			
			Desconto totalDesconto = new Desconto();
			descontoValor = totalDesconto.PercentualDesconto(valorproduto);
			
			
			JOptionPane.showMessageDialog(null, "Nome do Produto: " + nomeProduto);
			JOptionPane.showMessageDialog(null, "Valor original do Produto: " + valorproduto);
			JOptionPane.showMessageDialog(null, "Valor do Produto com Desconto: " + (valorproduto - descontoValor));
			
		}catch(Excecao e){
				JOptionPane.showMessageDialog(null, "Digite um valor maior que zero");
		}finally {
			JOptionPane.showMessageDialog(null, "Execução Finalizada");
		}
		System.exit(0);
	}

}
