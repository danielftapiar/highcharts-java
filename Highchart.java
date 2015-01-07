package com.arbol_logika.highcharts;

import java.util.List;

public abstract class Highchart{
    private List<Object[]> query;
    private Chart chart;
    private TitleConfig title;

    private Tooltip tooltip;
    private Drilldown drilldown;
    private String borderColor;
    private Integer borderRadius;
    private Integer borderWidth;


    public Highchart(List<Object[]> query, String chartType) {
        this.query = query;
        this.chart = new Chart(chartType);
        this.title = new TitleConfig();
        this.tooltip = new Tooltip();
        this.drilldown = new Drilldown();
        this.borderColor = "#4572A7";
        this.borderRadius = 1;
        this.borderWidth = 1;


    }

    public Chart getChart() {
        return chart;
    }

    public void setChart(String chart) {
        Chart chartConfig = new Chart(Chart.COLUMN_TYPE);
        chartConfig.setType(chart);
        this.chart = chartConfig;

    }

    public String getTitleString() {
        return title.getText();
    }


    public TitleConfig getTitle() {
        return title;
    }

    public void setTitle(String title) {
        TitleConfig tmpTitle = new TitleConfig();
        tmpTitle.setText(title);
        this.setTitle(tmpTitle);
    }



    public Tooltip getTooltip() {
        return tooltip;
    }

    public void setTooltip(String tooltip) {
        this.getTooltip().setPointFormat(tooltip);
    }

    public void setTooltip(Tooltip tooltip) {
        this.tooltip = tooltip;
    }

    public void setChart(Chart chart) {
        this.chart = chart;
    }

    public void setTitle(TitleConfig title) {
        this.title = title;
    }



    public List<Object[]> getQuery() {
        return query;
    }

    public void setQuery(List<Object[]> query) {
        this.query = query;
    }

    public Drilldown getDrilldown() {
        return drilldown;
    }

    public void setDrilldown(Drilldown drilldown) {
        this.drilldown = drilldown;
    }

    public String getBorderColor() {
        return borderColor;
    }

    public void setBorderColor(String borderColor) {
        this.borderColor = borderColor;
    }

    public Integer getBorderRadius() {
        return borderRadius;
    }

    public void setBorderRadius(Integer borderRadius) {
        this.borderRadius = borderRadius;
    }

    public Integer getBorderWidth() {
        return borderWidth;
    }

    public void setBorderWidth(Integer borderWidth) {
        this.borderWidth = borderWidth;
    }
}
