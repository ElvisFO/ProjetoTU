import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class VectorsJUnitTest {
	
	@Test
	public void testeIgual() {
		System.out.println("* VectorsJUnitTest: testeIgual");
		int[] a = null;
		int[] b = null;
		boolean resultadoEsperado = false;
		boolean resultadoObtido = Vectors.igual(a, b);
		assertEquals(resultadoEsperado, resultadoObtido);
	}

	
	@Test
	public void testeMultiplicacaoEscalar() {
		System.out.println("* VectorsJUnitTest: testeMultiplicacaoEscalar");
		int[] a = null;
		int[] b = null;
		int resultadoEsperado = 0;
		int resultadoObtido = Vectors.multiplicacaoEscalar(a, b);
		assertEquals(resultadoEsperado, resultadoObtido);
		
	}

	@Test
	public void testeMultiplicacaoEscalar2() {
		System.out.println("* VectorsJUnitTest: testeMultiplicacaoEscalar2()");
		assertEquals(
				0,
				Vectors.multiplicacaoEscalar(new int[] { 0, 0 }, new int[] { 0,
						0 }));
		assertEquals(
				39,
				Vectors.multiplicacaoEscalar(new int[] { 3, 4 }, new int[] { 5,
						6 }));
		assertEquals(
				-39,
				Vectors.multiplicacaoEscalar(new int[] { -3, 4 }, new int[] {
						5, -6 }));
		assertEquals(
				0,
				Vectors.multiplicacaoEscalar(new int[] { 5, 9 }, new int[] {
						-9, 5 }));
		assertEquals(
				100,
				Vectors.multiplicacaoEscalar(new int[] { 6, 8 }, new int[] { 6,
						8 }));
	}

	@Test
	public void testeIgual2() {
		System.out.println("* VectorsJUnitTest: testeIgual2()");
		assertTrue(Vectors.igual(new int[] {}, new int[] {}));
		assertTrue(Vectors.igual(new int[] { 0 }, new int[] { 0 }));
		assertTrue(Vectors.igual(new int[] { 0, 0 }, new int[] { 0, 0 }));
		assertTrue(Vectors.igual(new int[] { 0, 0, 0 }, new int[] { 0, 0, 0 }));
		assertTrue(Vectors.igual(new int[] { 5, 6, 7 }, new int[] { 5, 6, 7 }));

		assertFalse(Vectors.igual(new int[] {}, new int[] { 0 }));
		assertFalse(Vectors.igual(new int[] { 0 }, new int[] { 0, 0 }));
		assertFalse(Vectors.igual(new int[] { 0, 0 }, new int[] { 0, 0, 0 }));
		assertFalse(Vectors.igual(new int[] { 0, 0, 0 }, new int[] { 0, 0 }));
		assertFalse(Vectors.igual(new int[] { 0, 0 }, new int[] { 0 }));
		assertFalse(Vectors.igual(new int[] { 0 }, new int[] {}));

		assertFalse(Vectors.igual(new int[] { 0, 0, 0 }, new int[] { 0, 0, 1 }));
		assertFalse(Vectors.igual(new int[] { 0, 0, 0 }, new int[] { 0, 1, 0 }));
		assertFalse(Vectors.igual(new int[] { 0, 0, 0 }, new int[] { 1, 0, 0 }));
		assertFalse(Vectors.igual(new int[] { 0, 0, 1 }, new int[] { 0, 0, 3 }));
	}

	@Test
	public void testeIgual3() {
		System.out.println("* VectorsJUnitTest: testeIgual3()");
		assertTrue(Vectors.igual(new int[] {}, new int[] {}));
		assertTrue(Vectors.igual(new int[] { 0 }, new int[] { 0 }));
		assertTrue(Vectors.igual(new int[] { 0, 0 }, new int[] { 0, 0 }));
		assertTrue(Vectors.igual(new int[] { 0, 0, 0 }, new int[] { 0, 0, 0 }));
		assertTrue(Vectors.igual(new int[] { 5, 6, 7 }, new int[] { 5, 6, 7 }));

		assertFalse(Vectors.igual(new int[] {}, new int[] { 0 }));
		assertFalse(Vectors.igual(new int[] { 0 }, new int[] { 0, 0 }));
		assertFalse(Vectors.igual(new int[] { 0, 0 }, new int[] { 0, 0, 0 }));
		assertFalse(Vectors.igual(new int[] { 0, 0, 0 }, new int[] { 0, 0 }));
		assertFalse(Vectors.igual(new int[] { 0, 0 }, new int[] { 0 }));
		assertFalse(Vectors.igual(new int[] { 0 }, new int[] {}));

		assertFalse(Vectors.igual(new int[] { 0, 0, 0 }, new int[] { 0, 0, 1 }));
		assertFalse(Vectors.igual(new int[] { 0, 0, 0 }, new int[] { 0, 1, 0 }));
		assertFalse(Vectors.igual(new int[] { 0, 0, 0 }, new int[] { 1, 0, 0 }));
		assertFalse(Vectors.igual(new int[] { 0, 0, 1 }, new int[] { 0, 0, 3 }));
	}

}