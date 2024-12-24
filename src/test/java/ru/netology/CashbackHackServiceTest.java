package ru.netology;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void testRemain() {
        CashbackHackService cashbackHackService = new CashbackHackService();

        int amout = 1250;

        int actual = cashbackHackService.remain(amout);
        int expected = 750;

        assertEquals(expected, actual);
    }
}