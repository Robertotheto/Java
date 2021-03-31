package ex5;
import java.util.*;

public class PerimetroQuadarado {

	public static void main(String[] args) {
		float comprimento, largura;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe o comprimento do quadrado: ");
		comprimento = ler.nextFloat();
		System.out.println("Informe a largura do quadrado: ");
		largura = ler.nextFloat();
		ler.close();
		
		Perimetro p = new Perimetro();
		
		System.out.println("O Perimetro do Quadrado é: " + p.perimetroquadrado(comprimento, largura));
	}

}
