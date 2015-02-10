package org.danielftapiar.highchartsFactory;

import java.io.Serializable;

public class Data implements Serializable {
    String name;
    Long x;
    Float y;
    Boolean sliced;
    Boolean selected;
    Boolean visible;
    String color;
    String drilldown;
    String id;
    Event events;

    public Data(){
        this.sliced = false;
        this.selected = false;
        this.visible = true;
        this.color=null;
        this.events = new Event();
        this.name=null;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getY() {
        return y;
    }

    public void setY(Float y) {
        this.y = y;
    }

    public Boolean getVisible() {
        return visible;
    }

    public void setVisible(Boolean visible) {
        this.visible = visible;
    }

    public Boolean getSelected() {
        return selected;
    }

    public void setSelected(Boolean selected) {
        this.selected = selected;
    }

    public Boolean getSliced() {
        return sliced;
    }

    public void setSliced(Boolean sliced) {
        this.sliced = sliced;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDrilldown() {
        return drilldown;
    }

    public void setDrilldown(String drilldown) {
        this.drilldown = drilldown;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Event getEvents() {
        return events;
    }

    public void setEvents(Event events) {
        this.events = events;
    }

    public Long getX() {
        return x;
    }

    public void setX(Long x) {
        this.x = x;
    }
}
