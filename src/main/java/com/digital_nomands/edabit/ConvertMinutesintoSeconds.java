package com.digital_nomands.edabit;

public class ConvertMinutesintoSeconds {

    public static int ConvertMinutesToSeconds(int minutes) throws IllegalAccessException {
        if (minutes < 0){
            throw  new IllegalAccessException("Минута не может быть отрицательным");
        }
        return  minutes * 60;
    }
}
