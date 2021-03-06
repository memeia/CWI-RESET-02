package br.com.cwi.resetflix.service;

import br.com.cwi.resetflix.domain.Genero;
import br.com.cwi.resetflix.entity.AtorEntity;
import br.com.cwi.resetflix.entity.DiretorEntity;
import br.com.cwi.resetflix.entity.FilmeEntity;
import br.com.cwi.resetflix.mapper.ConsultarDetalhesFilmeResponseMapper;
import br.com.cwi.resetflix.mapper.FilmeEntityMapper;
import br.com.cwi.resetflix.mapper.FilmesResponseMapper;
import br.com.cwi.resetflix.repository.AtoresRepository;
import br.com.cwi.resetflix.repository.DiretoresRepository;
import br.com.cwi.resetflix.repository.FilmesRepository;
import br.com.cwi.resetflix.request.CriarFilmeRequest;
import br.com.cwi.resetflix.response.ConsultarDetalhesFilmeResponse;
import br.com.cwi.resetflix.response.FilmeResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FilmesService {


    @Autowired
    private FilmesRepository filmesRepository;
    @Autowired
    private AtoresRepository atoresRepository;
    @Autowired
    private DiretoresRepository diretoresRepository;

    static FilmesResponseMapper MAPPER_RESPONSE = new FilmesResponseMapper();
    static FilmeEntityMapper MAPPER_ENTITY = new FilmeEntityMapper();
    static ConsultarDetalhesFilmeResponseMapper MAPPER_DETALHES_FILME = new ConsultarDetalhesFilmeResponseMapper();

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

    public ConsultarDetalhesFilmeResponse obterFilmePorId(final Long id) {
        FilmeEntity filme = filmesRepository.acharFilmePorId(id);
        DiretorEntity diretor = diretoresRepository . acharDiretorPorId(filme.getIdDiretor());
        List<AtorEntity> atores = new ArrayList<>();

        for (Long idAtor : filme.getIdsAtores()) {
            AtorEntity ator = atoresRepository.acharAtorPorId(idAtor);
            atores.add(ator);
        }

        return MAPPER_DETALHES_FILME.mapear(filme, diretor, atores);
    }
}
