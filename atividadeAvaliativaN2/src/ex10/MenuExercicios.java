package ex10;
import javax.swing.JOptionPane;

import ex1.ClasseExecuta;
import ex2.Produto;
import ex3.IMC;
import ex4.Media;
import ex5.Veiculos;
import ex6.ProdutoNew;
import ex7.Resistencia;
import ex8.LoginSenha;
import ex9.Tabuada;

public class MenuExercicios {

	public static void main(String[] args) throws Throwable {
		try {
			String ler;
			int menu;
			ler = JOptionPane.showInputDialog("Menu \n 1 -  Exercicio1 \n 2 -  Exercicio2 \n"
					+ " 3 -  Exercicio3 \n 4 -  Exercicio4 \n 5 -  Exercicio5 \n 6 -  Exercicio6 \n"
					+ " 7 -  Exercicio7 \n 8 -  Exercicio8 \n 9 -  Exercicio9");
			menu = Integer.parseInt(ler);
			
			
			
			if(menu >=1 && menu <=9) {
				switch(menu) {
				case 1:
					 ClasseExecuta.main(args);
					break;
				case 2:
					Produto.main(args);
					break;
				case 3:
					IMC.main(args);
					break;
				case 4:
					Media.main(args);
					break;
				case 5:
					Veiculos.main(args);
					break;
				case 6:
					 ProdutoNew.main(args);
					break;
				case 7:
					 Resistencia.main(args);
					break;
				case 8:
					 LoginSenha.main(args);
					break;
				case 9:
					Tabuada.main(args);
					break;
				default:
					throw new Invalida(menu);
				}
			}
			
		}catch(Invalida e) {
			JOptionPane.showMessageDialog(null, "Opção Invalida");
			e.toString();
		}finally {
			JOptionPane.showMessageDialog(null, "Fim Execução");
		}
		System.exit(0);
	}

}
