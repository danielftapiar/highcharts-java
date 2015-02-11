package org.snbsniper.highchartsFactory;

import java.io.Serializable;

public class PieOptions implements Serializable {
    Boolean allowPointSelect;
    String cursor;
    DataLabels dataLabels;
    Point point;

    public PieOptions(){

        DataLabels config = new DataLabels();
        config.setEnabled(true);
        config.setFormat("<b>{point.name}</b>: {point.percentage:.1f} %");
        config.setStyle(new Style());
        this.dataLabels = config;
        this.allowPointSelect = false;
        this.cursor = "pointer";
        this.point = new Point();
    }

    public Boolean getAllowPointSelect() {
        return allowPointSelect;
    }

    public void setAllowPointSelect(Boolean allowPointSelect) {
        this.allowPointSelect = allowPointSelect;
    }

    public String getCursor() {
        return cursor;
    }

    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public DataLabels getDataLabels() {
        return dataLabels;
    }

    public void setDataLabels(DataLabels dataLabels) {
        this.dataLabels = dataLabels;
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }
}
