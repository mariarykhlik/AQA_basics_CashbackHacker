package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Assertions;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void testRemainUnderBoundary() {
        int expected = 100;
        int actual = service.remain(900);
        assertEquals(expected, actual);
    }

    @Test
    public void testRemainEqualBoundary() {
        int expected = 0;
        int actual = service.remain(1000);
        assertEquals(expected, actual);
    }

    @Test
    public void testRemainOverBoundary() {
        int expected = 100;
        int actual = service.remain(1900);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void testRemainUnderBoundaryByJupiter() {
        int expected = 100;
        int actual = service.remain(900);
        Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void testRemainEqualBoundaryByJupiter() {
        int expected = 0;
        int actual = service.remain(1000);
        Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void testRemainOverBoundaryByJupiter() {
        int expected = 100;
        int actual = service.remain(1900);
        Assertions.assertEquals(expected, actual);
    }
}