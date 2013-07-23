package com.mockupcode.ui4gwt.ui.slider;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayNumber;
import com.google.gwt.json.client.JSONArray;
import com.google.gwt.json.client.JSONBoolean;
import com.google.gwt.json.client.JSONNumber;
import com.google.gwt.json.client.JSONObject;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.Element;
import com.google.gwt.user.client.Event;
import com.google.gwt.user.client.Random;
import com.google.gwt.user.client.ui.Widget;
import com.mockupcode.ui4gwt.ui.slider.event.SlideEvent;
import com.mockupcode.ui4gwt.ui.slider.event.StopEvent;
import com.mockupcode.ui4gwt.ui.slider.handler.SlideHandler;
import com.mockupcode.ui4gwt.ui.slider.handler.StopHandler;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author wjirawong
 */
public class Slider extends Widget{

    private JSONObject options;
    private List<SlideHandler> slideHandlers = new ArrayList<SlideHandler>();
    private List<StopHandler> stopHandlers = new ArrayList<StopHandler>();
    
    private double minValue;
    private double maxValue;

    public Slider(double minimumValue, double maximumValue, double defaultMinValue, double defaultMaxValue) {
        this(getOptions(minimumValue, maximumValue, new double[]{defaultMinValue, defaultMaxValue}));
        this.minValue = defaultMinValue;
        this.maxValue = defaultMaxValue;
    }

    public Slider(JSONObject options) {
        super();
        Element divEle = DOM.createDiv();
        setElement(divEle);
        divEle.setId("slider" + Random.nextInt());

        this.options = options;
        if (options == null) {
            this.options = getOptions(0, 100, new double[]{0, 100});
        }
    }

    public static JSONObject getOptions(double minValue, double maxValue, double[] defaultValue) {
        JSONObject options = new JSONObject();
        options.put("min", new JSONNumber(minValue));
        options.put("max", new JSONNumber(maxValue));
        options.put("range", JSONBoolean.getInstance(true));

        JSONArray defaultVal = new JSONArray();
        defaultVal.set(0, new JSONNumber(defaultValue[0]));
        defaultVal.set(1, new JSONNumber(defaultValue[1]));
        options.put("values", defaultVal);
        return options;
    }

    @Override
    protected void onLoad() {
        createSlider(this, getElement().getId(), options.getJavaScriptObject());
        super.onLoad();
    } 

    @Override
    protected void onUnload() {
        destroySliderBar(this, getElement().getId());
    }
    
    public double getMinimumValue(){
        return getIntOptionNative(getElement().getId(), "min");
    }
    
    public void setMinimumValue(double value){
        options.put("min", new JSONNumber(value));
        setIntOptionNative(getElement().getId(), "min", value);
    }
    
    public double getMaximumValue(){
        return getIntOptionNative(getElement().getId(), "max");
    }
    
    public void setMaximumValue(double value){
        options.put("max", new JSONNumber(value));
        setIntOptionNative(getElement().getId(), "max", value);
    }
    
    public double getMinValue(){
        return getValueNative(getElement().getId(), 0);
    }
    
    public double getMaxValue(){
        return getValueNative(getElement().getId(), 1);
    }
    
    public void setMinValue(double value){
        setValues(value, getMaxValue());
    }
    
    public void setMaxValue(double value){
        setValues(getMinValue(), value);
    }
    
    public void setValues(double min,double max){
        JSONArray vals = new JSONArray();
        vals.set(0, new JSONNumber(min));
        vals.set(1, new JSONNumber(max));
        setValuesNative(getElement().getId(), vals.getJavaScriptObject());
    }
    
    private void onStopEvent(Event evt, JsArrayNumber values){
        Double[] vals = extractArray(values);
        this.options = getOptions(0, 100, new double[]{vals[0], vals[1]});
        
        if(vals[0] != minValue || vals[1] != maxValue){
        	minValue = vals[0];
        	maxValue = vals[1];
	        StopEvent e = new StopEvent(this, evt, vals);
	        for(StopHandler sliderListener : stopHandlers){
	            sliderListener.onStop(e);
	        }
        }
    }
    
    private void onSlideEvent(Event evt, JsArrayNumber values){
        Double[] vals = extractArray(values);        
        SlideEvent e = new SlideEvent(this, evt, vals);
        for(SlideHandler sliHandler : slideHandlers){
        	sliHandler.onSlide(e);
        }
    }
    
    private Double[] extractArray(JsArrayNumber values) {
        int len = values.length();
        Double[] vals = new Double[len];
        for (int i = 0; i < len; i++) {
            vals[i] = new Double(values.get(i));
        }
        return vals;
    }

    private native void createSlider(Slider slider, String id, JavaScriptObject options) /*-{
        options.stop = function(event, ui) {
            slider.@com.mockupcode.ui4gwt.ui.slider.Slider::onStopEvent(Lcom/google/gwt/user/client/Event;Lcom/google/gwt/core/client/JsArrayNumber;)(event, ui.values);
        };
        options.slide = function(event, ui) {
            slider.@com.mockupcode.ui4gwt.ui.slider.Slider::onSlideEvent(Lcom/google/gwt/user/client/Event;Lcom/google/gwt/core/client/JsArrayNumber;)(event, ui.values);
        };
        $wnd.jQuery("#" + id).slider(options);
    }-*/;
    
    private native void destroySliderBar(Slider slider, String id) /*-{
        $wnd.jQuery("#" + id).slider("destroy");
    }-*/;
    
    private native double getIntOptionNative(String id,String option)/*-{
        return $wnd.jQuery("#" + id).slider("option", option);
    }-*/;
    
    private native void setIntOptionNative(String id,String option,double value)/*-{
        $wnd.jQuery("#" + id).slider("option", option, value);
    }-*/;
    
    private native double getValueNative(String id, int index) /*-{
        return $wnd.jQuery("#" + id).slider("values", index);
    }-*/;
    
    private native void setValuesNative(String id, JavaScriptObject values) /*-{
        $wnd.jQuery("#" + id).slider("option", "values", values);
    }-*/;
    
}
