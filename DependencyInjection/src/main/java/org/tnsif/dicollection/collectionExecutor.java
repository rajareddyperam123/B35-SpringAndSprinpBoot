package org.tnsif.dicollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class collectionExecutor {
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext ap = new ClassPathXmlApplicationContext("collect.xml");

		CollectionDemo d = ap.getBean("def",CollectionDemo.class);
		d.display();
	}

}
