import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RetanguloTest {
	Retangulo r;
	Retangulo[] rList = new Retangulo[5];

	@Before
	// É realizado antes de cada teste
	public void testSetup() {
		System.out.println("Início");
	}

	@After
	// É realizado depois de cada teste
	public void testComplete() {
		System.out.println("Testes executados.");
	}

	@Test
	public void test1() {
		
		r = new Retangulo();
		try {
			assertTrue("Teste 1: Valores padrão estão errados.",
					r.getAltura() == 0 && r.getComprimento()== 0);
			System.out.println("Teste 1 completado com sucesso.");
		} catch (AssertionError e) {
			fail("Nunca deveria ter chegado aqui!");
			
		}
	}

	@Test
	public void test2() {
		
		r = new Retangulo();
		try {
			assertTrue("Test 2: Valores padrão estão errados.",
					r.getAltura() == 0 && r.getComprimento() == 0 && 
						r.getArea() == 0);
			System.out.println("Teste 2 completado com sucesso.");
		} catch (AssertionError e) {
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void test3() {
		
		r = new Retangulo();
		try {
			r = new Retangulo(10, 20);
			assertTrue("Teste 3: Valores iniciais estão errados.",
					r.getAltura() == 10 && r.getComprimento() == 20 && 
					r.getArea() == r.getAltura() * r.getComprimento());
			System.out.println("Teste 3 completado com sucesso.");
		} catch (AssertionError e) {
			fail("Falhou o teste");
		}
	}

	@Test
	public void test4() {
		
		r = new Retangulo();
		try {
			for (int i = 0; i < 5; i++) {
				rList[i] = new Retangulo(2 * i, 3 * i);
				assertTrue("Teste 4: Valores iniciais estão errados.",
						rList[i].getAltura() == 2 * i && rList[i].getComprimento() == 3 * i
								&& rList[i].getArea() == 6 * i * i);
			}
			System.out.println("Teste 4 completado com sucesso.");
		} catch (AssertionError e) {
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void test5() {
		
		r = new Retangulo();
		try {
			for (int i = 0; i < 5; i++) {
				rList[i] = new Retangulo(2 * i, 3 * i);
				rList[i].setAltura(11 * i);
				rList[i].setComprimento(7 * i);
				assertTrue("Teste 5: Valores modificados estão errados",
						rList[i].getAltura() == 11 * i && rList[i].getComprimento() == 7 * i
								&& rList[i].getArea() == 77 * i * i);
			}
			System.out.println("Teste 5 completado com sucesso.");
		} catch (AssertionError e) {
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void test6() {
		
		r = new Retangulo();
		try {
			for (int i = 0; i < 5; i++) {
				rList[i] = new Retangulo(2 * i, 3 * i);
				rList[i].setAltura(11 * i);
				rList[i].setComprimento(7 * i);
				assertTrue("Teste 6: Valores modificados estão errados.",
						rList[i].getAltura() == 11 * i && rList[i].getComprimento() == 7 * i
								&& rList[i].getArea() == 77 * i * i);
				System.out.println(rList[i]);
			}
			System.out.println("Teste 6 completado com sucesso.");
		} catch (AssertionError e) {
			System.out.println(e.getMessage());
		}
	}
	
	
	@Test
	public void test7() {
		
		r = new Retangulo();
		Assert.assertNotNull("Deveria ser nulo.", r);
		
	}

	public static void main(String[] args) {
		org.junit.runner.JUnitCore.main("RetanguloTests");
	}
}
