package noxml;

import org.springframework.stereotype.Component;

@Component
public class Jeep implements Car{
    @Override
    public void type() {
        System.out.println("Jeep car");
    }
}
