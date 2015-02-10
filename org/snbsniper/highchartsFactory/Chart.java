package org.snbsniper.highchartsFactory;

import org.snbsniper.highchartsFactory.Event;

import java.io.Serializable;

public class Chart implements Serializable {
    public static final String COLUMN_TYPE = "column";
    public static final String LINE_TYPE = "line";
    public static final String PIE_TYPE = "pie";

    private String type;
    private Boolean plotShadow;
    private Float plotBorderWidth;
    private Event events;




    public Chart(ChartType columnType){
        this.plotBorderWidth = 1F;
        this.plotShadow = false;
        this.events = new Event();
        if(columnType.equals(ChartType.COLUMN)){
            this.type = COLUMN_TYPE;
        }
        if(columnType.equals(ChartType.PIE)){
            this.type = PIE_TYPE;
        }
        if(columnType.equals(ChartType.LINE)){
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
