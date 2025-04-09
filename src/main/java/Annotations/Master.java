package Annotations;

import org.example.springapp1.Sport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("master")
public class Master implements Masterinterface{
    @Autowired
    private Sport sport;
    @Qualifier("user")
    private Company company;
    @Autowired

public Master(@Qualifier("user")Company company) {
    this.company = company;
}
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
        company.start();

    }

    @Override
    public void callmysport() {
sport.start();
    }


}
