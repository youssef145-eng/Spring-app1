package org.example.springapp1;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
      //  Sport football = new Basketball();
        //football.start();
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationcontext.xml");
        Sport football = context.getBean("football", Sport.class);
        football.start();
        context.close();
    }
}
