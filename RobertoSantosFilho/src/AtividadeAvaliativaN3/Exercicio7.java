package AtividadeAvaliativaN3;

import javax.swing.JOptionPane;

public class Exercicio7 {
	public void calculaEx7() {
		String ler;
		int n1, n2, n3, n4, Maior= 0, Menor=0;
		
		try {
			ler = JOptionPane.showInputDialog("Informe o valor da resistência: ");
			n1 = Integer.parseInt(ler);
			ler = JOptionPane.showInputDialog("Informe o valor da resistência: ");
			n2 = Integer.parseInt(ler);
			ler = JOptionPane.showInputDialog("Informe o valor da resistência: ");
			n3 = Integer.parseInt(ler);
			ler = JOptionPane.showInputDialog("Informe o valor da resistência: ");
			n4 = Integer.parseInt(ler);
			
			Maior = maior(n1,n2,n3,n4);
			Menor = menor(n1,n2,n3,n4);
			
			JOptionPane.showMessageDialog(null, "Resistência Fornecidas: \n" + n1 +" ,"+ n2+" ," +n3+" ,"+n4);
			JOptionPane.showMessageDialog(null, "A maior Resistência é: " + Maior);
			JOptionPane.showMessageDialog(null, "A menor Resistência é: " + Menor);
			
		}catch(NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Digite apenas caracteres numericos");
		}finally {
			JOptionPane.showMessageDialog(null, "Fim da Execução");
		}
	}
	private int maior(int n1, int n2, int n3, int n4) {
		if(n1 > n2 && n1 > n3 && n1 > n4) {
			return n1;
		}else if(n2 > n1 && n2 > n3 && n2 > n4) {
			return n2;
		}else if(n3 > n1 && n3 > n2 && n3 > n4) {
			return n3;
		}else {
			return n4;
		}
	}
	private int menor(int n1, int n2, int n3, int n4) {
		if(n1 < n2 && n1 < n3 && n1 < n4) {
			return n1;
		}else if(n2 < n1 && n2 < n3 && n2 < n4) {
			return n2;
		}else if(n3 < n1 && n3 < n2 && n3 < n4) {
			return n3;
		}else {
			return n4;
		}
	}
}
