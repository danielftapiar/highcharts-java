package com.arbol_logika.highcharts;

import java.io.Serializable;

public class Tooltip implements Serializable {
    private String pointFormat;

    public String getPointFormat() {
        return pointFormat;
    }

    public void setPointFormat(String pointFormat) {
        this.pointFormat = pointFormat;
    }
}
