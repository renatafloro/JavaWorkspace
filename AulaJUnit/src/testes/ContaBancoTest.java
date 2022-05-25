package testes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import entidades.ContaBanco;

public class ContaBancoTest {
	
	
	@Test
	public void saqueMaiorQueSaldo() {
		ContaBanco conta = new ContaBanco();
		double saldo = 280.0;
		double saque = 282.0;

		Exception ex = Assertions.assertThrows(Exception.class, () -> conta.sacar(saldo, saque));
		Assertions.assertTrue(ex.getMessage().contains("Não é possível sacar um valor maior que o saldo"));
	}

	@Test
	public void okQUandoSaqueMenorQueSaldo() throws Exception {
		ContaBanco conta = new ContaBanco();
		double saldo = 280.0;
		double saque = 220.0;
		double retorno = 60.0;
		double novoSaldo = conta.sacar(saldo, saque);
		Assertions.assertEquals(retorno, novoSaldo);

	}

	@Test
	public void okQUandoDepositoMaiorQueZero() throws Exception {
		ContaBanco conta = new ContaBanco();
		double saldo = 280.0;
		double deposito = 20.0;
		double retorno = 300.0;
		double novoSaldo = conta.depositar(saldo, deposito);
		Assertions.assertEquals(retorno, novoSaldo);

	}

	@Test
	public void depositoMenorOuIgualAZero() {
		ContaBanco conta = new ContaBanco();
		double saldo = 280.0;
		double deposito = 0.0;

		Exception ex = Assertions.assertThrows(Exception.class, () -> conta.depositar(saldo, deposito));
		Assertions.assertTrue(ex.getMessage().contains("Não é possível depositar"));
	}

	@Test
	public void saquePorId() {

	}

}
