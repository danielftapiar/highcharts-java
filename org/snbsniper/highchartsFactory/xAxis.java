package org.danielftapiar.highchartsFactory;

import org.danielftapiar.highchartsFactory.DataLabels;
import org.danielftapiar.highchartsFactory.TitleConfig;

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
        DataLabels xAxisDataLabel = new DataLabels();
        xAxisDataLabel.setDistance (0);
        xAxisDataLabel.setStyle (new Style());
        xAxisDataLabel.setRotation (0);
        xAxisDataLabel.setFormat("{value}");
        xAxisDataLabel.setEnabled (true);
        xAxisDataLabel.setAlign("left");
        xAxisDataLabel.setColor ("black");
        xAxisDataLabel.setOverflow ("justify");
        xAxisDataLabel.setConnectorColor ("black");
        xAxisDataLabel.setX(-25);
        xAxisDataLabel.setY(15);
        xAxisDataLabel.setZ(7);

        this.setLabels(xAxisDataLabel);

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
