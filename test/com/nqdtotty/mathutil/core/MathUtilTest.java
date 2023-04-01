/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.nqdtotty.mathutil.core;

//import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;
import org.junit.Assert;

/**
 *
 * @author NQDtotty
 */
public class MathUtilTest {
    
    // @Test is a flag - Annotation 
    
    @Test
    public void testFactorialGivenRightArgumentReturnsWell() {
         //Test case #1: test getFactorial() with n = 0;
        //expected: 1
        Assert.assertEquals(1, MathUtil.getFactorial(0));
        
        //Test case #2: test getFactorial() with n = 1;
        //expected: 1
        Assert.assertEquals(1, MathUtil.getFactorial(1));
    
        //Test case #3: test getFactorial() with n = 3
        //expected: 6
        Assert.assertEquals(6, MathUtil.getFactorial(3));
    }
    @Test
    public void testFactorialGivenRightArgumentReturnsWell2() {
        
        //Test case #4: test getFactorial() with n = 6
        //expected: 720
        Assert.assertEquals(720, MathUtil.getFactorial(6));
        
        //Test case #5: test getFactorial() with n = 8
        //expected: 40320
        Assert.assertEquals(40320, MathUtil.getFactorial(8));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testFactorialGivenWrongArgumentThrowsException() {
        // Test case 6: test getFactorial() with n < 0
        // expected: throw an IllegalArgumentException
        MathUtil.getFactorial(-5);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testFactorialGivenWrongArgumentThrowsException2() {
        // Test case 7: test getFactorial() with n > 20
        // expected: throw an IllegalArgumentException
        MathUtil.getFactorial(21);
    }
    
}
