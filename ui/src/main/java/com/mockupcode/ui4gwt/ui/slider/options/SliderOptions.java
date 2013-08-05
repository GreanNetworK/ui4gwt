package com.mockupcode.ui4gwt.ui.slider.options;

import com.google.gwt.json.client.JSONArray;
import com.google.gwt.json.client.JSONBoolean;
import com.google.gwt.json.client.JSONNull;
import com.google.gwt.json.client.JSONNumber;
import com.google.gwt.json.client.JSONObject;
import com.google.gwt.json.client.JSONString;
import com.google.gwt.json.client.JSONValue;
import com.mockupcode.ui4gwt.ui.option.Options;


public class SliderOptions implements Options {
	
	public static final String ANIMATE = "animate";
	public static final String DISABLED = "disabled";
	public static final String MAX = "max";
	public static final String MIN = "min";
	public static final String ORIENTATION = "orientation";
	public static final String RANGE = "range";
	public static final String STEP = "step";
	public static final String VALUE = "value";
	public static final String VALUES = "values";
	
	private boolean animate = false;
	private boolean disabled = false;
	private int max = 100;
	private int min = 0;
	private Orientation orientation = Orientation.HORIZONTAL;
	private boolean range = false;
	private int step = 1;
	private double value = 0;
	private double[] values = null;
	
	public boolean isAnimate() {
		return animate;
	}
	public void setAnimate(boolean animate) {
		this.animate = animate;
	}
	public boolean isDisabled() {
		return disabled;
	}
	public void setDisabled(boolean disabled) {
		this.disabled = disabled;
	}
	public int getMax() {
		return max;
	}
	public void setMax(int max) {
		this.max = max;
	}
	public int getMin() {
		return min;
	}
	public void setMin(int min) {
		this.min = min;
	}
	public Orientation getOrientation() {
		return orientation;
	}
	public void setOrientation(Orientation orientation) {
		this.orientation = orientation;
	}
	public boolean isRange() {
		return range;
	}
	public void setRange(boolean range) {
		this.range = range;
	}
	public int getStep() {
		return step;
	}
	public void setStep(int step) {
		this.step = step;
	}
	public double getValue() {
		return value;
	}
	public void setValue(double value) {
		this.value = value;
	}
	
	@SuppressWarnings("all")
	public double[] getValues() {
		return values;
	}
	@SuppressWarnings("all")
	public void setValues(double[] values) {
		this.values = values;
	}
	
	@Override
	public JSONObject getOptions() {
		JSONObject options = new JSONObject();
        options.put(ANIMATE, JSONBoolean.getInstance(animate));
        options.put(DISABLED, JSONBoolean.getInstance(disabled));
        options.put(MAX, new JSONNumber(max));
        options.put(MIN, new JSONNumber(min));
        options.put(ORIENTATION, new JSONString(orientation.getValue()));
        options.put(RANGE, JSONBoolean.getInstance(range));
        options.put(STEP, new JSONNumber(step));
        options.put(VALUE, new JSONNumber(value));
        options.put(VALUES, getJSONValues());
		return options;
	}
	
	private JSONValue getJSONValues(){
		if(values == null){
			return JSONNull.getInstance();
		}else{
	        JSONArray arrayValues = new JSONArray();
	        arrayValues.set(0, new JSONNumber(values[0]));
	        arrayValues.set(1, new JSONNumber(values[1]));
	        return arrayValues;
		}
	}

}
