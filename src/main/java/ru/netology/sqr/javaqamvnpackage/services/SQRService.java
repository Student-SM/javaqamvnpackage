package ru.netology.sqr.javaqamvnpackage.services;

public class SQRService {

    public int calcsquares(int min, int max) {
        int count = 0;

        for (int i = 10; i <= 99; i++) {
            int result = i * i;

            if (result >= min && result <= max) {
                count++;
            }
        }
        return count;
    }

}
