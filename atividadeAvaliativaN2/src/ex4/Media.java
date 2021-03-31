package ex4;

import javax.swing.JOptionPane;

public class Media {

	public static void main(String[] args) {
		String ler;
		float n1,n2,n3;
		
		ler = JOptionPane.showInputDialog("Informe a primeira nota: ");
		n1 = Float.parseFloat(ler);
		ler = JOptionPane.showInputDialog("Informe a segunda nota: ");
		n2 = Float.parseFloat(ler);
		ler = JOptionPane.showInputDialog("Informe a terceira nota: ");
		n3 = Float.parseFloat(ler);
		
		CalculaMedia med = new CalculaMedia();
		
		med.mediaNotas(n1, n2, n3);
	}

}
