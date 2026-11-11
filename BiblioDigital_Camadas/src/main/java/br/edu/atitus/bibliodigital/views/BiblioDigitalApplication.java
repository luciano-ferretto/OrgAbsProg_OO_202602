package br.edu.atitus.bibliodigital.views;

import br.edu.atitus.bibliodigital.entities.Livro;
import br.edu.atitus.bibliodigital.entities.LivroFisico;
import br.edu.atitus.bibliodigital.services.LivroService;

import java.util.List;

public class BiblioDigitalApplication {
    private final LivroService service = new LivroService();
    void main() {
        try {
            String titulo = IO.readln("Digite o título: ");
            Livro novo = new LivroFisico(titulo,null, 0, 0, null);
            service.inserir(novo);

            List<Livro> all = service.findAll();
            for (Livro livro : all) {
                IO.println(livro);
            }

            String pesquisa = IO.readln("Pesquisa por título: ");
            List<Livro> livrosEncontrados = service.findByTitulo(pesquisa);
            if (livrosEncontrados.isEmpty())
                IO.println("Nenhum livro encontrado");
            else {
                for (Livro livro : livrosEncontrados) {
                    IO.println(livro);
                }
            }


        } catch (RuntimeException ex) {
            IO.println("Erro: " + ex.getMessage());
        }
    }
}
