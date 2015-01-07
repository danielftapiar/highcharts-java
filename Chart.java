package com.arbol_logika.highcharts;

import java.io.Serializable;

public class Chart implements Serializable {
    public static final String COLUMN_TYPE = "column";
    public static final String LINE_TYPE = "line";
    public static final String PIE_TYPE = "pie";

    String type;
    Boolean plotShadow;
    Float plotBorderWidth;
    private Event events;




    public Chart(String columnType){
        this.plotBorderWidth = 1F;
        this.plotShadow = false;
        this.events = new Event();
        if(columnType.equals(Chart.COLUMN_TYPE)){
            this.type = COLUMN_TYPE;
        }
        if(columnType.equals(Chart.PIE_TYPE)){
            this.type = PIE_TYPE;
        }
        if(columnType.equals(Chart.LINE_TYPE)){
            this.type = LINE_TYPE;
        }



    }

    public Event getEvents() {
        return events;
    }

    public void setEvents(Event events) {
        this.events = events;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Boolean getPlotShadow() {
        return plotShadow;
    }

    public void setPlotShadow(Boolean plotShadow) {
        this.plotShadow = plotShadow;
    }

    public Float getPlotBorderWidth() {
        return plotBorderWidth;
    }

    public void setPlotBorderWidth(Float plotBorderWidth) {
        this.plotBorderWidth = plotBorderWidth;
    }
}
