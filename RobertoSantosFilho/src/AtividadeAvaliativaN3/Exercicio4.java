package AtividadeAvaliativaN3;
import javax.swing.*;

public class Exercicio4 {
	public void calculaEx4() {
		String ler;
		float n1,n2,n3;
		try {
			ler = JOptionPane.showInputDialog("Informe a primeira nota: ");
			n1 = Float.parseFloat(ler);
			ler = JOptionPane.showInputDialog("Informe a segunda nota: ");
			n2 = Float.parseFloat(ler);
			ler = JOptionPane.showInputDialog("Informe a terceira nota: ");
			n3 = Float.parseFloat(ler);
			
			media(n1, n2, n3);
			
		}catch(NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Digite apenas caracteres numericos");
		}finally {
			JOptionPane.showMessageDialog(null, "Fim da Execução");
		}
	}
	private void media(float n1, float n2, float n3) {
		float media;
		media = ((n1+n2+n3)/3);
			if(media >= 7.0) {
				JOptionPane.showMessageDialog(null, "Aprovado");
			}else if(media >= 5.0 && media < 7.0) {
				JOptionPane.showMessageDialog(null, "Exame");
			}else {
				JOptionPane.showMessageDialog(null, "Reprovado");
			}
	}
}
