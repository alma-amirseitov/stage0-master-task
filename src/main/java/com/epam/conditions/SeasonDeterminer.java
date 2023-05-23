package com.epam.conditions;

public class SeasonDeterminer {

    public void tellTheSeason(int monthNumber) {
        String out = "Wrong month number";
        switch (monthNumber){
            case 1: out = "Winter";
            case 2: out = "Winter";
            case 3: out = "Spring";
            case 4: out = "Spring";
            case 5: out = "Spring";
            case 6: out = "Summer";
            case 7: out = "Summer";
            case 8: out = "Summer";
            case 9: out = "Autumn";
            case 10: out = "Autumn";
            case 11: out = "Autumn";
            case 12: out = "Winter";
        }
        System.out.println(out);
    }

}
