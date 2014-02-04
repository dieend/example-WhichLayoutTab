package com.dieend.example.whichlayouttab;

import java.util.Random;

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
}
