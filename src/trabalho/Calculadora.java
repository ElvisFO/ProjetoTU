package trabalho;

import java.math.BigDecimal;

public class Calculadora
{
  /**
   * Realiza a soma de dois valores inteiros
   * @param a Primeiro valor
   * @param b Segundo valor
   * @return Resultado da referida opera��o nos dois inteiros
   */
  public int soma(int a, int b)
  {
    return a + b;
  }

  /**
   * Realiza a subtra��o de dois valores inteiros
   * @param a Primeiro valor
   * @param b Segundo valor
   * @return Resultado da referida opera��o nos dois inteiros
   */
  public int subtracao(int a, int b)
  {
    return a - b;
  }

  /**
   * Realiza a multiplica��o de dois valores inteiros
   * @param a Primeiro valor
   * @param b Segundo valor
   * @return Resultado da referida opera��o nos dois inteiros
   */
  public double multiplicacao(int a, int b)
  {
    return a * b;
  }

  /**
   * Realiza a divis�o de dois valores inteiros
   * @param a Primeiro valor
   * @param b Segundo valor
   * @return Resultado da referida opera��o nos dois inteiros
   */
  public double divisao(int a, int b)
  {
    if (b == 0)
    {
      return 0;
    }
    return a / b;
  }

  /**
   * Realiza a multiplica��o de dois valores 
   * @param quantidade - a quantidade ser multiplicada
   * @param valor - o valor pelo qual será multiplicada a quantidade
   * @return Resultado da referida opera��o nos dois valores
   */
  public BigDecimal multiplicacao(Integer quantidade, BigDecimal valor)
  {
    if (quantidade != null && valor != null)
    {
      return valor.multiply(new BigDecimal(quantidade));
    }
    return null;
  }
}
