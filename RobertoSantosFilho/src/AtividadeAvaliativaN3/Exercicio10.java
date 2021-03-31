package AtividadeAvaliativaN3;

import javax.swing.JOptionPane;


public class Exercicio10 {
	public void menuEx10() {
		String ler;
		int menu;
		try {
			ler = JOptionPane.showInputDialog("Menu \n 1 -  Exercicio1 \n 2 -  Exercicio2 \n"
					+ " 3 -  Exercicio3 \n 4 -  Exercicio4 \n 5 -  Exercicio5 \n 6 -  Exercicio6 \n"
					+ " 7 -  Exercicio7 \n 8 -  Exercicio8 \n 9 -  Exercicio9");
			menu = Integer.parseInt(ler);
			
			
			
			if(menu > 0 && menu < 10 ) {
				switch(menu) {
				case 1:
					 Exercicio1 ex1 = new Exercicio1();
					 ex1.calculaEx1();
					break;
				case 2:
					Exercicio2 ex2 = new Exercicio2();
					 ex2.calculaEx2();
					break;
				case 3:
					Exercicio3 ex3 = new Exercicio3();
					 ex3.calculaEx3();
					break;
				case 4:
					Exercicio4 ex4 = new Exercicio4();
					 ex4.calculaEx4();
					break;
				case 5:
					Exercicio5 ex5 = new Exercicio5();
					 ex5.calculaEx5();
					break;
				case 6:
					Exercicio6 ex6 = new Exercicio6();
					 ex6.calculaEx6();
					break;
				case 7:
					Exercicio7 ex7 = new Exercicio7();
					 ex7.calculaEx7();
					break;
				case 8:
					Exercicio8 ex8 = new Exercicio8();
					 ex8.loginsenhaEx8();
					break;
				case 9:
					Exercicio9 ex9 = new Exercicio9();
					 ex9.calculaEx9();
					break;
				default:
					JOptionPane.showMessageDialog(null, "Opção Invalida");
				}
			}
		}catch(NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Digite apenas caracteres numericos");
		}
	}
}
