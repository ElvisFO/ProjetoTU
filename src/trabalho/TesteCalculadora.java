package trabalho;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Test;

public class TesteCalculadora {

	Calculadora cal;

	@Test
	public void testSoma() {

		cal = new Calculadora();
		assertEquals(7, cal.soma(4, 3));
	}

	@Test
	public void testSubtracao() {

		cal = new Calculadora();
		assertEquals(1, cal.subtracao(5, 4));
	}

	@Test
	public void testMultiplicacao() {

		cal = new Calculadora();
		assertEquals(20, cal.multiplicacao(4, 5), 0);
	}

	@Test
	public void testDivisao() {

		cal = new Calculadora();
		assertEquals(7, cal.divisao(14, 2), 0);
	}

	@Test
	public void testBigDecimal() {

		cal = new Calculadora();
		
		assertEquals(new BigDecimal(9), cal.multiplicacao(new Integer(3), new BigDecimal(3)));
	}
	
	@Test
	public void testBigDecimalNull() {

		cal = new Calculadora();
		
		assertNull("Deveria vir nulo", cal.multiplicacao(null, new BigDecimal(3)));
	}

}
