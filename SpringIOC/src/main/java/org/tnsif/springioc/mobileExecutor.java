package org.tnsif.springioc;

import java.applet.AppletContext;

public class mobileExecutor {
public static void main(String[] args) {
		
		//hard coding
		/*Airtel a=new Airtel();
		Jio j=new Jio();
		a.call();
		a.data();
		j.call();
		j.data();*/
		
		//spring IOC
		/*Here ApplicationContext is a IOC container and its a interface
		 * to implement these interface we need to use implementable class
		 * which is ClassPathXmlApplicationContext
		 */
		
		//we can rename the "beans.xml" file as well
		@SuppressWarnings("deprecation")
		AppletContext a=new AppletContext("beans.xml");
		System.out.println("Configuration loaded.....");
		
		/*Airtel a1=(Airtel)a.getBean("airtel");
		Jio j=(Jio)a.getBean("jio");
		a1.call();
		a1.data();
		j.call();
		j.data();*/
		
		sim s=((Object) a).getBean("sim",sim.class);
		s.call();
		s.data();
		
		
		
	}


}
