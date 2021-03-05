package br.com.cwi.resetflix.service;

import br.com.cwi.resetflix.domain.Genero;
import br.com.cwi.resetflix.entity.FilmeEntity;
import br.com.cwi.resetflix.mapper.ConsultarDetalhesFilmeResponseMapper;
import br.com.cwi.resetflix.mapper.FilmeEntityMapper;
import br.com.cwi.resetflix.mapper.FilmesResponseMapper;
import br.com.cwi.resetflix.repository.FilmesRepository;
import br.com.cwi.resetflix.request.CriarFilmeRequest;
import br.com.cwi.resetflix.response.FilmeResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FilmesService {


    @Autowired
    private FilmesRepository filmesRepository;


    static FilmesResponseMapper MAPPER_RESPONSE = new FilmesResponseMapper();
    static FilmeEntityMapper MAPPER_ENTITY = new FilmeEntityMapper();
//    static ConsultarDetalhesFilmeResponseMapper MAPPER_DETALHES_FILME = new ConsultarDetalhesFimeResponseMapper();

    public List<FilmeResponse> getFilmes(Genero genero) {
        List<FilmeEntity> filmes = filmesRepository.getFilmes();

        if (genero != null) {
            List<FilmeEntity> filmesDesseGenero = new ArrayList<FilmeEntity>();
            for (FilmeEntity filme: filmes) {
                if (genero == filme.getGenero()){
                    filmesDesseGenero.add(filme);
                }

            }
            return MAPPER_RESPONSE.mapear(filmesDesseGenero);

        }

        return MAPPER_RESPONSE.mapear(filmes);
    }

    public Long criarFilme(final CriarFilmeRequest request) {
        FilmeEntity filmeSalvar = MAPPER_ENTITY.mapear(request);
        return filmesRepository.criarFilme(filmeSalvar);
    }
//
//    public ConsultarDetalhesFilmesResponse consultarDetalhesFilme(final Long id) {
//        FilmeEntity filmeSalvo = filmesRepository.acharFilmePorId(id);
//        List<FilmeEntity> filmesAtor = filmeRepository.acharFilmesAtor(id);
//        return MAPPER_DETALHES_ATOR.mapear(atorSalvo, filmesAtor);
//    }
}
