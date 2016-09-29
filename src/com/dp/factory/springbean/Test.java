package com.dp.factory.springbean;

import java.io.IOException;
import java.util.Properties;

public class Test {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws Exception {
		BeanFactory f = new ClassPathXmlApplicationContext("com/dp/factory/springbean/applicationContext.xml");
		Object o = f.getBean("v");
		Moveable m = (Moveable)o;
		m.run();
	}

}
