package com.example.mvc_demo.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author zhangkun.d
 */
@Component
public class LordImpl implements Lord {
    @Autowired
    private Human human;

    public Human getHuman() {
        return human;
    }

    public void setHuman(Human human) {
        this.human = human;
    }

    @Override
    public void loud() {
        System.out.println("i`m Land Of lord");
    }
}
