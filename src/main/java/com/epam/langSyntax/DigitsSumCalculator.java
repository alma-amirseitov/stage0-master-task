package com.epam.langSyntax;

public class DigitsSumCalculator {

    public void calculateSum(int number) {
        int sum = number%10 + number/1000 + (number / 100)%10 + (number/10)%100;
        System.out.println(sum);
    }

}
