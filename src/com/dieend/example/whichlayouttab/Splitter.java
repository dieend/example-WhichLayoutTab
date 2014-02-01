package com.dieend.example.whichlayouttab;

import java.util.Random;

public class Splitter {
	static Random rand = new Random();
	public static int whichVersioN() {
		return rand.nextInt(2);
	}
}
