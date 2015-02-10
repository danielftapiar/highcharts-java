package org.snbsniper.highchartsFactory;

import org.danielftapiar.highchartsFactory.CSSObject;
import org.danielftapiar.highchartsFactory.DrillUpButton;
import org.danielftapiar.highchartsFactory.Serie;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Drilldown implements Serializable {
    ArrayList<Serie> series;
    DrillUpButton drillUpButton;
    CSSObject activeDataLabelStyle;
    CSSObject activeAxisLabelStyle;

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



}
