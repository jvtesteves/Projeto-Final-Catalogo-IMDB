package grupo.santander;

import java.util.List;

public interface IFilmeRepositorio {
    void adicionar(Filme filme);
    List<Filme> listarTodos();
    Filme buscarPorNome(String nome);
}
