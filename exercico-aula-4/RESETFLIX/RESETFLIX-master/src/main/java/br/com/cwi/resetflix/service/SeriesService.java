package br.com.cwi.resetflix.service;

import br.com.cwi.resetflix.domain.Genero;
import br.com.cwi.resetflix.entity.AtorEntity;
import br.com.cwi.resetflix.entity.DiretorEntity;
import br.com.cwi.resetflix.entity.SerieEntity;
import br.com.cwi.resetflix.mapper.*;
import br.com.cwi.resetflix.repository.AtoresRepository;
import br.com.cwi.resetflix.repository.DiretoresRepository;
import br.com.cwi.resetflix.repository.SeriesRepository;
import br.com.cwi.resetflix.request.CriarSerieRequest;
import br.com.cwi.resetflix.response.ConsultarDetalhesSerieResponse;
import br.com.cwi.resetflix.response.SerieResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SeriesService {

    @Autowired
    private SeriesRepository seriesRepository;
    @Autowired
    private AtoresRepository atoresRepository;
    @Autowired
    private DiretoresRepository diretoresRepository;

    static SeriesResponseMapper MAPPER_RESPONSE = new SeriesResponseMapper();
    static SerieEntityMapper MAPPER_ENTITY = new SerieEntityMapper();
    static ConsultarDetalhesSerieResponseMapper MAPPER_DETALHES_SERIE = new ConsultarDetalhesSerieResponseMapper();

    public List<SerieResponse> getSeries(Genero genero) {
        List<SerieEntity> series = seriesRepository.getSeries();

        if (genero != null) {
            List<SerieEntity> seriesDesseGenero = new ArrayList<SerieEntity>();
            for (SerieEntity serie: series) {
                if (genero == serie.getGenero()){
                    seriesDesseGenero.add(serie);
                }

            }
            return MAPPER_RESPONSE.mapear(seriesDesseGenero);

        }

        return MAPPER_RESPONSE.mapear(series);
    }

    public Long criarSerie(final CriarSerieRequest request) {
        SerieEntity serieSalvar = MAPPER_ENTITY.mapear(request);
        return seriesRepository.criarSerie(serieSalvar);
    }

    public ConsultarDetalhesSerieResponse obterSeriePorId(final Long id) {
        SerieEntity serie = seriesRepository.acharSeriePorId(id);
        DiretorEntity diretor = diretoresRepository . acharDiretorPorId(serie.getIdDiretor());
        List<AtorEntity> atores = new ArrayList<>();

        for (Long idAtor : serie.getIdsAtores()) {
            AtorEntity ator = atoresRepository.acharAtorPorId(idAtor);
            atores.add(ator);
        }

        return MAPPER_DETALHES_SERIE.mapear(serie, diretor, atores);
    }
}
