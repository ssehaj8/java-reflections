package com.bridgelabz.IntermediateProblems;
import java.lang.reflect.Method;
import java.util.Scanner;

class MathOperations{
    public int add(int a, int b){
        return a+b;
    }
    public int subtract(int a, int b){
        return a-b;
    }
    public int multiply(int a, int b){
        return a*b;
    }
}

public class DynamicMethodInvocation {
    public static void main(String[] args) throws Exception {
        MathOperations op=new MathOperations();

        Scanner sc=new Scanner(System.in);
        Class<?> cls = op.getClass();

        System.out.print("Enter method name (add, subtract, multiply): ");
        String s = sc.nextLine();

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        Method method = cls.getMethod(s, int.class, int.class);

        // Invoke method on object with parameters
        Object result = method.invoke(op, a, b);
        System.out.println("Result: " + result);
    }
}
/*
Enter method name (add, subtract, multiply): add
Enter first number: 8
Enter second number: 8
Result: 16

 */