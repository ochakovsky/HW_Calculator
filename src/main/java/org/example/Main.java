package org.example;

public class Main {
    public static void main(String[] args) {
        Calculator.printMessage();

        Calculator cal_1 = new Calculator();
        cal_1.calc(1,2, '+');
        Calculator cal_2 = new Calculator();
        cal_2.calc(6,7, '-');

        cal_1.calc(4,4,'*');
        cal_2.calc(125,15, '/');
    }
}