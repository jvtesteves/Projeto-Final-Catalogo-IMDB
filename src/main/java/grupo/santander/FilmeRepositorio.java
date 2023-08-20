package jv.santander;

import java.util.ArrayList;
import java.util.List;
public class FilmeRepositorio {
    private List<Filme> filmes = new ArrayList<>();

    public void adicionar(Filme filme) {
        filmes.add(filme);
    }

    public List<Filme> listarTodos() {
        return new ArrayList<>(filmes);  // Retorna uma cópia da lista
    }

    public Filme buscarPorNome(String nome) {
        for (Filme f : filmes) {
            if (f.getNome().equalsIgnoreCase(nome)) {
                return f;
            }
        }
        return null;
    }

}

