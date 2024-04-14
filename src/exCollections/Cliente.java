package exCollections;

import exCollections.Livro;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome;

    private List<Livro> livrosEmprestados;

    public Cliente(String nome) {
        this.nome = nome;
        this.livrosEmprestados = new ArrayList<Livro>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Livro> getLivrosEmprestados() {
        return livrosEmprestados;
    }

    public void setLivrosEmprestados(List<Livro> livrosEmprestados) {
        this.livrosEmprestados = livrosEmprestados;
    }

    @Override
    public String toString() {
        return "exCollections.Cliente{" +
                "nome='" + nome + '\'' +
                ", livros=" + livrosEmprestados +
                '}';
    }

}
