package org.danielftapiar.highchartsFactory;

import org.danielftapiar.highchartsFactory.Position;

import java.io.Serializable;

public class DrillUpButton implements Serializable {
    String relativeTo;
    Position position;

    public DrillUpButton() {
        this.relativeTo = "spacingBox";
        this.position = new Position();
    }

    public String getRelativeTo() {
        return relativeTo;
    }

    public void setRelativeTo(String relativeTo) {
        this.relativeTo = relativeTo;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
}
