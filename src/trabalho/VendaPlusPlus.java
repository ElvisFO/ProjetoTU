package trabalho;

import java.math.BigDecimal;

public class VendaPlusPlus
{

  private Integer quantidade;

  private BigDecimal valor;

  private Calculadora calculadora;

  public VendaPlusPlus(Integer quantidade, BigDecimal valor,
    Calculadora calculadora)
  {
    this.quantidade = quantidade;
    this.valor = valor;
    this.calculadora = calculadora;
  }

  
  public BigDecimal calcularValorTotal()
  {
    if (quantidade == null || valor == null)
    {
      throw new IllegalArgumentException();
    }

    BigDecimal resultado = calculadora.multiplicacao(quantidade, valor);
    if (resultado.compareTo(new BigDecimal("100")) >= 1)
    {
      throw new RuntimeException("O resultado não pode ser maior que 100");
    }
    return resultado;
  }

  public Integer getQuantidade()
  {
    return this.quantidade;
  }

  public BigDecimal getValor()
  {
    return this.valor;
  }
}
