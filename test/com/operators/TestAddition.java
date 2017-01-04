package com.operators;

import com.Number;
import junit.framework.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by shantaram on 1/4/17.
 */
public class TestAddition {

    @Test
    public void testPositive(){
        assertEquals(30.0, (new Addition(new Number(10),new Number(20))).eval(),0);
    }

    @Test
    public void testNegative(){
        assertEquals(-10.0,(new Addition(new Number(10),new Number(-20))).eval(),0);
    }
}
