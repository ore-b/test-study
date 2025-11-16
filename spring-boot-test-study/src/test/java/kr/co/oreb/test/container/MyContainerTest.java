package kr.co.oreb.test.container;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.testcontainers.junit.jupiter.Testcontainers;
import org.testcontainers.mysql.MySQLContainer;

@SpringBootTest
@Testcontainers
@Import(MyTestContainerConfig.class)
public class MyContainerTest {

    @Test
    void testWithContainer(@Autowired MySQLContainer mysqlContainer) {
        System.out.println("jdbcUrl = " + mysqlContainer.getJdbcUrl());
        System.out.println("username = " + mysqlContainer.getUsername());
        System.out.println("password = " + mysqlContainer.getPassword());
    }

}
