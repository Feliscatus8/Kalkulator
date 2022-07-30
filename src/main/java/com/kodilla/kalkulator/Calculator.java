package com.kodilla.kalkulator;

public class Calculator {
    public double addNumbers(double addendOne, double addendTwo){
        return addendOne + addendTwo;
    }
    public double subtractNumbers(double minuend, double subtrahend){
        return minuend - subtrahend;
    }
    public static void main(String args[]){
        Calculator calculator = new Calculator();
        System.out.println(calculator.addNumbers(15.75, 16.25));
        System.out.println(calculator.subtractNumbers(13.38, 5.38));
    }
}
