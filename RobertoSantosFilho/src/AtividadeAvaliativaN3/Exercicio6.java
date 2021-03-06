package AtividadeAvaliativaN3;

import javax.swing.JOptionPane;


public class Exercicio6 {
	public void calculaEx6() {
		String entrada, nomeProduto;
		float valorProduto, valorDesconto;
		try {
			do {
				entrada = JOptionPane.showInputDialog("Informe nome Produto");
				nomeProduto = entrada;
				entrada = JOptionPane.showInputDialog("Informe o valor do Produto");
				valorProduto = Float.parseFloat(entrada);
				
				if(valorProduto < 0) {
					JOptionPane.showMessageDialog(null, "Informe um valor maior que zero");
				}
			}while(valorProduto < 0);
			
			valorDesconto = desconto(valorProduto);
			
			JOptionPane.showMessageDialog(null, "Nome do Produto: " + nomeProduto);
			JOptionPane.showMessageDialog(null, "Valor original do Produto: " + valorProduto);
			JOptionPane.showMessageDialog(null, "Valor do Produto com Desconto: " + (valorProduto - valorDesconto));
			
		}catch(IllegalArgumentException e) {
			JOptionPane.showMessageDialog(null, "Ocorreu um erro");
		}finally {
			JOptionPane.showMessageDialog(null, "Fim da Execução");
		}
	}
	private float desconto(float valor) {
		if(valor >= 50 && valor < 200) {
			return (float) (valor * 0.05);
		}else if(valor >= 200 && valor < 500) {
			return (float) (valor * 0.06);
		}else if(valor >= 500 && valor < 1000) {
			return (float) (valor * 0.07);
		}else if(valor >= 1000){
			return (float) (valor * 0.08);
		}
		return valor;
	}
	
}
