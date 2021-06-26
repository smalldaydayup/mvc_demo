package com.example.mvc_demo.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author zhangkun.d
 */
@Component
public class HumanImpl implements Human {

//    private final Lawyer lawyer;

//    public HumanImpl(Lawyer lawyer) {
//        this.lawyer = lawyer;
//    }

    @Autowired
    private Lord lord;

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void say(String str) {
        System.out.println("I am a" + str);
    }

    public Lord getLord() {
        return lord;
    }

    public void setLord(Lord lord) {
        this.lord = lord;
    }
}
