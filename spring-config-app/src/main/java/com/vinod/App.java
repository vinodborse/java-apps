package com.vinod;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
//    	DemoService ds = new DemoService();

    /*	ApplicationContext ac = new ClassPathXmlApplicationContext("config.xml");
    	DemoService ds = ac.getBean("dm", DemoService.class);
    */
    	
    	// for @Component
    /*	ApplicationContext ac = new ClassPathXmlApplicationContext("config.xml");
    	DemoService ds = ac.getBean("demoService", DemoService.class);
    */	
    	
    	ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
    	DemoService ds = ac.getBean(DemoService.class);
    	
    	
    	ds.m1();
    }
}
