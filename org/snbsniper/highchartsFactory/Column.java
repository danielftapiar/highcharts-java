package org.danielftapiar.highchartsFactory;

import java.io.Serializable;

public class Column implements Serializable {
    Float pointPadding;
    Float borderWidth;
    String stacking;
    DataLabels dataLabels;

    public Column(){
        this.pointPadding = 0.2F;
        this.borderWidth = 0F;
        this.stacking = null;
        this.dataLabels = new DataLabels();

    }

    public Float getPointPadding() {
        return pointPadding;
    }

    public void setPointPadding(Float pointPadding) {
        this.pointPadding = pointPadding;
    }

    public Float getBorderWidth() {
        return borderWidth;
    }

    public void setBorderWidth(Float borderWidth) {
        this.borderWidth = borderWidth;
    }

    public String getStacking() {
        return stacking;
    }

    public void setStacking(String stacking) {
        this.stacking = stacking;
    }

    public DataLabels getDataLabels() {
        return dataLabels;
    }

    public void setDataLabels(DataLabels dataLabels) {
        this.dataLabels = dataLabels;
    }
}
