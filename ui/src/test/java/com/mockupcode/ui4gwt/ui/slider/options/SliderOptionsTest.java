package com.mockupcode.ui4gwt.ui.slider.options;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertThat;

import org.junit.BeforeClass;
import org.junit.Test;

public class SliderOptionsTest {
	
	private static SliderOptions options;
	
	@BeforeClass
	public static void setUp(){
		options = new SliderOptions();
	}

	@Test
	public void testDefaultOptionsAnimateValue() {
		assertThat(options.getAnimate(), is(false));
	}
	
	@Test
	public void testDefaultOptionsDisabledValue(){
		assertThat(options.getDisabled(), is(false));
	}
	
	@Test
	public void testDefaultOptionsMaxValue(){
		assertThat(options.getMax(), is(100));
	}
	
	@Test
	public void testDefaultOptionsMinValue(){
		assertThat(options.getMin(), is(0));
	}
	
	@Test
	public void testDefaultOptionsOrientationValue(){
		assertThat(options.getOrientation(), is(Orientation.HORIZONTAL));
	}
	
	@Test
	public void testDefaultOptionsRangeValue(){
		assertThat(options.getRange(), is(false));
	}
	
	@Test
	public void testDefaultOptionsStepValue(){
		assertThat(options.getStep(), is(1));
	}
	
	@Test
	public void testDefaultOptionsValue(){
		assertThat(options.getValue(), is((Number)0));
	}
	
	@Test
	public void tstDefaultOptionsValues(){
		assertThat(options.getValues(), nullValue());
	}

}
