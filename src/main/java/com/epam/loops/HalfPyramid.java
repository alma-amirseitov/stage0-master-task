package com.epam.loops;

public class HalfPyramid {

    public void printHalfPyramid(int cathetusLength) {
        StringBuilder pyramid = new StringBuilder("*");
        int NumberOfSpaces = cathetusLength-1;
        for(int i = 1; i<=cathetusLength;i++){
            if(i >1){
                pyramid = new StringBuilder(pyramid+"*");
            }
            System.out.println(" ".repeat(NumberOfSpaces) + pyramid);
            NumberOfSpaces--;
        }
    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }

}
