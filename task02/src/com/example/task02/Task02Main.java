package com.example.task02;

public class Task02Main {

    public static void main(String[] args) {
        System.out.println(getSeason(-1));
    }

    static String getSeason(int monthNumber) {
        if(monthNumber < 1 || monthNumber > 12){
            throw new IllegalArgumentException(String.format("monthNumber %d is invalid, month number should be between 1..12", monthNumber));
        }
        else if (monthNumber <= 2 || monthNumber == 12){
            return "зима";
        }
        else if (monthNumber >= 3 && monthNumber <= 5) {
            return "весна";
        }
        else if(monthNumber >= 6 && monthNumber <= 8){
            return "лето";
        }
        else return "осень";
    }
}