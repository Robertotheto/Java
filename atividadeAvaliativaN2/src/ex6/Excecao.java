package ex6;

public class Excecao extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public float valorproduto;

	public Excecao(float valorproduto) {
		super();
		this.valorproduto = valorproduto;
	}

	@Override
	public String toString() {
		return "";
	}
	
}
