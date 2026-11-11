package br.edu.atitus.bibliodigital.repositories;


import br.edu.atitus.bibliodigital.entities.Livro;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class LivroRepository {
    private List<Livro> acervo = new ArrayList<>();

    public List<Livro> findAll() {
        return acervo;
    }
    public void inserir(Livro livro) {
        acervo.add(livro);
    }
    public List<Livro> findByTitulo(String parametro) {
        List<Livro> resultado = new ArrayList<>();
        for (Livro livro :acervo) {
            /*String titulo = livro.getTitulo();
            String tituloUpper = titulo.toUpperCase();
            String parametroUpper = parametro.toUpperCase();
            if (tituloUpper.contains(parametroUpper))*/
            if (livro.getTitulo().toUpperCase().contains(parametro.toUpperCase())) {
                resultado.add(livro);
            }
        }
        return resultado;
    }

    //alterar
    //findByTitulo
    //findByAutor
    //removeByIndex

}
