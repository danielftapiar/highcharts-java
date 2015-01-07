package com.arbol_logika.highcharts;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Drilldown implements Serializable {
    ArrayList<Serie> series;
    DrillUpButton drillUpButton;
    CSSObject activeDataLabelStyle;
    CSSObject activeAxisLabelStyle;
    String queryString;
    List<Object[]> query;
    ArrayList<Serie> serieSchema;




    public Drilldown(String queryString) {
        this.drillUpButton = new DrillUpButton();
        this.series = new ArrayList<Serie>();
        this.activeAxisLabelStyle = new CSSObject();
        this.activeDataLabelStyle = new CSSObject();
        this.activeDataLabelStyle = new CSSObject();
        this.queryString = queryString;
        this.serieSchema = new ArrayList<Serie>();
    }

    public Drilldown() {
        this.drillUpButton = new DrillUpButton();
        this.series = new ArrayList<Serie>();
        this.activeAxisLabelStyle = new CSSObject();
        this.activeDataLabelStyle = new CSSObject();
        this.activeDataLabelStyle = new CSSObject();
    }

    public ArrayList<Serie> getSeries() {
        return series;
    }

    public void setSeries(ArrayList<Serie> series) {
        this.series = series;
    }

    public DrillUpButton getDrillUpButton() {
        return drillUpButton;
    }

    public void setDrillUpButton(DrillUpButton drillUpButton) {
        this.drillUpButton = drillUpButton;
    }

    public void addSerie(Serie drillDownSerie) {
        this.getSeries().add(drillDownSerie);

    }

    public String getQueryString() {
        return queryString;
    }

    public void setQueryString(String queryString) {
        this.queryString = queryString;
    }

    public CSSObject getActiveAxisLabelStyle() {
        return activeAxisLabelStyle;
    }

    public void setActiveAxisLabelStyle(CSSObject activeAxisLabelStyle) {
        this.activeAxisLabelStyle = activeAxisLabelStyle;
    }

    public CSSObject getActiveDataLabelStyle() {
        return activeDataLabelStyle;
    }

    public void setActiveDataLabelStyle(CSSObject activeDataLabelStyle) {
        this.activeDataLabelStyle = activeDataLabelStyle;
    }

    public ArrayList<Serie> getSerieSchema() {
        return serieSchema;
    }

    public void setSerieSchema(ArrayList<Serie> serieSchema) {
        this.serieSchema = serieSchema;
    }



    public List<Object[]> getQuery() {
        return query;
    }

    public void setQuery(List<Object[]> query) {
        this.query = query;
    }


}
