package com.in28minutes.junit;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class MyMathTest {

    @BeforeEach
    public void before(){
        System.out.println("before");
    }

    @AfterEach
            public void after(){
        System.out.println("after");
    }

    @BeforeAll
    public static void beforeAll(){
        System.out.println("Before ALL");
    }

    @AfterAll
    public static void afterAll(){
        System.out.println("After ALL");
    }


    MyMath myMath = new MyMath();
    //MyMath.sum
    //1,2,3 => 6
    @Test
    void sum_with3numbers() {

        System.out.println("Test1");
        //Check the result is 6
        //Check result==6
        assertEquals(6, myMath.sum(new int[]{1,2,3}));

    }

    @Test
    void sum_with1number() {
        System.out.println("Test2");
        //Check the result is 3
        //Check result==3
        assertEquals(3, myMath.sum(new int[]{3}));

    }
}