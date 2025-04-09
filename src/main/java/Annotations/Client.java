package Annotations;

import org.springframework.stereotype.Component;

@Component
public class Client implements Company{
    @Override
    public void start() {
        System.out.println("client starts");
    }
}
