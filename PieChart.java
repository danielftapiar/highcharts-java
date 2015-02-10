package org.danielftapiar.highchartsFactory;

import dev.danielftapiar.CircularList;

import java.io.Serializable;

/**
 * Created by danielftapiar on 2/7/15.
 */
public class PieChart extends Highchart implements Serializable {

    private PlotOptionsPie plotOptions;
    
    public PieChart() {
        super(ChartType.PIE);
        construct();
    }

    @Override
    protected void construct(){
        this.plotOptions = new PlotOptionsPie();
        this.plotOptions.pie.allowPointSelect = true;


    }

    @Override
    public void processChart() {

        CircularList circularListColor = this.obtainCircularColorList();
        
        if(this.getSeries() != null && this.getSeries().get(0) != null){
            Serie serie = this.getSeries().get(0);
            for(Data i : serie.getData()){
                if(i.getColor() == null){
                    i.setColor((String) circularListColor.getData());
                    circularListColor = circularListColor.getNextNode();
                }
                    

                
            }
            

        }

    }

    public PlotOptionsPie getPlotOptions() {
        return plotOptions;
    }

    public void setPlotOptions(PlotOptionsPie plotOptions) {
        this.plotOptions = plotOptions;
    }
}
