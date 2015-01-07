package com.arbol_logika.highcharts;

import java.io.Serializable;

public class Point implements Serializable {
    private Event events;

    public Point() {
        this.events = new Event();
    }

    public Event getEvents() {
        return events;
    }

    public void setEvents(Event events) {
        this.events = events;
    }
}
