package br.com.cwi.resetflix.repository;

import static java.util.Arrays.asList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.cwi.resetflix.entity.AtorEntity;
import org.springframework.stereotype.Repository;

import br.com.cwi.resetflix.domain.Genero;
import br.com.cwi.resetflix.entity.FilmeEntity;

@Repository
public class FilmesRepository {

    static List<FilmeEntity> filmes = new ArrayList<>();
    static Long contadorIds = 1l;


    public List<FilmeEntity> getFilmes(){
        return filmes;
    }

    public FilmeEntity acharFilmePorId(final Long id){
        for(FilmeEntity filme : filmes){
            if(filme.getId().equals(id)){
                return filme;
            }
        }

        return null;
    }

    public List<FilmeEntity> acharFilmesAtor(final Long id) {
        //TODO Filtrar na repository por id de ator
        return filmes;
    }

    public List<FilmeEntity> acharFilmesDiretor(final Long id) {
        //TODO Filtrar na repository por id de diretor
        return filmes;
    }

    public Long criarFilme(FilmeEntity filmeSalvar) {
        filmeSalvar.setId(contadorIds);
        contadorIds++;

        filmes.add(filmeSalvar);

        return filmeSalvar.getId();

    }
}
