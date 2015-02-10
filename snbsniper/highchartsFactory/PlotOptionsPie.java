package org.snbsniper.highchartsFactory;

import java.io.Serializable;

public class PlotOptionsPie implements Serializable {
    PieOptions pie;

    public PlotOptionsPie(){
       this.pie = new PieOptions();
    }

    public PieOptions getPie() {
        return pie;
    }

    public void setPie(PieOptions pie) {
        this.pie = pie;
    }
}
