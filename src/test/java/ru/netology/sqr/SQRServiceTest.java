package ru.netology.sqr;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @org.junit.jupiter.api.Test
    public void shouldSqrRange() {
        SQRService service = new SQRService();

        int numOne = 200;
        int numTwo = 300;

        int expected = 3;

        int actual = service.sqrRange(numOne, numTwo);

        assertEquals(expected, actual);

    }
}