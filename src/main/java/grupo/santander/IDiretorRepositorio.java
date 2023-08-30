package grupo.santander;

import java.util.List;

public interface IDiretorRepositorio {
    void adicionar(Diretor diretor);
    List<Diretor> listarTodos();
}
