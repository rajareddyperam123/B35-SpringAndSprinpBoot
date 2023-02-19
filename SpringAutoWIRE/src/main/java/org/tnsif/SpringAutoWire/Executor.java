//Program to demonstrate on autowiring
//driver class
package org.tnsif.SpringAutoWire;

import java.applet.AppletContext;

@SuppressWarnings("deprecation")
public class Executor {

	public static void main(String[] args) {
		AppletContext c=new AppletContext("beans.xml");
		HUMAN h1=((Object) c).getBean("human",HUMAN.class);
		h1.startPumping();
		
	}

}
