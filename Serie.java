package com.arbol_logika.highcharts;

import java.io.Serializable;
import java.util.ArrayList;

public class Serie implements Serializable {
    private String type;
    private String name;
    private ArrayList<Data> data;
    private String id;
    private Integer filterIndex;
    private String color;
    private DataLabels dataLabels;
    private Integer XIndex;


    public Serie() {
        this.type = "";
        this.name = "";
        this.data = new ArrayList<Data>();
        this.id = "";
        this.dataLabels = new DataLabels();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Data> getData() {
        return data;
    }

    public void setData(ArrayList<Data> data) {
        this.data = data;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getFilterIndex() {
        return filterIndex;
    }

    public void setFilterIndex(Integer filterIndex) {
        this.filterIndex = filterIndex;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDataLabels(DataLabels dataLabels) {
        this.dataLabels = dataLabels;
    }

    public DataLabels getDataLabels() {
        return dataLabels;
    }


    public void setXIndex(Integer XIndex) {
        this.XIndex = XIndex;
    }

    public Integer getXIndex() {
        return XIndex;
    }
}
