package ai.jobiak.usesource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ai.jobiak.ifaces.BDigital;
public class TestAppContext {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		BDigital bDigital=(BDigital) context.getBean("bDigital");
		bDigital.publish();
		System.out.println(bDigital.hashCode());
		//Singleton design pattern, Every Servlet is a singleton
		BDigital bDigital2=(BDigital) context.getBean("bDigital");
		bDigital2.publish();
		System.out.println(bDigital.hashCode());
	}
 
} 
 