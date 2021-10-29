package ru.netology.sqr;

public class SQRService {

    public int sqrRange(int numOne, int numTwo) {
        int count = 0;
        int j;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= numOne && i * i <= numTwo) {
                count = count + 1;
            }
        }
        return count;
    }
}
