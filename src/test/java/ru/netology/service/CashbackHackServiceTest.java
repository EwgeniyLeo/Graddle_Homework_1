package ru.netology.service;

import org.testng.annotations.Test;


import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void testRemainUnderLimit() {
    int amount = 900;
    int expected = 100;
    CashbackHackService service = new CashbackHackService();
    int actual = service.remain(amount);
    assertEquals(actual,expected);
    }
    @Test
    public void testRemainLimit() {
        int amount = 1000;
        int expected = 0;
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);
        assertEquals(actual,expected);
    }


    @Test
    public void testRemainUpperLimit() {
        int amount = 1200;
        int expected = 0;
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);
        assertEquals(actual,expected);
    }
}