package com.arbol_logika.highcharts;


import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class HighchartColumn extends HighchartXY implements Series {

    private List<Serie> series;

    private PlotOptionsColumn plotOptions;


    public HighchartColumn(List<Object[]> query) {
        super(query, Chart.COLUMN_TYPE);
        this.series = new ArrayList<Serie>();



        PlotOptionsColumn plotOptionsColumnConfig =  new PlotOptionsColumn();
        plotOptionsColumnConfig.setColumn(new Column());
        this.plotOptions = plotOptionsColumnConfig;



    }

    public List<Serie> getSeries() {
        return series;
    }

    public void setSeries(List<Serie> series) {
        this.series = series;
    }


    public PlotOptionsColumn getPlotOptions() {
        return plotOptions;
    }

    public void setPlotOptions(PlotOptionsColumn plotOptions) {
        this.plotOptions = plotOptions;
    }


    public void setSerie(Serie serie) {
        // LA PRIMERA COLUMNA DEBE SER UN ID NUMERICO, ESTO ES UN ESTANDARD QUE DEBE SER CUMPLIDO
        // EJ ROW:   id ,    categoria, serie1, serie2, serie3 ...
        //            1 | "Categoria1",   100    , 23   , 42 ....
        int max = 1000;
        int min = 0;
        int range = (max - min) + 1;

        Integer index = serie.getFilterIndex();
        for(Object[] i : this.getQuery()){
            Number number = (Number) i[index];
            Number id = (Number) i[0];

            Data data = new Data();

            data.setY(number.floatValue());
            data.setDrilldown(serie.getName()+(int)(Math.random() * range) + min);
            data.setName((String) i[1]);
            data.setId(id.toString());     // id de filtro para el drilldown

            if(serie.getXIndex() != null){
                Long dateValue = (Long) i[serie.getXIndex()];
                data.setX(dateValue);
            }

            serie.getData().add(data);
        }
        this.getSeries().add(serie);
    }

//    public void setSerie(Serie serie, Serie drilldownSerieSchema) {
//
//        this.setSerie(serie);
//
//        Serie newDrillDownSerie;
//        for(Data data : serie.getData()){
//
//            String queryString = String.format(this.getDrilldown().getQueryString(), Integer.parseInt(data.getId())) ;
//            Query nativeQuery = JPA.em().createNativeQuery(queryString);
//            List<Object[]> query =  nativeQuery.getResultList();
//
//            newDrillDownSerie = new Serie();
//            newDrillDownSerie.setName(serie.getName());
//            newDrillDownSerie.setId(data.getDrilldown());
//            newDrillDownSerie.setColor(drilldownSerieSchema.getColor());
//
//
//            for(Object[] drillDownQueryRow : query){
//
//                Data drillDownData = new Data();
//                String xAxisColumnText = (String) drillDownQueryRow[1];
//                drillDownData.setName(xAxisColumnText);
//                Number id = (Number) drillDownQueryRow[0];
//                drillDownData.setId(id.toString());
//                Number dataNumber = (Number) drillDownQueryRow[drilldownSerieSchema.getFilterIndex()];
//                drillDownData.setY(dataNumber.floatValue());
//////
//                newDrillDownSerie.getData().add(drillDownData);
//            }
//            this.getDrilldown().getSeries().add(newDrillDownSerie);
//
//
//        }
//
//    }

    public void setSerie(Serie serie, Map<Integer,String> colorFilter){





        this.setSerie(serie);


            for(Data i : serie.getData()){
            Integer lowerLimitValue = null;
            Integer uppperLimitValue = null;

            ArrayList<Map.Entry<Integer, String>> list = new ArrayList<Map.Entry<Integer, String>>(colorFilter.entrySet());


                for (int j = 0; j < list.size(); j++) {
                    Map.Entry<Integer, String> lowerLimitEntry;

                    if( list.size() > j+1){
                        lowerLimitEntry = list.get(j);
                        lowerLimitValue = (Integer) lowerLimitEntry.getKey();

                        Map.Entry<Integer, String> upperLimitEntry = list.get(j+1);
                        uppperLimitValue = (Integer) upperLimitEntry.getKey();

                        if( i.getY() > lowerLimitValue && i.getY() <= uppperLimitValue ){
                            i.setColor((String) upperLimitEntry.getValue());
                        }
                    }






            }

        }


    }

    public void allowStacking(Boolean allow) {

        if(allow)
            this.getPlotOptions().getColumn().setStacking("stacking");
        else
            this.getPlotOptions().getColumn().setStacking(null);
    }

    public void allowLabelsInsideSeries(DataLabels dataLabels) {
        List<Serie> series1 = this.getSeries();
            for(Serie i : series1){
                i.setDataLabels(dataLabels);
            }
    }

}
