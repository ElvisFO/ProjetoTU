package trabalho;

public class Ponto {

	float x, y; 

	public Ponto(float ax, float ay) 
	{
		this.x = ax;
		this.y = ay;
	}

	public float retornaX() {
		return x;
	}

	public void move(float dx, float dy) {
		this.x += dx;
		this.y += dy;
	}

	public void mostra() {
		System.out.println("(" + this.x + "," + this.y + ")");
	}
}