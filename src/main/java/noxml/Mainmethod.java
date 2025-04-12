package noxml;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContextExtensionsKt;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mainmethod {
    public static void main(String[] args) {
        System.out.println("Hello World");
      AnnotationConfigApplicationContext context =
              new AnnotationConfigApplicationContext(Springconfig.class);


        Car car=context.getBean("BMW",Car.class);
        car.type();
        MotoCycle m1=context.getBean("motoCycle",MotoCycle.class);
        m1.moto();
        context.close();
    }
}
