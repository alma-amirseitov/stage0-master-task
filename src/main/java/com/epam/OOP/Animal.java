package com.epam.OOP;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public String getDescription(){
        String word = " paw";
        if (numberOfPaws > 1){
            word = " paws";
        }
        return hasFur ? "This animal is mostly "+this.color+". It has " + this.numberOfPaws +
                word+" and a fur." : "This animal is mostly "+this.color+". It has " + this.numberOfPaws +
                word+" and no fur.";
    }
}
