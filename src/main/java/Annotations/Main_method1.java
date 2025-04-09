package Annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main_method1 {
    public static void main(String[] args) {


        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationcontext.xml");



Masterinterface master=context.getBean("master",Masterinterface.class);
master.name();
master.callmysport();
context.close();




    }
}
