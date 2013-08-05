package com.mockupcode.ui4gwt.ui.slider.options;


public class SliderOptions {
	
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

}
