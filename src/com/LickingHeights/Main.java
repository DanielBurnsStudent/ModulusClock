package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        modulusClock();
    }

    public static void modulusClock() {
        int hours;
        int minutes;
        Scanner keyboard;
        keyboard = new Scanner(System.in);

        System.out.println("Enter the number of hours.");
        hours = keyboard.nextInt();

        System.out.println("Enter the number of minutes.");
        minutes = keyboard.nextInt();

        hours = minutes >= 60 ? hours + 1 : hours;
        hours = (hours % 12);
        minutes = minutes % 60;

        System.out.printf("The time is: %d:%02d", hours, minutes);
    }
}
