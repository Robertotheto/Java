package AtividadeAvaliativaN3;

import javax.swing.JOptionPane;

public class Exercicio8 {
	public void loginsenhaEx8() {
		String login="java8", senha="java8", ler;
		try {
			int contador=0;
			while(contador < 3) {
				do {
					ler = JOptionPane.showInputDialog("Forneça o login");
					login = ler;
					ler = JOptionPane.showInputDialog("Forneça a senha");
					senha = ler;
					if(login.equals("java8") && senha.equals("java8")) {
						JOptionPane.showMessageDialog(null, "Login e senhas aceitos");
						System.exit(0);
					}
					
					
				}while (!login.equals("java8") && !senha.equals("java8"));
				contador++;
				JOptionPane.showMessageDialog(null, "Falha verifique login e senha");
				JOptionPane.showMessageDialog(null, "Voce tem mais " + (contador -3) + " tentativas");
			}	
		}catch(Exception e) {
			
		}finally {
			JOptionPane.showMessageDialog(null, "Fim da Execução");
		}
	}
}
