package org.example.springapp1;


import dependency_injection.Person;
import dependency_injection.User;
import dependency_injection.UserInterface;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
      //  Sport football = new Basketball();
        //football.start();
        /*
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationcontext.xml");
        Sport football = context.getBean("football", Sport.class);
        football.start();
        context.close();
      Person person = new Person();
        User user=new User(person);
        user.getPerson();

         */
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        UserInterface user=context.getBean("User",UserInterface.class);
user.setPerson(new Person());
        user.getPerson();

    }
}
