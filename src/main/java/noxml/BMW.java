package noxml;

import org.springframework.stereotype.Component;

@Component
public class BMW implements Car{
    @Override
    public void type() {
        System.out.println("BMW car");
    }
}
