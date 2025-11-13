package kr.co.junit5;

import org.junit.jupiter.api.ClassOrderer;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestClassOrder;

@TestClassOrder(ClassOrderer.OrderAnnotation.class)
class OrderedNestedTests {

    @Nested
    @Order(1)
    class PrimaryTests {

        @Test
        void test1() {
            System.out.println("test1");
        }
    }

    @Nested
    @Order(2)
    class SecondaryTests {

        @Test
        void test2() {
            System.out.println("test2");
        }
    }
}