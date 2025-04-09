package Annotations;

import org.example.springapp1.Sport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("master")
public class Master implements Masterinterface{
    @Autowired
    private Sport sport;


/*
    @Autowired
    public Master(Sport sport) {
        this.sport = sport;
    }
*/
    /*
    @Autowired
    public void setSport(Sport sport) {
        this.sport = sport;
    }*/
    @Override
    public void name() {
        System.out.println("Master name is master.");
    }

    @Override
    public void callmysport() {
sport.start();
    }


}
