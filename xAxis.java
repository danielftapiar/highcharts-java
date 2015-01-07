package com.arbol_logika.highcharts;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class xAxis implements Serializable {
    List<String> categories;
    TitleConfig title;
    String type;
    DataLabels labels;


    public xAxis() {
        this.categories = new ArrayList<String>();
        this.title = new TitleConfig();
        this.labels = new DataLabels();
    }

    public TitleConfig getTitle() {
        return title;
    }

    public void setTitle(TitleConfig title) {
        this.title = title;
    }

    public List<String> getCategories() {
        return categories;
    }

    public void setCategories(List<String> categories) {
        this.categories = categories;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public DataLabels getLabels() {
        return labels;
    }

    public void setLabels(DataLabels labels) {
        this.labels = labels;
    }
}
