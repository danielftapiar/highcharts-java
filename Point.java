package org.snbsniper.highchartsFactory;

import org.danielftapiar.highchartsFactory.Event;

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
