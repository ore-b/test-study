package kr.co.junit5;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class OrderedTest {

    @Test
    @Order(1)
    void initData() {
        System.out.println("1. 데이터 초기화");
    }

    @Test
    @Order(2)
    void doSomething() {
        System.out.println("2. 비즈니스 로직 테스트");
    }

    @Test
    @Order(3)
    void cleanUp() {
        System.out.println("3. 정리 작업");
    }
}