package com.dieend.example.whichlayouttab;

import java.util.Random;

import android.graphics.Color;

import com.dieend.adin.android.library.IADINSelector;

public class Splitter implements IADINSelector{
	static Random rand = new Random();
	@Override
	public boolean isInExperiment(String arg0) {
		return rand.nextInt(2)%2 == 0; 
	}
	@Override
	public boolean isReady() {
		return true;
	}
	@Override
	public boolean isTreated(){
		return true;
	}
	@Override
	public Object getParameter(String arg0, String arg1) {
		if (arg0.equals("testExperiment") && arg1.equals("color")) {
			return "#3bbc73";
		} else if (arg0.equals("testExperiment") && arg1.equals("parameter1")) {
			return "#e59400";
		}
		return null;
	}
}
