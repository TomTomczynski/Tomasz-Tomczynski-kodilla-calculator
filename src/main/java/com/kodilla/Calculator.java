package com.kodilla;

public class Calculator {

    int numberA;
    int numberB;
    int result;

    public void someMethod () {
        System.out.println("It works!");
    }

    Calculator( int a ,int b){
        numberA = a;
        numberB = b;
    }

    public void addingNumbers(){
        result = numberA + numberB;
    }

    public void subtractingNumbers(){
        result = numberA - numberB;
    }

    public void showResult(){
        System.out.println("The result of the operation: " + result);
    }


    public static void main(String[] args) {
        Calculator theCalculator = new Calculator(10, 5);
        theCalculator.addingNumbers();
        theCalculator.showResult();
        theCalculator.subtractingNumbers();
        theCalculator.showResult();
    }
}
