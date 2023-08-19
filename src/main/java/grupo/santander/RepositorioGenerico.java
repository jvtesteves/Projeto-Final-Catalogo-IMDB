package grupo.santander;


import java.util.ArrayList;
import java.util.List;

public class RepositorioGenerico<T> {
    private List<T> entidades = new ArrayList<>();

    public void adicionar(T entidade) {
        entidades.add(entidade);
    }

    public List<T> listarTodos() {
        return new ArrayList<>(entidades);  // Retorna uma cópia da lista
    }

    // Pode adicionar outros métodos CRUD aqui, como remover, atualizar, etc.
}
