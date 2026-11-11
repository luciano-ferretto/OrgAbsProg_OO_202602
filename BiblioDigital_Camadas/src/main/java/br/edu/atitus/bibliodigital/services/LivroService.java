package br.edu.atitus.bibliodigital.services;

import br.edu.atitus.bibliodigital.entities.Livro;
import br.edu.atitus.bibliodigital.repositories.LivroRepository;

import java.util.List;

public class LivroService {
    private final LivroRepository repository = new LivroRepository();

    public void inserir(Livro livro) {
        if (livro == null)
            throw new RuntimeException("Objeto Nulo");
        if (livro.getTitulo() == null || livro.getTitulo().isBlank())
            throw new RuntimeException("Título Inválido");
        livro.setTitulo(livro.getTitulo().trim());
        repository.inserir(livro);
    }

    public List<Livro> findAll() {
        return repository.findAll();
    }

    public List<Livro> findByTitulo(String parametro) {
        if (parametro == null || parametro.isBlank())
            throw new RuntimeException("Parâmetro inválido");
        return repository.findByTitulo(parametro);
    }

}
