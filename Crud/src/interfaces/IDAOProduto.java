package interfaces;

import java.util.List;


import entidade.Produto;

public interface IDAOProduto {
	boolean salvar(Produto ct);

	Produto getContato(int id);

	List<Produto> getContatos();

	boolean alterar(Produto ct);

	boolean deletar(int id);
}
