package trabalho;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Test;

public class TesteVendaPlus {

	VendaPlusPlus vendaplus;
	Calculadora cal = new Calculadora();
	
	@Test
	public void testCalcularValorTotal(){
		vendaplus = new VendaPlusPlus(new Integer(5), new BigDecimal(10.50), cal);
		assertEquals(new BigDecimal(52.50), vendaplus.calcularValorTotal());
		
	}
}
