package Annotations;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Scope("prototype")
@Component
public class Client implements Company{
    @Override
    public void start() {
        System.out.println("client starts");
    }
}
