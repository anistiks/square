package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {
    @Test
    public void calcTestOne() {
        SQRService service = new SQRService();

        int actual = service.calcSqr(200, 400);
        int expected = 6;

        Assertions.assertEquals(expected, actual);


    }
    @Test
    public void calcTestTwo() {
        SQRService service = new SQRService();

        int actual = service.calcSqr(0, 100);
        int expected = 1;

        Assertions.assertEquals(expected, actual);


    }
    @Test
    public void calcTestThree() {
        SQRService service = new SQRService();

        int actual = service.calcSqr(1, 9);
        int expected = 0;

        Assertions.assertEquals(expected, actual);


    }
    @Test
    public void calcTestFour() {
        SQRService service = new SQRService();

        int actual = service.calcSqr(9801, 10_000);
        int expected = 1;

        Assertions.assertEquals(expected, actual);


    }
    @Test
    public void calcTestFive() {
        SQRService service = new SQRService();

        int actual = service.calcSqr(10, 121);
        int expected = 2;

        Assertions.assertEquals(expected, actual);


    }
    @Test
    public void calcTestSix() {
        SQRService service = new SQRService();

        int actual = service.calcSqr(9, 9604);
        int expected = 89;

        Assertions.assertEquals(expected, actual);


    }
}