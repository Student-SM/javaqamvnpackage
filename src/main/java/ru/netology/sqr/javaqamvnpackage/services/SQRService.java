package ru.netology.sqr.javaqamvnpackage.services;

public class SQRService {

    public int calcsquares(int min, int max) {

        for (int i = 10; i <= 99; i++) {
            int result = i * i;

            if (result >= min && result <= max) {
                // System.out.println(i);
                return i;
            }
        }
        return -1;
    }

}
