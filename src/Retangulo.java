public class Retangulo {

	private int altura;
	private int comprimento;

	Retangulo() {
		altura = 0;
		comprimento = 0;
	}

	Retangulo(int h, int w) {
		altura = h;
		comprimento = w;
	}

	public int getAltura() {
		return altura;
	}

	public int getComprimento() {
		return comprimento;
	}

	public int getArea() {
		return comprimento * altura;
	}

	public void setAltura(int h) {
		altura = h;
	}

	public void setComprimento(int w) {
		comprimento = w;
	}

	public String toString() {
		return "Retangulo: Altura = " + altura + "; Comprimento = " + 
	comprimento + "; Area = " + getArea() + ".";
	}

}
