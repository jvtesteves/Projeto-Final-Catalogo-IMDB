package grupo.santander;

import java.util.List;

public class DiretorRepositorio extends RepositorioGenerico<Diretor> implements IDiretorRepositorio {

    @Override
    public void adicionar(Diretor diretor) {
        super.adicionar(diretor);
    }

    @Override
    public List<Diretor> listarTodos() {
        return super.listarTodos();
    }
}
