package Annotations;

import org.springframework.stereotype.Component;

@Component("master")
public class Master implements Masterinterface{

    @Override
    public void name() {
        System.out.println("Master name is master.");
    }


}
