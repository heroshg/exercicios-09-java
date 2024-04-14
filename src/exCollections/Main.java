package exCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Livro l1 = new Livro("O Senhor dos Anéis", "J.J.R Tolkien", "Fantasia Épica", 20);
        Livro l2 = new Livro("Orgulho e Preconceito", "Jane Austen", "Romance clássico", 25);
        Livro l3 = new Livro("Harry Potter e a Pedra Filosofal", "J.K. Rowling", "Fantasia infantojuvenil", 35);
        Livro l4 = new Livro("O Pequeno Príncipe", "Antoine de Saint-Exupéry", "Fábula", 0);
        Livro l5 = new Livro("Dom Quixote", "Miguel de Cervantes", "Romance", 30);
        List<Livro> livros = new ArrayList<>();
        livros.add(l1);
        livros.add(l2);
        livros.add(l3);
        livros.add(l4);
        livros.add(l5);
        Collections.sort(livros);
        Biblioteca bib = new Biblioteca("exCollections.Biblioteca 1", livros);

        Livro livroAEmprestar1 = new Livro("Harry Potter e a Pedra Filosofal", "J.K. Rowling", "Fantasia infantojuvenil", 35);
        Livro livroAEmprestar2  = new Livro("O Pequeno Príncipe", "Antoine de Saint-Exupéry", "Fábula", 5);
        Livro livroAEmprestar3  = new Livro("Dom Quixote", "Miguel de Cervantes", "Romance", 30);

        List<Livro> livrosAEmprestar = new ArrayList<Livro>();
        livrosAEmprestar.add(livroAEmprestar1);
        livrosAEmprestar.add(livroAEmprestar2);
        livrosAEmprestar.add(livroAEmprestar3);

        List<Livro> livrosEmprestados = bib.emprestarLivros(livrosAEmprestar);
        Cliente c1 = new Cliente("José");
        c1.setLivrosEmprestados(livrosEmprestados);
         List<Livro> livrosDevolvidos = bib.devolverLivros(livrosEmprestados);
        c1.setLivrosEmprestados(livrosDevolvidos);


    }
}