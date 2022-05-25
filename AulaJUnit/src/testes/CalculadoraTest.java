package testes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import entidades.Calculadora;

public class CalculadoraTest {
	//AAA
	
    //Soma
	@Test
	public void resultadoDeveSerDezQuandoSomarCinco() {
		//Arrange
		Calculadora calculadora = new Calculadora();
		//Act
		double resultado = calculadora.somar(5.0, 5.0);
		double valorEsperado = 10.0;
		//Assert
		Assertions.assertEquals(valorEsperado, resultado);
	}
	
	//Subtração
	@Test
	public void resultadoDeveSerZeroQuandoSubtrairCinco() {
		Calculadora calculadora = new Calculadora();
		double resultado = calculadora.subtrair(5.0, 5.0);
		double valorEsperado = 0.0;
		Assertions.assertEquals(valorEsperado, resultado);
	}
	
	@Test
	public void resultadoOkQuandoDiminuirDoisNumeros() {
		Calculadora calculadora = new Calculadora();
		double n1= 50;
		double n2 = 100;
		
		double valorEsperado = -50;
		double valorRetornado= calculadora.subtrair(n1, n2);
		Assertions.assertEquals(valorEsperado, valorRetornado);
	}
	
	//Multiplicação
	@Test
	public void resultadoDeveSerOitentaeumQuandoMultiplicarNove() {
		Calculadora calculadora = new Calculadora();
		double resultado = calculadora.multiplicar(9.0, 9.0);
		double valorEsperado = 81.0;
		Assertions.assertEquals(valorEsperado, resultado);
	}
	
	@Test
	public void resultadoQuandoMultiplicarDoisNumeros() {
		Calculadora calculadora = new Calculadora();
		double valor = 100.0;
		double multiplicador= 2.0;
		double valorEsperado = 200.0;
		double valorRetornado= calculadora.multiplicar(valor, multiplicador);
		Assertions.assertEquals(valorEsperado, valorRetornado);
	}
	
	//Divisão
	@Test
	public void resultadoDeveSerQuatroQuandoDivididoPorCinco() {
		Calculadora calculadora = new Calculadora();
		double resultado;
		try {
			resultado = calculadora.dividir(20.0, 5.0);
			double valorEsperado = 4.0;
			Assertions.assertEquals(valorEsperado, resultado);
		} catch (Exception e) {
			e.printStackTrace();
		    Assertions.assertTrue(false);
		}	
	}
	
	@Test
	public void resultadoDivisaoOkQuandoDivisorDiferenteZero() throws Exception {
		Calculadora calculadora = new Calculadora();
		double dividendo = 20.0;
		double divisor=10.0;
		double valorEsperado = 2.0;
		double valorRetornado = calculadora.dividir(dividendo,divisor);
		Assertions.assertEquals(valorEsperado, valorRetornado);
		
	}
	
	@Test
	public void divisaoLancaExcecaoQuandoDivisorZero(){
		//Arrange
		Calculadora calculadora = new Calculadora();
		double dividendo = 20.0;
		double divisor= 0.0;
		
		// Act
		Exception ex = Assertions.assertThrows(Exception.class, () -> calculadora.dividir(dividendo, divisor));
		Assertions.assertTrue(ex.getMessage().contains("Não é possível dividir por zero"));
	}
}





























