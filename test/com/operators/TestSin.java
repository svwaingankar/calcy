package com.operators;

import com.Number;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by shantaram on 1/4/17.
 */
public class TestSin {

    @Test
    public void testPositive(){
        assertEquals(1.0, (new Sin(new Number(1.55))).eval(),0);
    }

    @Test
    public void testNegative(){
        assertEquals(0.0,(new Sin(new Number(3.14))).eval(),0);
    }
}
