package telusko;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class TeluskoTutorialApplication {

	public static void main(String[] args) {
		//SpringApplication.run(TeluskoTutorialApplication.class, args);
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		//Vehicle obj = (Vehicle)context.getBean("car");
		//obj.drive();
		
		Tyre t = (Tyre)context.getBean("tyre");
		System.out.print(t.getBrand());
	}

}
