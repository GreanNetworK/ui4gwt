package com.mockupcode.ui4gwt.ui.event;

import com.google.gwt.user.client.Event;
import com.mockupcode.ui4gwt.ui.slider.Slider;

/**
 * Created with IntelliJ IDEA.
 * User: San
 * Date: 22/7/2556
 * Time: 4:06 น.
 * To change this template use File | Settings | File Templates.
 */
public class SlideEvent extends BaseEvent {
	
	public SlideEvent(Slider source, Event event,Double[] values){
		super(source, event, values);
	}
}
