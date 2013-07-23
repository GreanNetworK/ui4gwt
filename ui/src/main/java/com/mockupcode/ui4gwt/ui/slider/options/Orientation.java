package com.mockupcode.ui4gwt.ui.slider.options;

public enum Orientation {
	HORIZONTAL("horizontal"),VERTICAL("vertical");
	
	private String value;
	
	private Orientation(String value){
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}
