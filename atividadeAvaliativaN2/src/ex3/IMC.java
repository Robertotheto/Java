package ex3;
import javax.swing.*;

public class IMC {

	public static void main(String[] args) {
		String ler;
		float peso, altura;
		
		ler = JOptionPane.showInputDialog("Informe seu peso em Kg: ");
		peso = Float.parseFloat(ler);
		ler = JOptionPane.showInputDialog("Informe sua altura em metros: ");
		altura = Float.parseFloat(ler);
		
		CalculoImc imc = new CalculoImc();
		imc.calculoimc(peso, altura);
		
	}

}
