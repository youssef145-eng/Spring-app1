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
  //      ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//        context.close(); // ❌ Error: No close() method in ApplicationContext

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationcontext.xml");


        UserInterface user=context.getBean("User",UserInterface.class);
        UserInterface user2=context.getBean("User",UserInterface.class);
user.setPerson(new Person());
        user.getPerson();
        System.out.println(user.getEmail()+" "+user.getTeam());
        System.out.println(user+"  "+user2);

context.close();
    }
}
