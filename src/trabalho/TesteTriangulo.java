package trabalho;

import static org.junit.Assert.*;

import org.junit.Test;


public class TesteTriangulo {

	Triangulo triangulo;
	
	@Test
	public void testTrianguloValido() {

		triangulo = new Triangulo();

		try {
			triangulo = new Triangulo(2,2,2);
				assertTrue("Test1: Com esses valores não se obtem um triângulo",triangulo.ehTrianguloValido());
				System.out.println("É triângulo");
		} catch (AssertionError e) {
			fail(e.getMessage());
		}

	}

	@Test
	public void testEquilatero() {

		triangulo = new Triangulo();

		try {
			triangulo = new Triangulo(2,2,2);
				assertTrue("Test1: Com esses valores não se obtem um Equilatero",triangulo.ehEquilatero());
				System.out.println("É equilatero!");
		} catch (AssertionError e) {
			fail(e.getMessage());
		}

	}
	

	@Test
	public void testEscaleno() {

		triangulo = new Triangulo();

		try {
			triangulo = new Triangulo(3,4,2);
				assertTrue("Test2: com esses valores não se obtem um Escaleno",triangulo.ehEscaleno());
				System.out.println("É escaleno!");
		} catch (AssertionError e) {
			fail(e.getMessage());
		}

	}
	
	@Test
	public void testIsosceles() {

		triangulo = new Triangulo();

		try {
			triangulo = new Triangulo(4,2,4);

				assertTrue("Test2: com esses valores não se obtem um Isosceles",triangulo.ehIsosceles());
				System.out.println("É isosceles!");
		} catch (AssertionError e) {
			fail(e.getMessage());
		}

	}
	
	@Test
	public void testArea(){
		
		triangulo = new Triangulo();
		
		triangulo.setBase(4);
		triangulo.setAltura(3);

		assertEquals(6.0, triangulo.getArea(), 0);
		String area = triangulo.toString();
		System.out.println(area);
		
		
		
	}

}
