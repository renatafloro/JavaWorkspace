package desafio;

public class Desafio {

	public static void main(String[] args) {
		Pessoa p1= new Pessoa(1, "Renata", "renata@gmail.com");
		p1.display();
		p1.salvar();
		
		
		/*PessoaFisica pf = new PessoaFisica();
		pf.setId(10);
		pf.setNome("Ana Maria");
		pf.setContato("ana@gmail.com");
		pf.setCpf("10870330470");
		System.out.println(pf.getCpf());*/
		
		PessoaFisica pf2 = new PessoaFisica(2, "Marcelo","marcelo@gmail.com","10780350480");
		pf2.display();

		/*PessoaJuridica pj = new PessoaJuridica();
		pj.setId(12);
		pj.setNome("Apaixonadoces");
		pj.setContato("apaixonadoces@gmail.com");
		pj.setCnpj("131215164852");
		pj.display();*/
		
		PessoaJuridica pj2 = new PessoaJuridica(3, "Renner", "renner@gmail.com", "123455476");
		pj2.display();
	}

}
