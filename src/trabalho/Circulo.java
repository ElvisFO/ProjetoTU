package trabalho;

public class Circulo {

	float raio, x, y;

	public Circulo(float ax, float ay, float ar)
	// garante o estado do objeto
	{
		this.x = ax;
		this.y = ay;
		this.raio = ar;
	}

	public void altera_raio(float a) {
		this.raio = a;
	}

	public float retorna_raio() {
		return this.raio;
	}

	public void move(float dx, float dy) {
		this.x += dx;
		this.y += dy;
	}

	public float distancia(Ponto ap) {

		float dcp; // distancia do centro do circulo ao ponto
		dcp = (float) Math.sqrt((double) ((x - ap.x) * (x - ap.x) + (y - ap.y) * (y - ap.y)));

		if (dcp < raio)
			return raio - dcp;
		else
			return dcp - raio;
	}

	public void mostra() {
		System.out.println("(" + this.x + "," + this.y + "," + this.raio + ")");
	}
}