package br.com.cwi.resetflix.mapper;

import br.com.cwi.resetflix.entity.FilmeEntity;
import br.com.cwi.resetflix.entity.SerieEntity;
import br.com.cwi.resetflix.request.CriarFilmeRequest;
import br.com.cwi.resetflix.request.CriarSerieRequest;

public class SerieEntityMapper {
    public SerieEntity mapear(final CriarSerieRequest request) {
        return new SerieEntity(request.getNome(),request.getGenero(),request.getIdDiretor(),request.getIdsAtores()
                );
    }
}
