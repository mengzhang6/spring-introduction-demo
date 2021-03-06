package meng.spring.test18.advisors;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = null;
		try {
			// /Spring_Introduction/resources/spring-aop-schema-advisors.xml
			context = new ClassPathXmlApplicationContext(
					"classpath:spring-aop-schema-advisors.xml");
		} catch (BeansException e) {
			e.printStackTrace();
		}

		InvokeService invokeService = (InvokeService) context.getBean("invokeService");
//		invokeService.invoke();
		invokeService.invokeException();
	}

}
