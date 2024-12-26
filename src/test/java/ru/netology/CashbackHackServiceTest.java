package ru.netology;

import org.testng.annotations.Test;

import static org.testng.Assert.*;
public class CashbackHackServiceTest {

    @Test
    public void testRemain() {
        CashbackHackService cashbackHackService = new CashbackHackService();

        int amout = 1250;

        int actual = cashbackHackService.remain(amout);
        int expected = 650;

        assertEquals(expected, actual);
    }
}