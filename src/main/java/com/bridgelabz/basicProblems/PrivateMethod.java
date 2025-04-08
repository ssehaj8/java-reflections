package com.bridgelabz.basicProblems;
import java.lang.reflect.Field;

class Person{
    private int age = 15;
}

public class PrivateMethod {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, IllegalArgumentException {
        Person p=new Person();

        Class<?> cls=p.getClass();
        Field field=cls.getDeclaredField("age");
        field.setAccessible(true);

        System.out.println("Old Value: " + field.get(p));
        field.set(p, 25);
        System.out.println("New Value: " + field.get(p));


    }
}

/*
Old Value: 15
New Value: 25

 */