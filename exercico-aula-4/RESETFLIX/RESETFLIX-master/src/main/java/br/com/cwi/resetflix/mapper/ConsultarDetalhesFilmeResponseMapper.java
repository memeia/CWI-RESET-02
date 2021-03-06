package br.com.cwi.resetflix.mapper;

import br.com.cwi.resetflix.entity.AtorEntity;
import br.com.cwi.resetflix.entity.DiretorEntity;
import br.com.cwi.resetflix.entity.FilmeEntity;
import br.com.cwi.resetflix.response.ConsultarDetalhesFilmeResponse;
import br.com.cwi.resetflix.response.DiretoresResponse;

import java.util.List;

public class ConsultarDetalhesFilmeResponseMapper {

    public ConsultarDetalhesFilmeResponse mapear(FilmeEntity filme, DiretorEntity diretor, List<AtorEntity> atores) {
        return new ConsultarDetalhesFilmeResponse(
                filme.getId(),
                filme.getNome(),
                filme.getGenero(),
                new DiretoresResponse(diretor.getId(), diretor.getNome()),
                new AtoresResponseMapper().mapear(atores)
                );
    }

}
