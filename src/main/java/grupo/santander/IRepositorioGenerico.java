package grupo.santander;

import java.util.List;

public interface IRepositorioGenerico<T> {
    void adicionar(T entidade);
    List<T> listarTodos();
    // Pode adicionar outros métodos CRUD aqui, como remover, atualizar, etc.
}

