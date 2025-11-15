package kr.co.junit5;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UserServiceTest {

    private Object userService;

    @BeforeEach
    void setUp() {
        userService = new Object();   // 매 테스트마다 새로 생성
        System.out.println("각 테스트 직전에 실행");
    }

    @AfterEach
    void tearDown() {
        System.out.println("테스트 끝난 뒤에");
    }

    @Test
    void 회원_생성_성공() {
        // setUp 끝난 뒤 userService 사용
        System.out.println("회원_생성_성공");
    }

    @Test
    void 회원_조회_성공() {
        // 여기서도 setUp 한 번 더 실행된 뒤 userService 사용
        System.out.println("회원_조회_성공");
    }
}
