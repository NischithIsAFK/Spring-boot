package com.nis.SpringBootFirst.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Alien {
    private int age;
//    @Autowired Can autowire here which is called

    private Computer com;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Computer getCom() {
        return com;
    }
    @Autowired //Setter injection
    @Qualifier("laptop") //Has high priority than "Primary annotation"

    public void setCom(Computer com) {
        this.com = com;
    }

    public void code(){
        com.compile();
    }
}
