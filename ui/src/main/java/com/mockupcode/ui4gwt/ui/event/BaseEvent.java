package com.mockupcode.ui4gwt.ui.event;

import java.util.Arrays;

import com.google.gwt.user.client.Event;
import com.google.gwt.user.client.ui.Widget;

/**
 * Created with IntelliJ IDEA.
 * User: San
 * Date: 22/7/2556
 * Time: 4:01 น.
 * To change this template use File | Settings | File Templates.
 */
public abstract class BaseEvent {
    private Double[] values;
    private Widget source;
    private Event event;

    protected BaseEvent( Widget source, Event event,Double[] values) {
        this.values = Arrays.copyOf(values, values.length);
        this.source = source;
        this.event = event;
    }

    public Double[] getValues() {
        return values.clone();
    }

    public Widget getSource() {
        return source;
    }

    public Event getEvent() {
        return event;
    }
}
