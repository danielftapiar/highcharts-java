package org.danielftapiar.highchartsFactory;

import java.io.Serializable;

public class Event implements Serializable {

    private String click;
    private String selection;
    private String select;

    public Event() {
        this.click = null;
        this.selection = null;
        this.select = null;

    }

    public String getClick() {
        return click;
    }

    public void setClick(String click) {
        this.click = click;
    }

    public String getSelection() {
        return selection;
    }

    public void setSelection(String selection) {
        this.selection = selection;
    }

    public String getSelect() {
        return select;
    }

    public void setSelect(String select) {
        this.select = select;
    }
}
