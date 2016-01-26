package com.ibs.annotation.client;

import com.ibs.annotation.server.Fruit;
import com.ibs.annotation.server.FruitColor;
import com.ibs.annotation.server.FruitProvider;
import com.ibs.annotation.server.FruitColor.Color;

public class Apple {

	@Fruit("Apple")
	private String appleName;

	@FruitColor(fruitColor = Color.RED)
	private String appleColor;

	@FruitProvider(id = 1, name = "Tom", address = "China")
	private String provider;

	public void setAppleColor(String appleColor) {
		this.appleColor = appleColor;
	}

	public String getAppleColor() {
		return appleColor;
	}

	public void setAppleName(String appleName) {
		this.appleName = appleName;
	}

	public String getAppleName() {
		return appleName;
	}
	
	public String getProvider() {
		return provider;
	}

	public void setProvider(String provider) {
		this.provider = provider;
	}

}
