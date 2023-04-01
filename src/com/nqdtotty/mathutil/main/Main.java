/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.nqdtotty.mathutil.main;

import com.nqdtotty.mathutil.core.MathUtil;

/**
 *
 * @author NQDtotty
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("This message come from Main method!");
        testFactorialGivenRightArgumentReturnsWell();
//        testFactorialGivenWrongArgumentThrowsException();

    }

    public static void testFactorialGivenRightArgumentReturnsWell() {
        //Case #1: Test getFactorial() with n = 0
        //Expected value = 1
        int n = 0;
        long expectedValue = 1;
        long actualValue = MathUtil.getFactorial(n);

        System.out.println("Test " + n + "! | expected: " + expectedValue
                + " | actual: " + actualValue);

        //Case #2: test getFactorial() with n = 1;
        //Expected value = 1
        n = 1;
        expectedValue = 1;
        actualValue = MathUtil.getFactorial(n);
        System.out.println("Test " + n + "! | expected: " + expectedValue
                + " | actual: " + actualValue);

        //Test case #3: test getFactorial() with n = 2;
        System.out.println("Test 2! | expected: 2"
                + " | actual: " + MathUtil.getFactorial(2));

        //Test case #4: test getFactorial() with n = 3;
        System.out.println("Test 3! | expected: 6"
                + " | actual: " + MathUtil.getFactorial(3));

        //Test case #5: test getFactorial() with n = 5;
        System.out.println("Test 5! | expected: 120"
                + " | actual: " + MathUtil.getFactorial(5));
    }

    public static void testFactorialGivenWrongArgumentThrowsException() {
        //Test case #6: test getFactorial() with n < 0
        //Expected value: an Illegal Argument Exception is thrown

        System.out.println("Test -5! | expected: Illegal Argument Exception is thrown!!!"
                + " | actual: ???");
        MathUtil.getFactorial(-5);

    }
    
}
