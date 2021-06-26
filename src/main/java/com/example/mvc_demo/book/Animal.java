package com.example.mvc_demo.book;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author zhangkun
 */
public class Animal {

    public int age;

    public Animal(int age) {
        this.age = age;
    }

    public void say(String str) {
        System.out.println(str);
    }

    public static void main(String[] args) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        Class<?> clazz = Animal.class;

//        Object obj = clazz.newInstance();
//        Animal ami = (Animal) obj;
        Constructor c = clazz.getConstructor(int.class);
        Animal ami = (Animal) c.newInstance(5);

                Field field = clazz.getField("age");
        Integer age = (Integer) field.get(ami);
        System.out.println(age);
        Method method = clazz.getMethod("say", String.class);
        method.invoke(ami, "wang");
        ami.say("miao");
        System.out.println(clazz);
    }
}
