package ex4;
import javax.swing.*;

public class CalculaMedia {
	public float mediaNotas(float n1, float n2, float n3) {
		float media;
		media = ((n1+n2+n3)/3);
			if(media >= 7.0) {
				JOptionPane.showMessageDialog(null, "Aprovado");
			}else if(media >= 5.0 && media < 7.0) {
				JOptionPane.showMessageDialog(null, "Exame");
			}else {
				JOptionPane.showMessageDialog(null, "Reprovado");
			}
		return media;
	}
}
