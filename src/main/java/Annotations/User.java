package Annotations;

import org.springframework.stereotype.Component;

@Component
public class User implements Company{
    @Override
    public void start() {
        System.out.println("User starts");
    }
}
