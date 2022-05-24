package enteties;

public class Pessoa {

	private String nome;
	private String email; 
	private String cpf;
	
	public Pessoa(){
		System.out.println("chamou o construtor");
	}
	
	public Pessoa(String nome) {
		this.nome = nome;
	}
	
	public Pessoa(String nome, String email, String cpf) {
		this.email = email;
		this.nome = nome;
		this.cpf = cpf;
	}
	
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		if(cpf.length() == 11) {
			this.cpf = cpf;
		} else {
			System.out.println("cpf invalido");
		}
	}

	public void setNome(String nome) {
		   this.nome = nome;
	   }
	   
	   public void setEmail(String email) {
		   if(email.contains("@")) {
			   this.email = email;  
		   }
		   else {
			   System.out.println("Email inválido!");
		   }	   
	   }
	   
	   public String getNome() {
		   return this.nome;
	   }
	   
	   public String getEmail() {
		   return this.email;
	   }
	}

	//modificador public -> fica visivel em todas as classes que instanciarem a classe
	//modificador private -> fica visivel somente dentro da classe
