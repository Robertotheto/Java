package ex4;
import java.util.*;

public class AreaQuadrado {

	public static void main(String[] args) {
		float comprimento, largura;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe o comprimento do quadrado: ");
		comprimento = ler.nextFloat();
		System.out.println("Informe a largura do quadrado: ");
		largura = ler.nextFloat();
		ler.close();
		
		Area area = new Area();
		System.out.println("A area do Quadrado é: " + area.AreaQuadrado(comprimento, largura));
	}

}
