package com.digital_nomands.edabit;

import java.util.Map;

public class Tasks_1 {

    public static boolean AretheNumbersEqual(int a, int b){
        return a == b;
    }

    public static int UpvotesvsDownvotes(Map<String, Integer> votes){
        int upvotes = votes.getOrDefault("upvotes", 0);
        int downupvotes = votes.getOrDefault("downupvotes", 0);
        return upvotes - downupvotes;
    }

    public  static int ConvertHoursintoSeconds(int hours){
        if (hours < 0){
            throw new IllegalArgumentException("Время не может быть отрицательным");
        }
        return (hours * 60) * 60;
    }
}
