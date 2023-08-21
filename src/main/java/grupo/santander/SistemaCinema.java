package grupo.santander;

import java.util.List;

public class SistemaCinema {
    private FilmeRepositorio filmeRepo = new FilmeRepositorio();
    private AtorRepositorio atorRepo = new AtorRepositorio();
    private DiretorRepositorio diretorRepo = new DiretorRepositorio();

    // CRUD para Filmes
    public void cadastrarFilme(Filme filme) {
        filmeRepo.adicionar(filme);
    }

    public List<Filme> listarFilmes() {
        return filmeRepo.listarTodos();
    }

    public Filme buscarFilmePorNome(String nome) {
        return filmeRepo.buscarPorNome(nome);
    }

    // CRUD para Atores
    public void cadastrarAtor(Ator ator) {
        atorRepo.adicionar(ator);
    }

    public List<Ator> listarAtores() {
        return atorRepo.listarTodos();
    }

    // CRUD para Diretores
    public void cadastrarDiretor(Diretor diretor) {
        diretorRepo.adicionar(diretor);
    }

    public List<Diretor> listarDiretores() {
        return diretorRepo.listarTodos();
    }

    // Associação de atores e diretores a filmes
    public boolean associarAtorAFilme(String nomeFilme, Ator ator) {
        Filme filme = buscarFilmePorNome(nomeFilme);
        if (filme != null && ator != null) {
            filme.adicionarAtor(ator);
            return true;
        }
        return false;
    }

    public boolean definirDiretorParaFilme(String nomeFilme, Diretor diretor) {
        Filme filme = buscarFilmePorNome(nomeFilme);
        if (filme != null && diretor != null) {
            filme.definirDiretor(diretor);
            return true;
        }
        return false;
    }
}

