package ex8;

public class ImcCalculo {
	public float FormulaImc(float peso, float altura) {
		return (float) (peso/Math.pow(altura, 2));
	}
}
