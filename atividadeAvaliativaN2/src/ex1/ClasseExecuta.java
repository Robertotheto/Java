package ex1;
import javax.swing.JOptionPane;

public class ClasseExecuta {

	public static void main(String[] args) {
		String ler;
		float numero1, numero2, resultadoSoma, resultadoSubtrair, resultadoMultiplicar, resultadoDividir;
		
		ler = JOptionPane.showInputDialog("Informe o primeiro numero: ");
		numero1 = Float.parseFloat(ler);
		
		ler = JOptionPane.showInputDialog("Informe o segundo numero: ");
		numero2 = Float.parseFloat(ler);
		
		ClasseCalcula add = new ClasseCalcula();
		ClasseCalcula sub = new ClasseCalcula();
		ClasseCalcula multi = new ClasseCalcula();
		ClasseCalcula div = new ClasseCalcula();
		
		resultadoSoma = add.soma(numero1, numero2);
		resultadoSubtrair = sub.subtrair(numero1, numero2);
		resultadoMultiplicar = multi.multiplicacao(numero1, numero2);
		resultadoDividir = div.dividir(numero1, numero2);
		
		JOptionPane.showMessageDialog(null, "A soma dos numeros é: " + resultadoSoma);
		JOptionPane.showMessageDialog(null, "A diferença dos numeros é: " + resultadoSubtrair);
		JOptionPane.showMessageDialog(null, "A multiplicação dos numeros é: " + resultadoMultiplicar);
		JOptionPane.showMessageDialog(null, "A divisão dos numeros é: " + resultadoDividir);
		
		System.exit(0);
	}

}
