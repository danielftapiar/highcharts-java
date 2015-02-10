package org.danielftapiar.highchartsFactory;

import java.io.Serializable;

public class Position implements Serializable {
    Integer x;
    Integer y;

    public Position() {
        this.x=0;
        this.y=0;
    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }
}
