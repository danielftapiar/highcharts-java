package org.snbsniper.highchartsFactory;

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
        DataLabels yAxisDataLabel = new DataLabels();
        yAxisDataLabel.setDistance (0);
        yAxisDataLabel.setStyle (new Style());
        yAxisDataLabel.setRotation (0);
        yAxisDataLabel.setFormat("{value}");
        yAxisDataLabel.setEnabled (true);
        yAxisDataLabel.setAlign("left");
        yAxisDataLabel.setColor ("black");
        yAxisDataLabel.setOverflow ("justify");
        yAxisDataLabel.setConnectorColor ("black");
        yAxisDataLabel.setX(-5);
        yAxisDataLabel.setY(5);
        yAxisDataLabel.setZ(7);
        this.setLabels(yAxisDataLabel);

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
