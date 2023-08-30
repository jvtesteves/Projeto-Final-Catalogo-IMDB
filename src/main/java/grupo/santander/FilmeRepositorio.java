package grupo.santander;

import java.util.ArrayList;
import java.util.List;

public class FilmeRepositorio implements IFilmeRepositorio {
    private List<Filme> filmes = new ArrayList<>();

    @Override
    public void adicionar(Filme filme) {
        filmes.add(filme);
    }

    @Override
    public List<Filme> listarTodos() {
        return new ArrayList<>(filmes);  // Retorna uma cópia da lista
    }

    @Override
    public Filme buscarPorNome(String nome) {
        for (Filme f : filmes) {
            if (f.getNome().equalsIgnoreCase(nome)) {
                return f;
            }
        }
        return null;
    }
}
