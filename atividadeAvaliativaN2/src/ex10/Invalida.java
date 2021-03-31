package ex10;

public class Invalida extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public int menu;

	public Invalida(int menu) {
		super();
		this.menu = menu;
	}

	@Override
	public String toString() {
		return "";
	}
	
}
