package com.epam.conditions;

public class SeasonDeterminer {

    public void tellTheSeason(int monthNumber) {
        String out = switch (monthNumber) {
            case 1, 2, 12 -> "Winter";
            case 3, 4, 5 -> "Spring";
            case 6, 8, 7 -> "Summer";
            case 9, 11, 10 -> "Autumn";
            default -> "Wrong month number";
        };
        System.out.println(out);
    }
}
