package com.mockupcode.ui4gwt.ui.event;

import com.google.gwt.user.client.Event;
import com.google.gwt.user.client.ui.Widget;

/**
 * Created with IntelliJ IDEA.
 * User: San
 * Date: 22/7/2556
 * Time: 4:01 น.
 * To change this template use File | Settings | File Templates.
 */
public class StopEvent extends BaseEvent {
    public StopEvent(Widget source, Event event, Double[] values) {
        super(source, event, values);
    }
}
