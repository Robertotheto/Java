package AtividadeAvaliativaN3;
import javax.swing.*;

public class Exercicio1 {
	public void calculaEx1() {
		String entrada;
		float valorA, valorB;
		try {
			entrada = JOptionPane.showInputDialog("Insira o primeiro valor: ");
			valorA = Float.parseFloat(entrada);
			entrada = JOptionPane.showInputDialog("Insira o segundo valor: ");
			valorB = Float.parseFloat(entrada);
			
			somar(valorA, valorB);
			subtrair(valorA, valorB);
			multiplica(valorA, valorB);
			divide(valorA, valorB);
		}catch(NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Digite apenas caracteres numericos");
		}catch(ArithmeticException e) {
			JOptionPane.showMessageDialog(null, "Ocorreu um erro");
		}finally {
			JOptionPane.showMessageDialog(null, "Fim da Execução");
		}
		
	}
	
	private void somar(float a, float b) {
		JOptionPane.showMessageDialog(null, "A soma é: " + (a + b));
	}
	private void subtrair(float a, float b) {
		JOptionPane.showMessageDialog(null, "A subtração é: " + (a - b));
	}
	private void multiplica(float a, float b) {
		JOptionPane.showMessageDialog(null, "A multiplicação é: " + (a * b));
	}
	private void divide(float a, float b) {
		JOptionPane.showMessageDialog(null, "A divisão é: " + (a / b));
	}
}
