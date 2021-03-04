package br.com.cwi.resetflix.service;

import br.com.cwi.resetflix.entity.FilmeEntity;
import br.com.cwi.resetflix.repository.FilmesRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class FlimesService {


    @Autowired
    private FilmesRepository filmesRepository;


    static FilmeResponseMapper MAPPER_RESPONSE = new FilmesResponseMapper();
    static FilmesEntityMapper MAPPER_ENTITY = new FilmeEntityMapper();
    static ConsultarDetalhesFilmeResponseMapper MAPPER_DETALHES_FILME = new ConsultarDetalhesFimeResponseMapper();

    public List<FilmesResponse> getFilmes() {
        final List<FilmeEntity> atores = filmesRepositoryRepository.getFilmes();
        return MAPPER_RESPONSE.mapear(filmes);
    }

    public Long criarFilme(final CriarFilmeRequestRequest request) {
        FilmeEntity filmeSalvar = MAPPER_ENTITY.mapear(request);
        return filmesRepository.criarFilme(filmeSalvar);
    }

    public ConsultarDetalhesFilmesResponse consultarDetalhesFilme(final Long id) {
        FilmeEntity filmeSalvo = filmesRepository.acharFilmePorId(id);
        List<FilmeEntity> filmesAtor = filmeRepository.acharFilmesAtor(id);
        return MAPPER_DETALHES_ATOR.mapear(atorSalvo, filmesAtor);
    }
}
