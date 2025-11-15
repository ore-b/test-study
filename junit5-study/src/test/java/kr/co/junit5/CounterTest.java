package kr.co.junit5;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_METHOD)
class CounterTest {

    private int counter = 0;

    @Test
    void test1() {
        counter++;
        System.out.println("test1 counter = " + counter);
    }

    @Test
    void test2() {
        counter++;
        System.out.println("test2 counter = " + counter);
    }
}
