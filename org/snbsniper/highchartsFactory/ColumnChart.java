package org.danielftapiar.highchartsFactory;

import dev.danielftapiar.CircularList;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by danielftapiar on 2/4/15.
 */
public class ColumnChart extends HighchartXY implements Serializable {


    private PlotOptionsColumn plotOptions;

    public ColumnChart() {
        super(ChartType.COLUMN);
        construct();
    }

    @Override
    protected void construct() {

        PlotOptionsColumn plotOptionsColumnConfig =  new PlotOptionsColumn();
        plotOptionsColumnConfig.setColumn(new Column());
        this.plotOptions = plotOptionsColumnConfig;
    }





    public PlotOptionsColumn getPlotOptions() {
        return plotOptions;
    }

    public void setPlotOptions(PlotOptionsColumn plotOptions) {
        this.plotOptions = plotOptions;
    }

    public void allowStacking(Boolean allow) {

        if(allow)
            this.getPlotOptions().getColumn().setStacking("stacking");
        else
            this.getPlotOptions().getColumn().setStacking(null);
    }

    public void allowLabelsInsideSeries(DataLabels dataLabels) {
        List<Serie> series1 = this.getSeries();
        for(Serie i : series1){
            i.setDataLabels(dataLabels);
        }
    }

}
