package entidades;

public class ContaBanco {
	public int id;
	public double saldo;

	public double sacar(double saldo, double saque) throws Exception {
		if (saque > saldo) {
			throw new Exception("N�o � poss�vel sacar um valor maior que o saldo");
		}

		saldo = saldo - saque;
		return saldo;

	}

	public double depositar(double saldo, double deposito) throws Exception {
		if (deposito <= 0) {
			throw new Exception("N�o � poss�vel depositar");
		}
		return saldo + deposito;
	}
}
