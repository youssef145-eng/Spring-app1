package Annotations;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class User implements Company{
    @Override
    public void start() {
        System.out.println("User starts");
    }
    @PostConstruct
    public void intit() {
        System.out.println("connected to Db");
    }
    @PreDestroy
    public void end(){
        System.out.println("connected end to DB");
    }
}
