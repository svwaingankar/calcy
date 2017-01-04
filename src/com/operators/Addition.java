package com.operators;

import com.BinExpression;
import com.Expression;

/**
 * Created by shantaram on 1/3/17.
 */
public class Addition extends BinExpression {

    public Addition(Expression one, Expression two) {
        super(one, two);
    }

    @Override
    public double eval(double one, double two) {
        return one+two;
    }
}
