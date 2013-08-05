package com.mockupcode.ui4gwt.ui.slider.options;

import com.google.gwt.json.client.JSONArray;
import com.google.gwt.json.client.JSONBoolean;
import com.google.gwt.json.client.JSONNumber;
import com.google.gwt.json.client.JSONString;
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
		assertNotNull(animate);
		assertEquals(JSONBoolean.getInstance(false), animate.isBoolean());
	}
	
	public void testGetDisabledFromOptions(){
		SliderOptions options = new SliderOptions();
		JSONValue disabled = options.getOptions().get(SliderOptions.DISABLED);
		assertNotNull(disabled);
		assertEquals(JSONBoolean.getInstance(false), disabled.isBoolean());
	}
	
	public void testGetMaxFromOptions(){
		SliderOptions options = new SliderOptions();
		JSONValue max = options.getOptions().get(SliderOptions.MAX);
		assertNotNull(max);
		assertEquals(new JSONNumber(100), max.isNumber());
	}
	
	public void testGetMinFromOptions(){
		SliderOptions options = new SliderOptions();
		JSONValue min = options.getOptions().get(SliderOptions.MIN);
		assertNotNull(min);
		assertEquals(new JSONNumber(0), min.isNumber());
	}
	
	public void testGetOrientationFromOptions(){
		SliderOptions options = new SliderOptions();
		JSONValue orientation = options.getOptions().get(SliderOptions.ORIENTATION);
		assertNotNull(orientation);
		assertEquals(new JSONString(Orientation.HORIZONTAL.getValue()), orientation.isString());
	}
	
	public void testGetRangeFromOptions(){
		SliderOptions options = new SliderOptions();
		JSONValue range = options.getOptions().get(SliderOptions.RANGE);
		assertNotNull(range);
		assertEquals(JSONBoolean.getInstance(false), range.isBoolean());
	}
	
	public void testGetStepFromOptions(){
		SliderOptions options = new SliderOptions();
		JSONValue step = options.getOptions().get(SliderOptions.STEP);
		assertNotNull(step);
		assertEquals(new JSONNumber(1), step.isNumber());
	}
	
	public void testGetValueFromOptions(){
		SliderOptions options = new SliderOptions();
		JSONValue value = options.getOptions().get(SliderOptions.VALUE);
		assertNotNull(value);
		assertEquals(new JSONNumber(0), value.isNumber());
	}
	
	public void testGetValuesFromOptions(){
		SliderOptions options = new SliderOptions();
		JSONValue values = options.getOptions().get(SliderOptions.VALUES);
		assertNotNull(values);
		assertNull(values.isArray());
	}
	
	public void testSetAndGetValuesFromOptions(){
		JSONArray expected = new JSONArray();
		expected.set(0, new JSONNumber(10));
		expected.set(1, new JSONNumber(20));
		
		SliderOptions options = new SliderOptions();
		options.setValues(new double[]{10,20});
		JSONValue values = options.getOptions().get(SliderOptions.VALUES);
		assertNotNull(values);
		assertEquals(expected.get(0), values.isArray().get(0));
		assertEquals(expected.get(1), values.isArray().get(1));
	}


}
