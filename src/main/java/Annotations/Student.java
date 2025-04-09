package Annotations;

import org.springframework.stereotype.Component;

@Component
public class Student implements Company{
    @Override
    public void start() {
        System.out.println("Student starts");
    }
}
