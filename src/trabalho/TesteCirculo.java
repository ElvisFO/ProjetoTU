package trabalho;

import static org.junit.Assert.*;

import org.junit.Test;

public class TesteCirculo {

	Circulo circulo;

	@Test
	public void testAltera_Raio(){
		
		circulo = new Circulo(3.0f, 2.0f, 4.0f);
		circulo.altera_raio(4.0f);;
		try {
			assertTrue("Teste 1: Valores padrões estão errados", circulo.raio == 4.0f);
			System.out.println("Passou!");
		} catch(AssertionError e){
			fail(e.getMessage());
		}
	}
	
	@Test
	public void testMove(){
		
		circulo = new Circulo(1.0f, 2.0f, 4.0f);
		circulo.move(3.0f, 4.0f);
		try {
			assertTrue("Teste 1: Valores padrões estão errados", circulo.x == 4.0f && circulo.y == 6.0f);
			System.out.println("Passou!");
		} catch(AssertionError e){
			fail(e.getMessage());
		}
	}
	
	@Test
	public void testDistancia(){
		circulo = new Circulo(1.0f, 2.0f, 1.0f);
		Ponto ponto = new Ponto(4.0f, 2.0f);
		
		assertEquals(2.0f, circulo.distancia(ponto), 0);
		circulo.mostra();
		
		
	}
	
}
