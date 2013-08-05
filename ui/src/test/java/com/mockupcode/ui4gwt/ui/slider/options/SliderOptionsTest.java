package com.mockupcode.ui4gwt.ui.slider.options;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class SliderOptionsTest {
	
	private SliderOptions options;
	
	@Before
	public void setUp(){
		options = new SliderOptions();
	}

	@Test
	public void testDefaultOptionsAnimateValue() {
		assertThat(options.isAnimate(), is(false));
	}
	
	@Test
	public void testSetAndGetAnimateValue(){
		options.setAnimate(true);
		assertThat(options.isAnimate(), is(true));
	}
	
	@Test
	public void testDefaultOptionsDisabledValue(){
		assertThat(options.isDisabled(), is(false));
	}
	
	@Test
	public void testSetAndGetDisabledValue(){
		options.setDisabled(true);
		assertThat(options.isDisabled(), is(true));
	}
	
	@Test
	public void testDefaultOptionsMaxValue(){
		assertThat(options.getMax(), is(100));
	}
	
	@Test
	public void testSetAndGetMaxValue(){
		options.setMax(50);
		assertThat(options.getMax(), is(50));
	}
	
	@Test
	public void testDefaultOptionsMinValue(){
		assertThat(options.getMin(), is(0));
	}
	
	@Test
	public void  testSetAndGetMinValue(){
		options.setMin(50);
		assertThat(options.getMin(), is(50));
	}
	
	@Test
	public void testDefaultOptionsOrientationValue(){
		assertThat(options.getOrientation(), is(Orientation.HORIZONTAL));
	}
	
	@Test
	public void testSetAndGetOrientationValue(){
		options.setOrientation(Orientation.VERTICAL);
		assertThat(options.getOrientation(), equalTo(Orientation.VERTICAL));
	}
	
	@Test
	public void testDefaultOptionsRangeValue(){
		assertThat(options.isRange(), is(false));
	}
	
	@Test
	public void testSetAndGetRangeValue(){
		options.setRange(true);
		assertThat(options.isRange(), is(true));
	}
	
	@Test
	public void testDefaultOptionsStepValue(){
		assertThat(options.getStep(), is(1));
	}
	
	@Test
	public void testSetAndGetStepValue(){
		options.setStep(5);
		assertThat(options.getStep(), is(5));
	}
	
	@Test
	public void testDefaultOptionsValue(){
		assertThat(options.getValue(), is((Number)0));
	}
	
	@Test
	public void testSetAndGetValue(){
		options.setValue(10);
		assertThat(options.getValue(), equalTo((Number)10));
	}
	
	@Test
	public void testDefaultOptionsValues(){
		assertThat(options.getValues(), nullValue());
	}
	
	@Test
	public void testSetAndGetValues(){
		Number[] values = new Number[]{10,20};
		options.setValues(values);
		assertThat(options.getValues(), is(new Number[]{10,20}));
	}

}
