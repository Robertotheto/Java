package ex6;
import java.util.*;

public class AreaCirculo {

	public static void main(String[] args) {
		float raio;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe o raio do circulo: ");
		raio = ler.nextFloat();
		ler.close();
		
		Circulo c = new Circulo();
		
		System.out.println("A area do circulo é: " + c.CirculoArea(raio));
	}

}
