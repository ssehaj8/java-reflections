package com.bridgelabz.basicProblems;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;

class Employee {
    private String name;
    public int age;

    public Employee() {}
    public Employee(String name, int age) {}

    public void work() {
        System.out.println("Working...");
    }
}

public class ClassInformation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter class name (e.g., java.util.Date or yourpackage.Employee): ");
        String className = sc.nextLine();

        try {
            // Dynamically load class
            Class<?> cls = Class.forName(className);

            System.out.println("Class Name: " + cls.getName());

            System.out.println("\nFields:");
            for (Field field : cls.getDeclaredFields()) {
                System.out.println(field);
            }

            System.out.println("\nMethods:");
            for (Method method : cls.getDeclaredMethods()) {
                System.out.println(method);
            }

            System.out.println("\nConstructors:");
            for (Constructor<?> constructor : cls.getDeclaredConstructors()) {
                System.out.println(constructor);
            }

        } catch (ClassNotFoundException e) {
            System.out.println("Class not found: " + className);
        }
    }
}