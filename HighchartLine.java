package com.arbol_logika.highcharts;

import java.util.ArrayList;
import java.util.List;

public class HighchartLine extends HighchartXY implements Series {

    private List<Serie> series;

    public HighchartLine(List<Object[]> query) {
        super(query, Chart.LINE_TYPE);
        this.series = new ArrayList<Serie>();

    }

    @Override
    public void setSerie(Serie serie) {
        Integer index = serie.getFilterIndex();
        for(Object[] i : this.getQuery()){
            Number n = (Number) i[index];
            Data data = new Data();
            data.setY(n.floatValue());
            if(serie.getXIndex() != null){
                Long dateValue = (Long) i[serie.getXIndex()];
                data.setX(dateValue);
            }
            serie.getData().add(data);
        }
        this.getSeries().add(serie);
    }

    public List<Serie> getSeries() {
        return series;
    }

    public void setSeries(List<Serie> series) {
        this.series = series;
    }

}
