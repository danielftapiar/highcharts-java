package org.snbsniper.highchartsFactory;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by danielftapiar on 2/4/15.
 */
public abstract class Highchart implements Serializable {

    private CircularList colors;

    private Chart chart;
    private TitleConfig title;

    private Tooltip tooltip;
    private Drilldown drilldown;
    private String borderColor;
    private Integer borderRadius;
    private Integer borderWidth;
    private List<Serie> series;

    public Highchart(ChartType chartType) {
        this.chart = new Chart(chartType);
        this.title = new TitleConfig();
        this.tooltip = new Tooltip();
        this.drilldown = new Drilldown();

        this.borderColor = "#4572A7";
        this.borderRadius = 1;
        this.borderWidth = 1;

        this.colors = new CircularList("#66FF33");//green
        this.colors.InsertNext("#3333FF");//calipso
        this.colors.InsertNext("#000000");//black
        this.colors.InsertNext("#CC00FF");//purple
        this.colors.InsertNext("#996633");//brown

        this.colors.InsertNext("#FFFF00");//yellow


        this.colors.InsertNext("#FF0000");//red

        this.setSeries(new ArrayList<Serie>());


    }

    public Chart getChart() {
        return chart;
    }

    public void setChart(Chart chart) {
        this.chart = chart;
    }

    public TitleConfig getTitle() {
        return title;
    }

    public void setTitle(TitleConfig title) {
        this.title = title;
    }

    public Tooltip getTooltip() {
        return tooltip;
    }

    public void setTooltip(Tooltip tooltip) {
        this.tooltip = tooltip;
    }

    public Drilldown getDrilldown() {
        return drilldown;
    }

    public void setDrilldown(Drilldown drilldown) {
        this.drilldown = drilldown;
    }

    public String getBorderColor() {
        return borderColor;
    }

    public void setBorderColor(String borderColor) {
        this.borderColor = borderColor;
    }

    public Integer getBorderRadius() {
        return borderRadius;
    }

    public void setBorderRadius(Integer borderRadius) {
        this.borderRadius = borderRadius;
    }

    public Integer getBorderWidth() {
        return borderWidth;
    }

    public void setBorderWidth(Integer borderWidth) {
        this.borderWidth = borderWidth;
    }

    public void setTitle(String title) {
        this.getTitle().setText(title);
    }

    public List<Serie> getSeries() {
        return series;
    }

    public void setSeries(List<Serie> series) {
        this.series = series;
    }

    protected abstract void construct();

    protected abstract void processChart();

    public CircularList obtainCircularColorList(){
        return this.colors;
    }

    public void addSerie(Serie serie1) {
        String type = this.getChart().getType();
        serie1.setType(type);
        this.getSeries().add(serie1);
    }
    
    public void addDrilldownSeries(Serie newDrilldownSerie){
        Drilldown drilldown1 = this.getDrilldown();
        if(drilldown1 == null)
            drilldown1 = new Drilldown();

        drilldown1.addSerie(newDrilldownSerie);
        
//        for(Serie i : this.getSeries()){
//            for(Data j : i.getData()){
//                if(j.getDrilldown().equals(parentDrilldownKey)){
//                    
//                    if(drilldown1.getSeries() == null){
//                        drilldown1.setSeries(new ArrayList<Serie>());
//                    }
//                    Serie newDrilldownSerie = new Serie();
//                    newDrilldownSerie.setData(data);
//                    newDrilldownSerie.setId(parentDrilldownKey);
//                    
//                }
//            }
//        }
        


        this.setDrilldown(drilldown1);

    }


}
