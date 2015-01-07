package com.arbol_logika.highcharts;

import java.io.Serializable;

public class DataLabels implements Serializable {

    private Integer distance;
    Boolean enabled;
    String format;
    String connectorColor;
    Style style;
    String align;
    Integer rotation;
    String overflow;
    String color;
    private Integer x;
    private Integer y;
    private Integer z;

    public DataLabels(){
        this.distance = 0;
        this.style = new Style();
        this.rotation = 0;
        this.format="{value}";
        this.enabled = true;
        this.align="left";
        this.color = "black";
        this.overflow = "justify";
        this.connectorColor = "black";
        this.x=0;
        this.y=15;
        this.z=7;

    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getConnectorColor() {
        return connectorColor;
    }

    public void setConnectorColor(String connectorColor) {
        this.connectorColor = connectorColor;
    }

    public Style getStyle() {
        return style;
    }

    public void setStyle(Style style) {
        this.style = style;
    }


    public String getAlign() {
        return align;
    }

    public void setAlign(String align) {
        this.align = align;
    }

    public Integer getRotation() {
        return rotation;
    }

    public void setRotation(Integer rotation) {
        this.rotation = rotation;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    public Integer getZ() {
        return z;
    }

    public void setZ(Integer z) {
        this.z = z;
    }

    public String getOverflow() {
        return overflow;
    }

    public void setOverflow(String overflow) {
        this.overflow = overflow;
    }

    public Integer getDistance() {
        return distance;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }
}
