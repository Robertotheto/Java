package AtividadeAvaliativaN3;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GuiMenuPrincipal extends JFrame{
	private Container contentPane;
	private JMenuBar mnBarra;
	private JMenu mnArquivos, mnExercicios;
	private JMenuItem miSair;
	private JMenuItem miExercicio1, miExercicio2, miExercicio3, miExercicio4
	,miExercicio5,miExercicio6,miExercicio7,miExercicio8,miExercicio9,miExercicio10;
	
	public GuiMenuPrincipal() {
		inicializarComponentes();
		definirEventos();
	}
	
	private void inicializarComponentes() {
		setTitle("Menu Principal");
		setBounds(0,0,800,600);
		contentPane = getContentPane();
		mnBarra = new JMenuBar();
		mnArquivos = new JMenu("Arquivo");
		mnArquivos.setMnemonic('A');
		mnExercicios = new JMenu("Atividade Avaliativa N2");
		mnExercicios.setMnemonic('E');
		miSair = new JMenuItem("Sair");
		miExercicio1 = new JMenuItem("Exercicio 1");
		miExercicio2 = new JMenuItem("Exercicio 2");
		miExercicio3 = new JMenuItem("Exercicio 3");
		miExercicio4 = new JMenuItem("Exercicio 4");
		miExercicio5 = new JMenuItem("Exercicio 5");
		miExercicio6 = new JMenuItem("Exercicio 6");
		miExercicio7 = new JMenuItem("Exercicio 7");
		miExercicio8 = new JMenuItem("Exercicio 8");
		miExercicio9 = new JMenuItem("Exercicio 9");
		miExercicio10 = new JMenuItem("Exercicio 10");
		mnArquivos.add(miSair);
		mnExercicios.add(miExercicio1);
		mnExercicios.add(miExercicio2);
		mnExercicios.add(miExercicio3);
		mnExercicios.add(miExercicio4);
		mnExercicios.add(miExercicio5);
		mnExercicios.add(miExercicio6);
		mnExercicios.add(miExercicio7);
		mnExercicios.add(miExercicio8);
		mnExercicios.add(miExercicio9);
		mnExercicios.add(miExercicio10);
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
				ex1.calculaEx1();
			}
		});
		miExercicio2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Exercicio2 ex2 = new Exercicio2();
				ex2.calculaEx2();
			}
		});
		miExercicio3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Exercicio3 ex3 = new Exercicio3();
				ex3.calculaEx3();
			}
		});
		miExercicio4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Exercicio4 ex4 = new Exercicio4();
				ex4.calculaEx4();
			}
		});
		miExercicio5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Exercicio5 ex5 = new Exercicio5();
				ex5.calculaEx5();
			}
		});
		miExercicio6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Exercicio6 ex6 = new Exercicio6();
				ex6.calculaEx6();
			}
		});
		miExercicio7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Exercicio7 ex7 = new Exercicio7();
				ex7.calculaEx7();
			}
		});
		miExercicio8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Exercicio8 ex8 = new Exercicio8();
				ex8.loginsenhaEx8();
			}
		});
		miExercicio9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Exercicio9 ex9 = new Exercicio9();
				ex9.calculaEx9();
			}
		});
		miExercicio10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Exercicio10 ex10 = new Exercicio10();
				ex10.menuEx10();
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
