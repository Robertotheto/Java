package estruturaCondicional;
import java.util.*;

public class TestaIdade {

	public static void main(String[] args) {
		int idade;
		Scanner scan = new Scanner(System.in);
		
		Idade usuarioIdade = new Idade();
		
		System.out.println("Digite sua idade: \n");
		idade = scan.nextInt();
		scan.close();
		
		usuarioIdade.testaMaior18(idade);
		usuarioIdade.testarIdadeAposentar(idade);
		usuarioIdade.testarIdadeAposentarAninhado(idade);
	}

}
