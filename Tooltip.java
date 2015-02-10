package org.danielftapiar.highchartsFactory;

import java.io.Serializable;

public class Tooltip implements Serializable {
    private String pointFormat;

    public Tooltip() {
        this.pointFormat = " <span style=\"color:{series.color}\"></span> {series.name}: <b>{point.y}</b><br/>";
    }

    public String getPointFormat() {
        return pointFormat;
    }

    public void setPointFormat(String pointFormat) {
        this.pointFormat = pointFormat;
    }
}
