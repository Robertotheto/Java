package ex8;
import java.util.*;

public class IMC {

	public static void main(String[] args) {
			Scanner ler = new Scanner(System.in);
			float peso, altura;
			
			System.out.println("Informe o seu peso em Kg: ");
			peso = ler.nextFloat();
			System.out.println("Informe a sua altura em metros: ");
			altura = ler.nextFloat();
			ler.close();
			
			ImcCalculo imc = new ImcCalculo();
			System.out.println("O seu IMC é: " + imc.FormulaImc(peso, altura));	
		
	}

}
