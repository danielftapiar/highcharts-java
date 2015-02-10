package org.snbsniper.highchartsFactory;

import dev.danielftapiar.CircularList;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by danielftapiar on 2/6/15.
 */
public class LineChart extends HighchartXY implements Serializable {

    public LineChart() {
        super(ChartType.LINE);
        construct();
    }

    @Override
    protected void construct() {

        this.setSeries(new ArrayList<Serie>());
    }


}
