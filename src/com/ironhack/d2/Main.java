package com.ironhack.d2;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Week 1 day 2 lessons");

//        ARRAYS

        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        System.out.println(days);
        System.out.println(Arrays.toString(days));
        System.out.println(days[3]);
        System.out.println(days.length);
        System.out.println(days[days.length - 1]);

        String[] subjectArray = createSubjectsArray();
        System.out.println(Arrays.toString(subjectArray));

    // LOOPS
        for ( int i = 0; i < 10; i++) {

            System.out.println(i);
        }
        for (int i = 0; i < subjectArray.length; i++){
            System.out.println(i + ":" + subjectArray[i]);
        }
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {

            }
        }
    }

    public static String[] createSubjectsArray() {
        String[] subjects = new String[5];
        subjects[0] = "Math";
        subjects[1] = "Language";
        subjects[2] = "History";
        subjects[3] = "Biology";
        subjects[4] = "Chemistry";

        return subjects;
    }
}