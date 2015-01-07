package com.arbol_logika.highcharts;

import java.util.ArrayList;
import java.util.List;

public abstract class HighchartXY extends Highchart  {
    private xAxis xAxis;
    private yAxis yAxis;

    protected HighchartXY(List<Object[]> query, String chartType) {
        super(query, chartType);
        this.xAxis = new xAxis();
        this.yAxis = new yAxis();
        this.xAxis.labels.align="left";
        this.yAxis.labels.align="right";

        
    }

    public xAxis getxAxis() {
        return xAxis;
    }

    public void setxAxis(xAxis xAxis) {
        this.xAxis = xAxis;
    }

    public yAxis getyAxis() {
        return yAxis;
    }

    public void setyAxis(yAxis yAxis) {
        this.yAxis = yAxis;
    }

    public void setyAxisTitle(String yAxisTitle) {
        TitleConfig tmpTitle = new TitleConfig();
        tmpTitle.setText(yAxisTitle);
        yAxis yAxis1 = this.getyAxis();
        yAxis1.setTitle(tmpTitle);
        this.setyAxis(yAxis1);
    }

    public void setXAxisTitle(String xAxisTitle) {
        TitleConfig tmpTitle = new TitleConfig();
        tmpTitle.setText(xAxisTitle);
        xAxis xAxis1 = this.getxAxis();
        xAxis1.setTitle(tmpTitle);
        this.setxAxis(xAxis1);
    }

    public void setCategories(Integer index) {
        // 0 based index
        List<String> categories = new ArrayList<String>();
        for(Object[] i : this.getQuery()){
            categories.add((String)i[index]);
        }
        this.getxAxis().setCategories(categories);
    }

    public void setXAxisRotation(int rotation) {
        this.getxAxis().getLabels().setRotation(rotation);
    }

    public void allowStackingLabels(boolean b) {
        if(b){
           // yAxis.stackLabels = new StackLabels();
        }
    }



    public void setYAxisFormat(String s) {
        yAxis yAxis1 = this.getyAxis();
        DataLabels dataLabels = new DataLabels();
        dataLabels.setFormat(s);
        yAxis1.setLabels( dataLabels );

    }


    public void setYAxisXOffSet(int i) {
        this.getyAxis().getLabels().setX(i);
    }

    public void setXAxisYOffset(int i) {
        this.getxAxis().getLabels().setY(i);
    }

    public void setYAxisMaxValue(float value){
        this.getyAxis().setMax(value);
    }

    public void setYAxisMinValue(float value){
        this.getyAxis().setMin(value);
    }
}
