package trabalho;

import static org.junit.Assert.*;
import org.junit.Test;

public class TestePonto {

	Ponto ponto;
	
	@Test
	public void testMove(){
		ponto = new Ponto(2.0f, 3.0f);
		ponto.move(3.0f, 4.0f);
		try{
			assertTrue("Teste: Valores padrões estão errados! ", ponto.x == 5.0f && ponto.y == 7.0f);
			ponto.mostra();
		}catch(AssertionError e){
			fail(e.getMessage());
		}
	}
	
}
