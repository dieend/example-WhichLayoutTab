package com.dieend.example.whichlayouttab.aspect;

import com.dieend.example.whichlayouttab.MainActivity;
import com.dieend.example.whichlayouttab.Splitter;


public privileged aspect SplittingAspect {
	void around(com.dieend.example.whichlayouttab.MainActivity instance) : target(instance) && call(void MainActivity.layoutA()) {
		switch(Splitter.whichVersioN()) {
			case 0:
				proceed(instance);
				break;
			case 1:
				instance.layoutB();
				break;
		}
	}
}
