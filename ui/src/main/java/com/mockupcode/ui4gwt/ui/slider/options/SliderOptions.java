package com.mockupcode.ui4gwt.ui.slider.options;

import com.google.gwt.json.client.JSONBoolean;
import com.google.gwt.json.client.JSONObject;
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
	private Number value = 0;
	private Number[] values = null;
	
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
	public Number getValue() {
		return value;
	}
	public void setValue(Number value) {
		this.value = value;
	}
	public Number[] getValues() {
		return values;
	}
	public void setValues(Number[] values) {
		this.values = values;
	}
	@Override
	public JSONObject getOptions() {
		JSONObject options = new JSONObject();
        options.put(ANIMATE, JSONBoolean.getInstance(animate));
		return options;
	}

}
