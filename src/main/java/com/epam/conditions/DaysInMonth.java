package com.epam.conditions;

public class DaysInMonth {
    public void printDays(int year, int month) {
        int[] Month_length = {31,28,31,30,31,30,31,31,30,31,30,31};
        if (year < 0 || month < 2 || month >12){
            System.out.println("invalid date");
        }
        if(isLeapYear(year)){
            Month_length[1] = 29;
        }
        System.out.println(Month_length[month-1]);
    }

    public boolean isLeapYear(int year) {
        if (year % 4 != 0) {
            return false;
        } else if (year % 100 != 0) {
            return true;
        } else return year % 400 == 0;
    }

}
