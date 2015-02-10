package org.snbsniper.highchartsFactory;

import java.io.Serializable;

/**
 * Created by desarrollo on 12-12-14.
 */
public class StackLabels implements Serializable{


    private String align;
    private Boolean enabled;
    private String format;
    private Integer rotation;
    private String textAlign;
    private Boolean useHTML;
    private String verticalAlign;
    private Integer x;
    private Integer y;

    public StackLabels() {
        this.align = "center";
        this.enabled = false;
        this.format = "{total}";
        this.rotation = 0;
        this.textAlign = "center";
        this.x=0;
        this.y=0;
        this.verticalAlign = "top";
        this.useHTML=false;
    }

    public String getAlign() {
        return align;
    }

    public void setAlign(String align) {
        this.align = align;
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


    public Integer getRotation() {
        return rotation;
    }

    public void setRotation(Integer rotation) {
        this.rotation = rotation;
    }

    public String getTextAlign() {
        return textAlign;
    }

    public void setTextAlign(String textAlign) {
        this.textAlign = textAlign;
    }

    public Boolean getUseHTML() {
        return useHTML;
    }

    public void setUseHTML(Boolean useHTML) {
        this.useHTML = useHTML;
    }

    public String getVerticalAlign() {
        return verticalAlign;
    }

    public void setVerticalAlign(String verticalAlign) {
        this.verticalAlign = verticalAlign;
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
}