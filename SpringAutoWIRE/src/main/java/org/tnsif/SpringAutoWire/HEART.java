package org.tnsif.SpringAutoWire;
//Program to demonstrate on attiring
public class HEART {
	//DI using setters
		//in order to use byName , setters method is used for DI
		public void setHeart(HEART heart) {
		}
		
		//DI using constructors
		/*public Human(Heart heart) {
			super();
			this.heart = heart;
			System.out.println("Autowire using constructor");
		}*/
		
		public void startPumping()
		{
			HEART.pump();
		}

		static void pump() {
			// TODO Auto-generated method stub
			
		}

}
