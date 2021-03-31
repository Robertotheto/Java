package ex7;
import javax.swing.*;

public class Resistencia {

	public static void main(String[] args) {
		String ler;
		int n1, n2, n3, n4, RM= 0, RMe=0;
		
		ler = JOptionPane.showInputDialog("Informe o valor da resistência: ");
		n1 = Integer.parseInt(ler);
		ler = JOptionPane.showInputDialog("Informe o valor da resistência: ");
		n2 = Integer.parseInt(ler);
		ler = JOptionPane.showInputDialog("Informe o valor da resistência: ");
		n3 = Integer.parseInt(ler);
		ler = JOptionPane.showInputDialog("Informe o valor da resistência: ");
		n4 = Integer.parseInt(ler);
		
		if(n1 > n2 && n1 > n3 && n1 > n4) {
			RM += n1;
		}else if(n2 > n1 && n2 > n3 && n2 > n4) {
			RM += n2;
		}else if(n3 > n1 && n3 > n2 && n3 > n4) {
			RM += n3;
		}else {
			RM += n4;
		}
		
		if(n1 < n2 && n1 < n3 && n1 < n4) {
			RMe += n1;
		}else if(n2 < n1 && n2 < n3 && n2 < n4) {
			RMe += n2;
		}else if(n3 < n1 && n3 < n2 && n3 < n4) {
			RMe += n3;
		}else {
			RMe += n4;
		}
		JOptionPane.showMessageDialog(null, "Resistência Fornecidas: \n" + n1 +" ,"+ n2+" ," +n3+" ,"+n4);
		JOptionPane.showMessageDialog(null, "A maior Resistência é: " + RM);
		JOptionPane.showMessageDialog(null, "A menor Resistência é: " + RMe);
	}

}
