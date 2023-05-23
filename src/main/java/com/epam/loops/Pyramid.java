package com.epam.loops;

public class Pyramid {

    public void printPyramid(int cathetusLength) {
        int numberOfDigits = Integer.toString(cathetusLength).length();
        int minus = 1;
        int NumberOfSpaces = cathetusLength+numberOfDigits-1;
        StringBuilder numberToPrint = new StringBuilder("1");
        for(int i = 1; i<=cathetusLength;i++){
            if(i%10 == 0){
                minus++;
            }
            NumberOfSpaces = NumberOfSpaces-minus;
            if(i >1){
                numberToPrint = new StringBuilder(i + numberToPrint.toString() + i);
            }
            System.out.println(" ".repeat(NumberOfSpaces) + numberToPrint);
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }

}
