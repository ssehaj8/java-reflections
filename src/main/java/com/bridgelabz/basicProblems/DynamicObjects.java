package com.bridgelabz.basicProblems;

import java.lang.reflect.Constructor;
class Student {
    private String name;


    public Student(String name) {
        this.name = name;
    }
    public void display() {
        System.out.println("Student Name: " + name);
    }
}


public class DynamicObjects {
    public static void main(String[] args) throws Exception {
        Class<?> cls = Student.class;
        // Get constructor
        Constructor<?> constructor = cls.getConstructor(String.class);
        // Create instance dynamically
        Student student = (Student) constructor.newInstance("Sehaj");
        // Call method
        student.display();
    }

}
/*
Student Name: Sehaj
 */