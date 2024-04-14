package exCollections;

import exCollections.Livro;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private String nome;
    private List<Livro> livrosDisponiveis;
    public Biblioteca(String nome, List<Livro> livrosDisponiveis) {
        this.nome = nome;
        this.livrosDisponiveis = livrosDisponiveis;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Livro> getLivrosDisponiveis() {
        return livrosDisponiveis;
    }

    public void setLivrosDisponiveis(List<Livro> livrosDisponiveis) {
        this.livrosDisponiveis = livrosDisponiveis;
    }

    @Override
    public String toString() {
        return "exCollections.Biblioteca{" +
                "nome='" + nome + '\'' +
                ", livrosDisponiveis=" + livrosDisponiveis +
                '}';
    }

    public List<Livro> emprestarLivros(List<Livro> listaLivros) {
        for(Livro l : listaLivros) {
            if(l.verEstoque() > 0) {
                listaLivros.add(l);
                l.setQuantidade(l.getQuantidade() - 1);
                return listaLivros;
            }
        }
        System.out.println("exCollections.Livro em falta no estoque!");
        return new ArrayList<>();

    }

    public List<Livro> devolverLivros(List<Livro> listaLivros) {
        for (Livro l : listaLivros) {
            l.setQuantidade(l.getQuantidade());
        }
        listaLivros = new ArrayList<>();
        return listaLivros;
    }
}
