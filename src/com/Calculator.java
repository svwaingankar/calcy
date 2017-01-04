package com;

import com.operators.Addition;

/**
 * Created by shantaram on 1/3/17.
 */
public class Calculator {

    public double calculate(String input){

        Expression expr = tokenize(input);
        return expr.eval();

    }

    public Expression tokenize(String input) {

        //logic to token string into an expression
        //eg 10+2 => return new Addition(new Number(10),new Number(2))
        //eg (10+sin 45)*3 => return new Multiplication(new Addition(new Number(10), new Sin(45)),new Number(3))

        return new Addition(new Number(10),new Number(2));
    }


}
