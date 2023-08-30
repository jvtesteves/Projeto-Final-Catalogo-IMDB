package grupo.santander;

import java.util.List;

public interface IAtorRepositorio {
    void adicionar(Ator ator);
    List<Ator> listarTodos();
}
