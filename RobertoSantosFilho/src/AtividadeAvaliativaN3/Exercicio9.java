package AtividadeAvaliativaN3;

import javax.swing.JOptionPane;

public class Exercicio9 {
	public void calculaEx9() {
		String ler;
		int tabuada;
		try {
			ler = JOptionPane.showInputDialog("Forneça um numero: ");
			tabuada = Integer.parseInt(ler);
			
			for(int aux =1; aux <=10; aux++) {

				JOptionPane.showMessageDialog(null, tabuada + " x " + aux + " = " + (tabuada*aux));
			}
		}catch(NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Digite apenas caracteres numericos");
		}finally {
			JOptionPane.showMessageDialog(null, "Fim da Execução");
		}
	}
}
