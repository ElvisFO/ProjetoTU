package trabalho;

import static org.junit.Assert.*;

import org.junit.Test;

public class TesteVenda {

	Venda venda;
	
	@Test
	public void testCalcularValorTotal(){
		venda = new Venda(3, 2.0);
		
		assertEquals(new Double(6.0), venda.calcularValorTotal());
	}
}
