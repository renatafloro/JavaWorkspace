package aula1;

import javax.swing.JOptionPane;

public class Aula1 {

	public static void main(String[] args) {
		//conceitos();
		//variaveis();
		//conversao();
		//arrayList();
	    //listaLinkada()
		//listaHashSet();
		  haskMapList();
	}
	
	
	public static void listaHashSet() {
		//não aceita valores duplicados
		HashSet<String> cars = new HashSet<String>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("BMW");
	    cars.add("Mazda");
	      
	    for(String car : cars) {
	    	System.out.println(car);
	    }
	    
	    
	}
	public static void listaLinkada() {
		//armazenar os valores em container
		LinkedList<String> cars = new LinkedList<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");

		// Use addFirst() to add the item to the beginning
		cars.addFirst("Mazda");
		System.out.println(cars);
	}
	
	public static void arrayList() {
		//simula o array
		//ao inserir recria o array original acrescentando a nova posição
		List<String> cars = new ArrayList<String>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");
	    System.out.println(cars);
	}
	
	public static void haskMapList() {
		 HashMap<String, String> capitais = new HashMap<String, String>();
		 capitais.put("sc", "Florianopolis");
		 capitais.put("pr", "Curitiba");
		 capitais.put("pr", "São Jose do Pinhais");
		 capitais.put("rs", "Porto Alegre");
		 
		 for (String key : capitais.keySet()) {
			  System.out.println("Chave: " + key + " Valor: " + capitais.get(key));
			}
	}
	//caseSensitive(diferencia maiusculo de minisculo)
	public static void variaveis() {
		
		String nome;
		String sobrenome;
		nome = JOptionPane.showInputDialog("Informe nome"); //pega dados digitados pelo usuário
		
		//String nome = "Renata";
		//String sobrenome;
		
		sobrenome = "Floro";
		String nomeCompleto = nome + " " + sobrenome;
		
		System.out.println(nomeCompleto);
		
	}
	
	public static void conceitos() {
		Aula2 obj; //declara um objeto
		obj = new Aula2(); //instancia o objeto
		obj.soma();
		
		//tipos primitivos
		float x;
		double d;
		int pint;
		
		//tipo complexo
		Float y;
		Double z;
		Integer cInt;
		
		//conversores de classe wrapper
		String nota = "10";
		System.out.println("Aula de conceitos");
	}

}
