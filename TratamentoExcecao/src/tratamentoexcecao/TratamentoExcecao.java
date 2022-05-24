package tratamentoexcecao;

import javax.swing.JOptionPane;

import entidades.Contato;

public class TratamentoExcecao {

	public static void main(String[] args) {
		// tratandoExcecao();
		// usarFinaly();
		/*try {
			lancarExcecao();	
		}
		catch(ArithmeticException | NullPointerException e) {
			System.out.println(e.toString());
		}*/
		usandoExcecaoPersonalizada()
	}

	public static void usandoExcecaoPersonalizada() trhows MinhaExcecao() {
		
		
	}
	
	public static void lancarExcecao() throws ArithmeticException, NullPointerException {
		float peso = 101;
		if(peso < 100) {
			throw new NullPointerException("Voçê ainda pode engordar 2 kilos");
		}
		int idade = 17;
		if (idade < 18) {
			throw new ArithmeticException("Voçê é menor de idade");
		}		
	}
	public static void tratandoExcecao() {
		Contato ct = new Contato();
		int x = 10;
		int y = 0;
		try {

			int[] numeros = { 10, 20, 30 };
			System.out.println(numeros[2]);

			int z = x / y;
			System.out.println(z);

			ct.setNome("maria");
			System.out.println(ct.getNome());

			String speso = JOptionPane.showInputDialog("Informe peso");
			float peso = Float.parseFloat(speso);

		} catch (ArithmeticException e) {
			System.out.println("Não é possível dividir esses valores");
			System.out.println("toString: " + e.toString());
			System.out.println("Message: " + e.getMessage());
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Posição inválida");
		} catch (NullPointerException e) {
			System.out.println("Exceção na execução do programa");
		} catch (NumberFormatException e) {
			System.out.println("Entrada incorreta: " + e.getMessage());
		}
	}

	public static void usarFinaly() {
		try {
			System.out.println("Conectou no banco");
			int x = 10;
			int y = 0;
			int z = x / y;
		} catch (Exception e) {
			System.out.println("Ocorreu erro");
		} finally {
			System.out.println("Fechou conexão");
		}

	}

}

//catch como se fosse retorno de evento do try