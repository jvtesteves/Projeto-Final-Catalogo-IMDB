package grupo.santander;

import java.util.ArrayList;
import java.util.List;

public class RepositorioGenerico<T> implements IRepositorioGenerico<T> {
    private List<T> entidades = new ArrayList<>();

    @Override
    public void adicionar(T entidade) {
        entidades.add(entidade);
    }

    @Override
    public List<T> listarTodos() {
        return new ArrayList<>(entidades);  // Retorna uma cópia da lista
    }
}
