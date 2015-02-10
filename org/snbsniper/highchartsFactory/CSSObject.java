package org.danielftapiar.highchartsFactory;

import java.io.Serializable;

public class CSSObject implements Serializable {

    String cursor;
    String color;
    String fontWeight;
    String textDecoration;

    public CSSObject() {
        this.cursor = "pointer";
        this.color = "#0d233a";
        this.fontWeight = "bold";
        this.textDecoration = "underline";
    }

    public String getCursor() {
        return cursor;
    }

    public void setCursor(String cursor) {
        this.cursor = cursor;
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

    public String getTextDecoration() {
        return textDecoration;
    }

    public void setTextDecoration(String textDecoration) {
        this.textDecoration = textDecoration;
    }
}
