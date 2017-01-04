package com.operators;

import com.Calculator;
import com.Expression;
import com.Number;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by shantaram on 1/4/17.
 */
public class TestCalculator {

    @Test
    public void testSimpleAddTokenize()

    {
        Expression exp = new Calculator().tokenize("10+20");
        assertEquals(Addition.class,exp.getClass());
        assertEquals(Number.class,((Addition)exp).getOne().getClass());
        assertEquals(Number.class,((Addition)exp).getTwo().getClass());

        Number num1 = (Number)((Addition)exp).getOne();
        Number num2 = (Number)((Addition)exp).getTwo();
        assertEquals(10, num1.eval(),0);
        assertEquals(2, num2.eval(),0);
    }

}
