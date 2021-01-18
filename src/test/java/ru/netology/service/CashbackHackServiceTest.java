package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldReturn1000WithAmount0() {
        int actual = service.remain(0);
        int excepted = 1000;

        assertEquals(excepted, actual);
    }

    @Test
    public void shouldReturn100WithAmount900() {
        int actual = service.remain(500);
        int excepted = 500;
        
        assertEquals(excepted, actual);
    }
    @Test
    public void shouldReturn0WithAmount1000() {
        int actual = service.remain(1000);
        int excepted = 0;

        assertEquals(excepted, actual);
    }
}