package org.narayan.springboot.learning.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * Spring boot demo to print all the readily available beans for a spring boot app.
 * 
 * @author unmattavesa
 *
 */
@SpringBootApplication
public class DefaultBeansInspector {

	public static void main(String[] args) {
		
		ApplicationContext context = SpringApplication.run(DefaultBeansInspector.class, args);
		
		System.out.println("************** Listing all the bean definition names ****************\n\n\n");
		
		 final String[] beanDefinitionNames = context.getBeanDefinitionNames();
		 
		 for(String beanDefinitionName : beanDefinitionNames) {
			 System.out.println(beanDefinitionName);
		 }
		 
		 System.out.printf("\n\n Total No. of default beans = %d\n\n\n", context.getBeanDefinitionCount());
	}
}
