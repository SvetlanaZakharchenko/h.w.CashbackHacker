package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    CashbackHackService cashbackHackService = new CashbackHackService();
    @Test
    public void showBelowBoundary() {
        int amount = 100;
        int expected = 900;

        int actual = cashbackHackService.remain(amount);

        assertEquals(expected, actual);

    }

    @Test
    public void showHigherBoundary () {
        int amount = 1900;
        int expected = 100;

        int actual = cashbackHackService.remain(amount);

        assertEquals(expected, actual);
    }

    @Test
    public void showNullBoundary () {
        int amount = 0;
        int expected = 1000;

        int actual = cashbackHackService.remain(amount);

        assertEquals(expected, actual);
    }

    @Test
    public void showEqualBoundary () {
        int amount = 1000;
        int expected = 0;

        int actual = cashbackHackService.remain(amount);

        assertEquals(expected, actual);
    }


}