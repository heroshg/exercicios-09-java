package exCollections;

public class Livro implements Comparable<Livro> {

    private String nome;
    private String autor;
    private String Genero;
    private int quantidade;

    public Livro(String nome, String autor, String genero, int quantidade) {
        this.nome = nome;
        this.autor = autor;
        Genero = genero;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String genero) {
        Genero = genero;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade += quantidade;
    }

    @Override
    public int compareTo(Livro l) {
        return nome.compareTo(l.getNome());
    }

    @Override
    public String toString() {
        return "exCollections.Livro{" +
                "nome='" + nome + '\'' +
                ", autor='" + autor + '\'' +
                ", Genero='" + Genero + '\'' +
                ", quantidade=" + quantidade +
                '}';
    }

    public int verEstoque() {
        return quantidade;
    }



}
