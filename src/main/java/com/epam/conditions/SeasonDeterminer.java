package com.epam.conditions;

public class SeasonDeterminer {

    public void tellTheSeason(int monthNumber) {
        String out = "Wrong month number";
        switch (monthNumber){
            case 1: out = "January";
            case 2: out = "February";
            case 3: out = "March";
            case 4: out = "April";
            case 5: out = "May";
            case 6: out = "June";
            case 7: out = "July";
            case 8: out = "August";
            case 9: out = "September";
            case 10: out = "October";
            case 11: out = "November";
            case 12: out = "December";
        }
        System.out.println(out);
    }

}
