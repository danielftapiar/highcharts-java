package com.arbol_logika.highcharts;

import java.io.Serializable;

public class yAxis implements Serializable {
    Float min;
    Float max;
    TitleConfig title;
    //StackLabels stackLabels;
    DataLabels labels;


    public yAxis() {
        this.min = 0F;
        this.title = new TitleConfig();
        //this.stackLabels = new StackLabels();
        this.labels = new DataLabels();

    }

    public TitleConfig getTitle() {
        return title;
    }

    public void setTitle(TitleConfig title) {
        this.title = title;
    }

    public Float getMin() {
        return min;
    }

    public void setMin(Float min) {
        this.min = min;
    }

//    public StackLabels getStackLabels() {
//        return stackLabels;
//    }
//
//    public void setStackLabels(StackLabels stackLabels) {
//        this.stackLabels = stackLabels;
//    }

    public DataLabels getLabels() {
        return labels;
    }

    public void setLabels(DataLabels labels) {
        this.labels = labels;
    }

    public Float getMax() {
        return max;
    }

    public void setMax(Float max) {
        this.max = max;
    }
}
