package com.arbol_logika.highcharts;

import java.io.Serializable;

public class TitleConfig implements Serializable {

    private String text;
    private Integer margin;

    public TitleConfig() {
        this.text = "";
        this.margin = 0;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = "<b>"+text+"</b>";
    }

    public Integer getMargin() {
        return margin;
    }

    public void setMargin(Integer margin) {
        this.margin = margin;
    }
}
