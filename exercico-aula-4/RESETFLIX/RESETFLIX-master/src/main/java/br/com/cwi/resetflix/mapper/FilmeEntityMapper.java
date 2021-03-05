package br.com.cwi.resetflix.mapper;

import br.com.cwi.resetflix.entity.AtorEntity;
import br.com.cwi.resetflix.entity.FilmeEntity;
import br.com.cwi.resetflix.request.CriarAtorRequest;
import br.com.cwi.resetflix.request.CriarFilmeRequest;

public class FilmeEntityMapper {
    public FilmeEntity mapear(final CriarFilmeRequest request) {
        return new FilmeEntity(request.getNome(),request.getGenero(),request.getIdDiretor(),request.getIdsAtores()
                );
    }
}
