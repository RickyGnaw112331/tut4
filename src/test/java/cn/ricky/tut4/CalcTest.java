package cn.ricky.tut4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalcTest {
    Calc calc = new Calc();

    @Test
    void add() {
        int a = (int)(Math.random());
        int b = (int)(Math.random());
        assertEquals(calc.add(a,b),a+b);
    }

    @Test
    void subtract() {
        int a = (int)(Math.random());
        int b = (int)(Math.random());
        assertEquals(calc.subtract(a,b),a-b);
    }
}