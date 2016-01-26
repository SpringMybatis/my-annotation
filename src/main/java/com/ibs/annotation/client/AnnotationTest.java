package com.ibs.annotation.client;

import java.lang.reflect.Field;

import com.ibs.annotation.server.Fruit;
import com.ibs.annotation.server.FruitColor;
import com.ibs.annotation.server.FruitProvider;

public class AnnotationTest {

	public static void getFruitInfo(String clas) {
		try {
			Class<?> cls = Class.forName(clas);
			Field[] fields = cls.getDeclaredFields();

			for (Field field : fields) {
				if (field.isAnnotationPresent(Fruit.class) == true) {
					Fruit name = field.getAnnotation(Fruit.class);
					System.out.println("Fruit Name:" + name.value());
				}
				if (field.isAnnotationPresent(FruitColor.class)) {
					FruitColor color = field.getAnnotation(FruitColor.class);
					System.out.println("Fruit Color:" + color.fruitColor());
				}
				if (field.isAnnotationPresent(FruitProvider.class)) {
					FruitProvider Provider = field
							.getAnnotation(FruitProvider.class);
					System.out.println("Fruit FruitProvider: ProviderID:"
							+ Provider.id() + " Provider:" + Provider.name()
							+ " ProviderAddress:" + Provider.address());
				}
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		getFruitInfo("com.ibs.annotation.client.Apple");
	}

}
