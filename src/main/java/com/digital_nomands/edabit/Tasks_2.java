package com.digital_nomands.edabit;

public class Tasks_2 {

    public static int MaximumEdgeTriangle(int a, int b){
        return (a + b) - 1;
    }

    public static int FindThePerimeterOfARectangle(int a, int b){
        return (a + b) * 2;
    }

    public static int PowerCalculator(int x, int y){
        return x * y;
    }

    public static int AreaOfATriangle(int d, int g){
        return (d * g) / 2;
    }

    public static boolean IsTheNumberLessThanOrEqualToZero(int num){
        if (num <= 0){
            return true;
        }else {
            return false;
        }
    }

    public static int Remainder(int a, int b) {
        return a % b;
    }
}
