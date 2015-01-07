package com.arbol_logika.highcharts;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class HighchartPie extends Highchart {

    private List<Serie> series;
    private PlotOptionsPie plotOptions;
    private HashMap<String,String> colorArray;
    private Boolean defaultColors = true;

    public HighchartPie(List<Object[]> query) {
        super(query, Chart.PIE_TYPE);
        this.series = new ArrayList<Serie>();
        this.plotOptions = new PlotOptionsPie();
        this.plotOptions.pie.allowPointSelect = true;

        this.colorArray = new HashMap<String, String>();
        this.colorArray.put("0", "#2f7ed8" );
        this.colorArray.put("1", "#0d233a");
        this.colorArray.put("2", "#8bbc21");
        this.colorArray.put("3", "#910000");
        this.colorArray.put("4", "#1aadce");
        this.colorArray.put("5", "#492970");
        this.colorArray.put("6", "#77a1e5");
        this.colorArray.put("7", "#c42525");
        this.colorArray.put("8", "#a6c96a");





    }



    public void setSeries(Integer dataIndex, String serieName, Integer categoryIndex) {

        Serie seriePie = new Serie();

        seriePie.getDataLabels().setFormat("{point.name}") ;
        seriePie.getDataLabels().setY(0);
        seriePie.getDataLabels().setZ(0);


        seriePie.setName(serieName);
        Integer colorIndexCount = 0;

        for (Object[] i : this.getQuery()){
            Data data = new Data();
            Number number = (Number) i[dataIndex];
            data.setName((String)i[categoryIndex]);
            data.setY(number.floatValue());
            data.setId(i[0].toString());

            if(this.getDefaultColors()){
                Integer colorMapIndex = colorIndexCount%9;
                data.setColor(this.getColorArray().get(colorMapIndex.toString()));
                colorIndexCount = colorIndexCount + 1;


            }
            else{
                data.setColor(this.getColorArray().get(i[0].toString()));
            }

            seriePie.getData().add(data);
        }
        this.getSeries().add(seriePie);


    }

    public List<Serie> getSeries() {
        return series;
    }

    public void setSeries(List<Serie> series) {
        this.series = series;
    }



    public PlotOptionsPie getPlotOptions() {
        return plotOptions;
    }

    public void setPlotOptions(PlotOptionsPie plotOptions) {
        this.plotOptions = plotOptions;
    }

    public void setColorArray(HashMap<String, String> colorArray) {
        this.defaultColors = false;
        this.colorArray = colorArray;
    }

    public HashMap<String, String> getColorArray() {
        return colorArray;
    }

    public Boolean getDefaultColors() {
        return defaultColors;
    }

    public void setDefaultColors(Boolean defaultColors) {
        this.defaultColors = defaultColors;
    }
}
