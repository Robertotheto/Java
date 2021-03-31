package ex9;
import javax.swing.*;

public class Tabuada {

	public static void main(String[] args) {
		String ler;
		int tabuada;
		ler = JOptionPane.showInputDialog("Forneça um numero");
		tabuada = Integer.parseInt(ler);
		
		for(int aux =1; aux <=10; aux++) {
			JOptionPane.showMessageDialog(null, tabuada + " x " + aux + " = " + (tabuada*aux));
		}
	}

}
