package com.operators;

import com.BinExpression;
import com.Expression;
import com.UniExpression;

/**
 * Created by shantaram on 1/3/17.
 */
public class Sin extends UniExpression {

    public Sin(Expression elem) {
        super(elem);
    }

    @Override
    public double eval(double eval) {
        return Math.round(Math.sin(eval));

    }
}
