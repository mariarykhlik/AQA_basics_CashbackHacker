package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void testRemainUnderBoundary() {
        int expected = 100;
        int actual = service.remain(900);
        assertEquals(actual, expected);
    }

    @Test
    public void testRemainEqualBoundary() {
        int expected = 0;
        int actual = service.remain(1000);
        assertEquals(actual, expected);
    }

    @Test
    public void testRemainOverBoundary() {
        int expected = 100;
        int actual = service.remain(1900);
        assertEquals(actual, expected);
    }
}