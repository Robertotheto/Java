package ex3;
import javax.swing.*;

public class CalculoImc {
	public float calculoimc(float peso, float altura) {
		float imc;
		imc =  (float) (peso/Math.pow(altura, 2));
		JOptionPane.showMessageDialog(null, "O seu IMC é: " + imc);
			if(imc <= 18.4) {
				JOptionPane.showMessageDialog(null, "Abaixo do Peso");
			}else if(imc >= 18.5 && imc <= 24.9) {
				JOptionPane.showMessageDialog(null, "Peso Normal");
			}else if(imc >= 25.0 && imc <= 29.9) {
				JOptionPane.showMessageDialog(null, "SobrePeso");
			}else if(imc >= 30.0 && imc <= 34.9) {
				JOptionPane.showMessageDialog(null, "Obesidade Grau 1");
			}else if(imc >= 35.0 && imc <= 39.9) {
				JOptionPane.showMessageDialog(null, "Obesidade Grau 2");
			}else {
				JOptionPane.showMessageDialog(null, "Obesidade Grau 3");
			}
		return imc;
		}
}
