package br.com.cwi.resetflix.mapper;

import br.com.cwi.resetflix.entity.AtorEntity;
import br.com.cwi.resetflix.entity.DiretorEntity;
import br.com.cwi.resetflix.entity.FilmeEntity;
import br.com.cwi.resetflix.entity.SerieEntity;
import br.com.cwi.resetflix.response.ConsultarDetalhesFilmeResponse;
import br.com.cwi.resetflix.response.ConsultarDetalhesSerieResponse;
import br.com.cwi.resetflix.response.DiretoresResponse;

import java.util.List;

public class ConsultarDetalhesSerieResponseMapper {

    public ConsultarDetalhesSerieResponse mapear(SerieEntity serie, DiretorEntity diretor, List<AtorEntity> atores) {
        return new ConsultarDetalhesSerieResponse(
                serie.getId(),
                serie.getNome(),
                serie.getGenero(),
                new DiretoresResponse(diretor.getId(), diretor.getNome()),
                new AtoresResponseMapper().mapear(atores)
                );
    }

}
