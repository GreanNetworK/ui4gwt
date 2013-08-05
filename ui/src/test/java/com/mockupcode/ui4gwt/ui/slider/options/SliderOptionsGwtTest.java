package com.mockupcode.ui4gwt.ui.slider.options;

import com.google.gwt.json.client.JSONBoolean;
import com.google.gwt.json.client.JSONValue;
import com.google.gwt.junit.client.GWTTestCase;

public class SliderOptionsGwtTest extends GWTTestCase {

	@Override
	public String getModuleName() {
		return "com.mockupcode.ui4gwt.ui.Ui";
	}
	
	public void testGetAnimateFromOptions(){
		SliderOptions options = new SliderOptions();
		JSONValue animate = options.getOptions().get(SliderOptions.ANIMATE);
		assertEquals(JSONBoolean.getInstance(false), animate.isBoolean());
	}

}
