package org.example;

public class Calculator {
    int a, b;
    char action;
    String res;

    public static void printMessage(){
        System.out.println("This is calculator");
    }

    public void calc(int a, int b, char action){
        switch (action){
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                System.out.println(a / b);
                break;
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
        }
    }
}
