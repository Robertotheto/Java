package AtividadeAvaliativaN3;

import javax.swing.JOptionPane;

public class Exercicio5 {
	public void calculaEx5() {
		String ler,veiculoA="VeiculoA",veiculoB="VeiculoB",veiculoC="VeiculoC",veiculoD="VeiculoD",veiculoE="VeiculoE";
		float litrosA,kma,consumoA, totalKma=0, totalLitrosA=0;
		float litrosB,kmb,consumoB, totalKmb=0, totalLitrosB=0;
		float litrosC,kmc,consumoC, totalKmc=0, totalLitrosC=0;
		float litrosD,kmd,consumoD, totalKmd=0, totalLitrosD=0;
		float litrosE,kme,consumoE, totalKme=0, totalLitrosE=0;
		
		try {

			JOptionPane.showMessageDialog(null, veiculoA);
			ler = JOptionPane.showInputDialog("Informe a Quilometragem: ");
			kma = Float.parseFloat(ler);
			ler = JOptionPane.showInputDialog("Informe a quantidade de Litros: ");
			litrosA = Float.parseFloat(ler);
			JOptionPane.showMessageDialog(null, veiculoB);
			ler = JOptionPane.showInputDialog("Informe a Quilometragem: ");
			kmb = Float.parseFloat(ler);
			ler = JOptionPane.showInputDialog("Informe a quantidade de Litros: ");
			litrosB = Float.parseFloat(ler);
			JOptionPane.showMessageDialog(null, veiculoC);
			ler = JOptionPane.showInputDialog("Informe a Quilometragem: ");
			kmc = Float.parseFloat(ler);
			ler = JOptionPane.showInputDialog("Informe a quantidade de Litros: ");
			litrosC = Float.parseFloat(ler);
			JOptionPane.showMessageDialog(null, veiculoD);
			ler = JOptionPane.showInputDialog("Informe a Quilometragem: ");
			kmd = Float.parseFloat(ler);
			ler = JOptionPane.showInputDialog("Informe a quantidade de Litros: ");
			litrosD = Float.parseFloat(ler);
			JOptionPane.showMessageDialog(null, veiculoE);
			ler = JOptionPane.showInputDialog("Informe a Quilometragem: ");
			kme = Float.parseFloat(ler);
			ler = JOptionPane.showInputDialog("Informe a quantidade de Litros: ");
			litrosE = Float.parseFloat(ler);
			

			totalKma += kma;
			totalLitrosA += litrosA;
			totalKmb += kmb;
			totalLitrosB += litrosB;
			totalKmc += kmc;
			totalLitrosC += litrosC;
			totalKmd += kmd;
			totalLitrosD += litrosD;
			totalKme += kme;
			totalLitrosE += litrosE;
			
			consumoA = mediaConsumo(kma, litrosA);
			consumoB = mediaConsumo(kmb, litrosB);
			consumoC = mediaConsumo(kmc, litrosC);
			consumoD = mediaConsumo(kmd, litrosD);
			consumoE = mediaConsumo(kme, litrosE);
			
			
			JOptionPane.showMessageDialog(null," "+veiculoA+"\n" +"M??dia do Consumo:"+ consumoA +"km/L" );
			JOptionPane.showMessageDialog(null," "+veiculoB+"\n" +"M??dia do Consumo:"+ consumoB +"km/L" );
			JOptionPane.showMessageDialog(null," "+veiculoC+"\n" +"M??dia do Consumo:"+ consumoC +"km/L" );
			JOptionPane.showMessageDialog(null," "+veiculoD+"\n" +"M??dia do Consumo:"+ consumoD +"km/L" );
			JOptionPane.showMessageDialog(null," "+veiculoE+"\n" +"M??dia do Consumo:"+ consumoE +"km/L" );
			JOptionPane.showMessageDialog(null, "Veiculo  "+"   Km  "+"    Consumo \n" + veiculoA+"  " + totalKma+"  " +"  "+ totalLitrosA+"\n"
					+ veiculoB+"  " + totalKmb+"  " +"   "+ totalLitrosB+"\n"
					+ veiculoC+"  " + totalKmc+"  " +"   "+ totalLitrosC+"\n"
					+ veiculoD+"  " + totalKmd+"  " +"   "+ totalLitrosD+"\n"
					+ veiculoE+"  " + totalKme+"  " +"   "+ totalLitrosE+"\n");
			
		}catch(NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Digite apenas caracteres numericos");
		}finally {
			JOptionPane.showMessageDialog(null, "Fim da Execu????o");
		}
	}
	private float mediaConsumo(float km, float litros) {
	
		return (km/litros);
	}
}
