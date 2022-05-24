package interfaces;

import java.util.List;

import entidade.Contato;

public interface IDAOContato {
   boolean salvar(Contato ct);
   Contato getContato(int id);
   List<Contato> getContatos();
   boolean alterar(Contato ct);
   boolean deletar(int id);
}