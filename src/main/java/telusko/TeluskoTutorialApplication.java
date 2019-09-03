package telusko;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class TeluskoTutorialApplication {

	public static void main(String[] args) {
		//SpringApplication.run(TeluskoTutorialApplication.class, args);
		//ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		//Car obj = (Car)context.getBean("car");
		//obj.drive();
		
		//Tyre t = (Tyre)context.getBean("tyre");
		//System.out.print(t);
		
		ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Samsung s7 = factory.getBean(Samsung.class);
		s7.config();
	}

}
