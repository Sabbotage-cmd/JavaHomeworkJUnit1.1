package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldReturn1000WithAmount0() {
        int actual = service.remain(0);
        int excepted = 1000;

        assertEquals(actual, excepted);
    }

    @Test
    public void shouldReturn100WithAmount900() {
        int actual = service.remain(500);
        int excepted = 500;
        
        assertEquals(actual, excepted);
    }
    @Test
    public void shouldReturn0WithAmount1000() {
        int actual = service.remain(1000);
        int excepted = 0;

        assertEquals(actual, excepted);
    }
}