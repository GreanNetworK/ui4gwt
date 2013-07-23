package com.mockupcode.ui4gwt.ui.slider.options;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

public class OrientationTest {

	@Test
	public void testGetOrientationHorizontalValue() {
		String horizontalExpect = "horizontal";
		
		Orientation orientation = Orientation.HORIZONTAL;
		assertThat(orientation.getValue(), is(horizontalExpect));
	}
	
	@Test
	public void testGetOrientationVerticalValue() {
		String verticalExpect = "vertical";
		
		Orientation orientation = Orientation.VERTICAL;
		assertThat(orientation.getValue(), is(verticalExpect));
	}

}
