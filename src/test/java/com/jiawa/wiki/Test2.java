package com.jiawa.wiki;

import org.junit.jupiter.api.*;

/**
 * @Author Chen
 * @date 2021/9/29 9:26
 * @description
 */
public class Test2 {

    @BeforeAll
    static void init() {
        System.out.println("init once");
    }

    @BeforeEach
    void each() {
        System.out.println("init");
    }

    @AfterEach
    void each2() {
        System.out.println("after");
    }

    @Test
    void fun1() {
        System.out.println("111");
    }

    @Test
    void fun2() {
        System.out.println("222");
    }
}
