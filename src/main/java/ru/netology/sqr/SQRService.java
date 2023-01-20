package ru.netology.sqr;

public class SQRService {
    public int calcSqr(int a, int b) {
        int result = 0;
        for (int i = 10; i <= 99; i++) {
            int sq = i * i;
            if (sq >= a) {
                if (sq <= b) {
                    result = result + 1;
                }
            }

        }
        return result;
    }

}
