package ex3;
import java.util.*;

public class Produto {

	public static void main(String[] args) {
		float valorProduto = 0, percentualdedesconto = 0, valorDesconto = 0;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o valor do produto");
		valorProduto = ler.nextFloat();
		System.out.println("Informe o desconto do produto");
		percentualdedesconto = ler.nextFloat();
		ler.close();
		
		valorDesconto = (valorProduto * percentualdedesconto)/100;
		
		System.out.println("Total de desconto é: " + valorDesconto);
		System.out.println("Valor total: " + (valorProduto - valorDesconto));
	}

}
