package br.com.cwi.resetflix.repository;

import br.com.cwi.resetflix.entity.FilmeEntity;
import br.com.cwi.resetflix.entity.SerieEntity;

import java.util.ArrayList;
import java.util.List;

public class SeriesRepository {

    static List<SerieEntity> series = new ArrayList<>();
    static Long contadorIds = 1l;


    public List<SerieEntity> getSeries(){
        return series;
    }

    public SerieEntity acharSeriePorId(final Long id){
        for(SerieEntity serie : series){
            if(serie.getId().equals(id)){
                return serie;
            }
        }

        return null;
    }

    public Long criarSerie(SerieEntity serieSalvar) {
        serieSalvar.setId(contadorIds);
        contadorIds++;

        series.add(serieSalvar);

        return serieSalvar.getId();

    }
}
