package ex7;
import java.util.*;

public class PerimetroCirculo {

	public static void main(String[] args) {
		float raio;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe o raio do circulo: ");
		raio = ler.nextFloat();
		ler.close();
		
		Perimetro p = new Perimetro();
		
		System.out.println("O Perimetro do Circulo é: " + p.CirculoPerimetro(raio));
	}

}
