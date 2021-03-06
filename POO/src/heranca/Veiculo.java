package heranca;

public class Veiculo {
    private String marca;
    private String modelo;
    private String placa;
        
	public Veiculo(String marca, String modelo, String placa) {
		this.marca = marca;
		this.modelo = modelo;
		this.placa = placa;
	}

	public Veiculo() {
	}

	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public String getPlaca() {
		return placa;
	}
	
	public void setPlaca(String placa) {
		this.placa = placa;
	}

	@Override
	public String toString() {
		return "Veiculo [marca=" + marca + ", modelo=" + modelo + ", placa=" + placa + "]";
	}
    
	public void imprimirDados() {
		System.out.println("Marca.: " + this.marca);
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Placa.: " + this.placa);
	}
}