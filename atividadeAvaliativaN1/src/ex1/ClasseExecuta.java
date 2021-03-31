package ex1;

public class ClasseExecuta {

	public static void main(String[] args) {
		ClasseSoma add = new ClasseSoma();
		ClasseSubtrai subtract = new ClasseSubtrai();
		ClasseMultiplica multiply = new ClasseMultiplica();
		ClasseDivide share = new ClasseDivide();
		
		System.out.println(add.soma(5, 5));
		System.out.println(subtract.subtrai(5, 5));
		System.out.println(multiply.multiplica(5, 5));
		System.out.println(share.divide(5, 5));
	}

}
