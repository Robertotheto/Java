package interfaceGraficaSwing;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GuiMenuPrincipal extends JFrame{
	private Container contentPane;
	private JMenuBar mnBarra;
	private JMenu mnArquivos, mnExercicios;
	private JMenuItem miSair;
	private JMenuItem miExercicio1, miExercicio2, miExercicio3;
	
	public GuiMenuPrincipal() {
		inicializarComponentes();
		definirEventos();
	}
	
	public void inicializarComponentes() {
		setTitle("Menu Principal");
		setBounds(0,0,800,600);
		contentPane = getContentPane();
		mnBarra = new JMenuBar();
		mnArquivos = new JMenu("Arquivo");
		mnArquivos.setMnemonic('A');
		mnExercicios = new JMenu("Exercicio N2");
		mnExercicios.setMnemonic('E');
		miSair = new JMenuItem("Sair");
		miExercicio1 = new JMenuItem("Exercicio 1");
		miExercicio2 = new JMenuItem("Exercicio 2");
		miExercicio3 = new JMenuItem("Exercicio 3");
		mnArquivos.add(miSair);
		mnExercicios.add(miExercicio1);
		mnExercicios.add(miExercicio2);
		mnExercicios.add(miExercicio3);
		mnBarra.add(mnArquivos);
		mnBarra.add(mnExercicios);
		setJMenuBar(mnBarra);
	}
	
	private void definirEventos() {
		miSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		miExercicio1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Exercicio1 ex1 = new Exercicio1();
				ex1.calculalEx1();
			}
		});
		miExercicio2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Exercicio2 ex2 = new Exercicio2();
				ex2.calculalEx2();
			}
		});
		miExercicio3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Exercicio3 ex3 = new Exercicio3();
				ex3.calculalEx3();
			}
		});
	}
	public static void abrir() {
		GuiMenuPrincipal frame = new GuiMenuPrincipal();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setLocation((tela.width - frame.getSize().width) / 2,
				(tela.height - frame.getSize().height) / 2);
		frame.setVisible(true);
	}
}
