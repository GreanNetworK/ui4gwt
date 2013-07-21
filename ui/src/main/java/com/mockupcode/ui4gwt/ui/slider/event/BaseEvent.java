package com.mockupcode.ui4gwt.ui.slider.event;

import com.google.gwt.user.client.Event;
import com.mockupcode.ui4gwt.ui.slider.Slider;

/**
 * Created with IntelliJ IDEA.
 * User: San
 * Date: 22/7/2556
 * Time: 4:01 น.
 * To change this template use File | Settings | File Templates.
 */
public abstract class BaseEvent {
    private Double[] values;
    private Slider source;
    private Event event;

    protected BaseEvent( Slider source, Event event,Double[] values) {
        this.values = values;
        this.source = source;
        this.event = event;
    }

    public Double[] getValues() {
        return values;
    }

    public Slider getSource() {
        return source;
    }

    public Event getEvent() {
        return event;
    }
}
