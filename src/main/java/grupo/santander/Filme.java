package jv.santander;

import java.util.ArrayList;
import java.util.List;

public class Filme {
    private String nome;
    private String dataLancamento;
    private double orcamento;
    private String descricao;
    private Diretor diretor;
    private List<Ator> atores = new ArrayList<>();

    // Construtor
    public Filme(String nome, String dataLancamento, double orcamento, String descricao) {
        this.nome = nome;
        this.dataLancamento = dataLancamento;
        this.orcamento = orcamento;
        this.descricao = descricao;
    }

    // Adicionar um ator ao filme
    public void adicionarAtor(Ator ator) {
        if (ator != null && !atores.contains(ator)) {
            this.atores.add(ator);
        }
    }

    // Definir o diretor do filme
    public void definirDiretor(Diretor diretor) {
        this.diretor = diretor;
    }

    // Retornar uma representação textual do filme
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nome: ").append(nome).append("\n");
        sb.append("Data de Lançamento: ").append(dataLancamento).append("\n");
        sb.append("Orçamento: $").append(orcamento).append("\n");
        sb.append("Descrição: ").append(descricao).append("\n");
        sb.append("Diretor: ").append((diretor != null) ? diretor.getNome() : "N/A").append("\n");
        sb.append("Atores: \n");
        for (Ator ator : atores) {
            sb.append("- ").append(ator.getNome()).append("\n");
        }
        return sb.toString();
    }

    // Getters e Setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome != null && !nome.trim().isEmpty()) {
            this.nome = nome;
        }
    }

    public String getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(String dataLancamento) {
        if (dataLancamento != null && !dataLancamento.trim().isEmpty()) {
            this.dataLancamento = dataLancamento;
        }
    }

    public double getOrcamento() {
        return orcamento;
    }

    public void setOrcamento(double orcamento) {
        if (orcamento > 0) {
            this.orcamento = orcamento;
        }
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        if (descricao != null && !descricao.trim().isEmpty()) {
            this.descricao = descricao;
        }
    }

    public Diretor getDiretor() {
        return diretor;
    }

    public List<Ator> getAtores() {
        return new ArrayList<>(atores); // Retorna uma cópia da lista para garantir a encapsulação
    }
}

