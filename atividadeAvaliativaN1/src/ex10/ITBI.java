package ex10;
import java.util.*;

public class ITBI {

	public static void main(String[] args) {
		float valorTransacao, valorVenal, percentual, valorMaior, valorImposto;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe o valor da transação: ");
		valorTransacao = ler.nextFloat();
		System.out.println("Informe o valor Venal do Imovél: ");
		valorVenal = ler.nextFloat();
		System.out.println("Informe o percentual de imposto: ");
		percentual = ler.nextFloat();
		ler.close();
		
		valorMaior = Math.max(valorTransacao, valorVenal);
		valorImposto = (valorMaior * percentual)/100;
		
		System.out.println("O valor de imposto a ser pago é: " + valorImposto);
		System.out.println("Total a ser pago: " + (valorMaior + valorImposto));
	}

}
