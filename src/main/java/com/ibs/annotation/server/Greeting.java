package com.ibs.annotation.server;

import java.lang.annotation.Inherited;

@Inherited
public @interface Greeting {

	public enum FontColor {
		BULE, RED, GREEN
	};

	String name();

	FontColor fontColor() default FontColor.GREEN;

}
