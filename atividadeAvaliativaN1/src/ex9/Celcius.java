package ex9;
import java.util.*;

public class Celcius {

	public static void main(String[] args) {
		float celcius;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe a temperatura: ");
		celcius = ler.nextFloat();
		ler.close();
		
		Kelvin k = new Kelvin();
		Farenheit f = new Farenheit();
		
		System.out.println("A temperatura informada em graus Celcius: " + celcius);
		System.out.println("A temperatura informada em graus Kelvin: " + k.CalculaKelvin(celcius));
		System.out.println("A temperatura informada em graus Farenheit: " + f.CalculoFarenheit(celcius));
	}

}
