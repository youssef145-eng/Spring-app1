package org.example.springapp1;

import org.springframework.stereotype.Component;

@Component
public class Football implements Sport {
    @Override
    public void start(){
        System.out.println("Football is running");
    }
}
