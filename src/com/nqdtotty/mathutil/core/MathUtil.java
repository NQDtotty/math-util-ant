/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nqdtotty.mathutil.core;

/**
 *
 * @author NQDtotty
 */
public class MathUtil {

    // Method calculate factorial
    // n! = 1.2.3...n
    // Don't calculate factorial of negative number
    // 0! = 1! = 1
    // 21! is a big value, more than 18 zero digits, will make make memory overflow of long datatype
    // So don't calculate 21!
    public static long getFactorial(int n) {

        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid n. n must be between 0..20");
        }

        if (n == 1 || n == 0) {
            return 1;
        }

        long product = 1;
        for (int i = 2; i <= n; i++) {
            product *= i;
        }

        return product;
    }

}

// TDD: Test Driven Development
// 1. Write outline prototype of method/class
// 2. Write test cases, are extra code to check method/class have coded is run well or not
// 3. Run method/class with set of test case, to check pass or fail
// - Pass: Complete other code
// - Fail: Refactor, fix code
