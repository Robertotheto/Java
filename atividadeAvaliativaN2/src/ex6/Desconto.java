package ex6;

public class Desconto {
	public float PercentualDesconto(float valor) {
		if(valor >= 50 && valor < 200) {
			return (float) (valor * 0.05);
		}else if(valor >= 200 && valor < 500) {
			return (float) (valor * 0.06);
		}else if(valor >= 500 && valor < 1000) {
			return (float) (valor * 0.07);
		}else if(valor >= 1000){
			return (float) (valor * 0.08);
		}
		return valor;
		
	}
}
