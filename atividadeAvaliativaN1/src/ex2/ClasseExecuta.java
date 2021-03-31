package ex2;
import java.util.Scanner;

public class ClasseExecuta {

	public static void main(String[] args) {
		
		int valor1, valor2, resultadoSoma, resultadoSubtrai, resultadoMultiplica, resultadoDivide;
		Scanner ler = new Scanner(System.in);
		
		ClasseCalcula add = new ClasseCalcula();
		ClasseCalcula subtract = new ClasseCalcula();
		ClasseCalcula multiply = new ClasseCalcula();
		ClasseCalcula share = new ClasseCalcula();
		
		System.out.println("Digite o primeiro numero: ");
		valor1 = ler.nextInt();
		System.out.println("Digite o segundo numero: ");
		valor2 = ler.nextInt();
		ler.close();
		
		resultadoSoma = add.soma(valor1, valor2);
		resultadoSubtrai = subtract.subtrai(valor1, valor2);
		resultadoMultiplica = multiply.multiplica(valor1, valor2);
		resultadoDivide = share.divide(valor1, valor2);
		
		System.out.println("Resultado da Soma é: " + resultadoSoma);
		System.out.println("Resultado da Subtração é: " + resultadoSubtrai);
		System.out.println("Resultado da Multiplicação é: " + resultadoMultiplica);
		System.out.println("Resultado da Divisão é: " + resultadoDivide);
		System.exit(0);
	}

}
