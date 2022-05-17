package ai.jobiak.sample;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class UseEmployees {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		System.out.println(context.containsBean("employee"));
		EmployeeDetails ref=(EmployeeDetails)context.getBean("employee");
		System.out.println(ref);
		EmployeeDetails ref2=(EmployeeDetails)context.getBean("employee2");
		System.out.println(ref2);
	}

}
