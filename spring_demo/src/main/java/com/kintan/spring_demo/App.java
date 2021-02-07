package com.kintan.spring_demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
   	ApplicationContext factory=new ClassPathXmlApplicationContext("spring.xml");
   //BeanFactory factory= new XmlBeanFactory(new FileSystemResource("spring.xml")); //use to get object
    	Alien obj=(Alien)factory.getBean("alien");
    	obj.show();
        
    }
}
