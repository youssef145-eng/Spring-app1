package Annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main_method1 {
    public static void main(String[] args) {


        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationcontext.xml");



Masterinterface master=context.getBean("master",Masterinterface.class);
master.name();
master.callmysport();
//context.close();


Company client1=context.getBean("client",Company.class);
        Company client2=context.getBean("client",Company.class);
        Company user=context.getBean("user",Company.class);
       System.out.println(client1==client2);
       context.close();
    }
}
