package trabalho;

public class Triangulo {

	private int ladoa;
	private int ladob;
	private int ladoc;
	private int base;
	private int altura;

	// Construtor vazio
	Triangulo() {

	}

	// Construtor com parametros
	Triangulo(int a, int b, int c) {
		ladoa = a;
		ladob = b;
		ladoc = c;
	}

	/*
	 * {a soma de dois lados de um triângulo não deve ser maior que o terceiro
	 * lado} if ((L1 < (L2+l3)) and (L2 < (L1+l3)) and (L3 < (L2+l3))) then
	 * {verificando se é um triangulo válido} Begin if ((L1 = L2) and (L2 = L3))
	 * Then Writeln(´Triangulo equilatero.´) else if ((L1 <> L2) and (L2 <> L3)
	 * and (L1 <> L3)) Then Writeln(´Triangulo escaleno.´) else
	 * Writeln(´Triangulo isoceles.´); End Else Write(´Triangulo não válido!!´);
	 */
	public boolean ehTrianguloValido() {

		// Lados não podem 0 ou número negativo
		if (ladoa <= 0 || ladob <= 0 || ladoc <= 0) {
			return false;
		}

		// Teste da regra para triangulo válido. A soma de dois lados de um
		// triângulo não deve ser maior que o terceiro
		if (ladoa < (ladob + ladoc) && ladob < (ladoa + ladoc)
				&& ladoc < (ladoa + ladob)) {
			return true;
		}
		return false;
	}


	public boolean ehEquilatero() {
		if (ehTrianguloValido()) {
			if (ladoa == ladob & ladob == ladoc & ladoa == ladoc) {
				return true;
			}
		}
		return false;
	}
	
	public boolean ehEscaleno() {
		if (ehTrianguloValido()) {
			if (ladoa != ladob & ladob != ladoc & ladoa != ladoc) {
				return true;
			}
		}
		return false;
	}
	
	public boolean ehIsosceles() {
		if (ehTrianguloValido()) {
			if (!ehEquilatero() && !ehEscaleno()) {
				return true;
			}
		}
		return false;
	}
	
	
	public double getArea() {
		return (base * altura) / 2;

	}

	public String toString() {
		return "TRIANGULO: Altura = " + altura + "; Base = " + base
				+ "; Area = " + getArea() + ".";
	}

	// Métodos get e set
	public int getLado1() {
		return ladoa;
	}

	public void setLado1(int lado1) {
		this.ladoa = lado1;
	}

	public int getLado2() {
		return ladob;
	}

	public void setLado2(int lado2) {
		this.ladob = lado2;
	}

	public int getLado3() {
		return ladoc;
	}

	public void setLado3(int lado3) {
		this.ladoc = lado3;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}
}
