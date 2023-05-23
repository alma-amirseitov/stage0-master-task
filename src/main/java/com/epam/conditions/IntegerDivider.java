package com.epam.conditions;

public class IntegerDivider {

    public void printCompletelyDivided(int dividend, int divider) {
        if (divider == 0) {
            System.out.println("division by zero");
            return;
        }
        int divisionResult = dividend / divider;
        int multiplicationResult = divisionResult * divider;

        if (multiplicationResult == dividend) {
            System.out.println("Can be divided completely");
        } else {
            System.out.println("cannot be divided completely");
        }
    }

}
