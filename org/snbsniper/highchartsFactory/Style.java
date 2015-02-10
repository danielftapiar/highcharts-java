package org.danielftapiar.highchartsFactory;

import java.io.Serializable;

public class Style implements Serializable {
    private String color;
    private String fontWeight;
    private String fontSize;
    private String whiteSpace;

    public Style(){
        this.color = "#6D869F";
        this.fontWeight = "bold";
        this.fontSize = "10px";
        this.whiteSpace = "nowrap";

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFontWeight() {
        return fontWeight;
    }

    public void setFontWeight(String fontWeight) {
        this.fontWeight = fontWeight;
    }

    public String getFontSize() {
        return fontSize;
    }

    public void setFontSize(String fontSize) {
        this.fontSize = fontSize;
    }


}
