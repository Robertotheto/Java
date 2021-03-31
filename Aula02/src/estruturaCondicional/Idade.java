package estruturaCondicional;

public class Idade {
	public void testaMaior18(int idadeCnh) {
		if(idadeCnh >= 18) {
			System.out.println("Maior de 18 anos. Pode solicitar CNH");
		}else {
			System.out.println("Menor de 18 anos. Não pode solicitar CNH");
		}
	}
	public void testarIdadeAposentar(int idadeAposentar) {
		if(idadeAposentar <= 17) {
			System.out.println("Menor de idade");
		}
		if(idadeAposentar >= 18 && idadeAposentar <= 64) {
			System.out.println("Você ainda não pode se aposentar");
		}
		if(idadeAposentar >= 65) {
			System.out.println("Você já pode se aposentar");
		}
	}
	public void testarIdadeAposentarAninhado(int idadeAposentar) {
		if(idadeAposentar <= 17) {
			System.out.println("Menor de idade");
		}else if(idadeAposentar >= 18 && idadeAposentar <= 64){
			System.out.println("Você ainda não pode se aposentar");
		}else {
			System.out.println("Você já pode se aposentar");
		}
	}
}
