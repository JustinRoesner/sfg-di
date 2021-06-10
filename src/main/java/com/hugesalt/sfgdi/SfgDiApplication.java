package com.hugesalt.sfgdi;

import com.hugesalt.sfgdi.controllers.MyController;
import com.hugesalt.sfgdi.controllers.PropertyInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		//handle on the spring application context
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

		//ask the spring context for the instance of mycontroller
		MyController myController = (MyController) ctx.getBean("myController");

		String greeting = myController.sayHello();

		System.out.println(greeting);

		System.out.println("----------- Property");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());


	}

}
