package org.tnsif.usingautowireannot;

import javax.sound.sampled.Port;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

@SuppressWarnings("hiding")
public class Citizen<passport> {
	//DI in terms of objects
		private Port passport;
		
		//default-constructor
		
		public Citizen() {
			System.out.println("Inside Citizen-Default constructor");
			this.passport=this.passport;
			}

		//DI using setters
		//@Autowired annotation ->to get an element in xml configuration file
		//@Autowired annotation can be used to autowire bean on the setter method
		/*At a one time, if we create multiple beans for same type(class)
	 	then we will get exception, to overcome these , we have to use 
	 	@Qualifier in class*/
		@Autowired
		@Qualifier("pass")
		public void setPassport(Port passport) {
			this.passport = passport;
		}
		
		//DI using constructor
		//@Autowired on constructor
		
		/*@Autowired
		public Citizen(Passport passport) {
			System.out.println("Autowired on constructor");
			this.passport = passport;
		}*/


		public void display()
		{
			Port.documentation();
			System.out.println("Result: "+((Object) passport).getCity()+" "
					+((Object) passport).getEnddate());
		}
		

	}

