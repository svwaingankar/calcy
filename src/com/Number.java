package com;

/**
 * Created by shantaram on 1/3/17.
 */
public class Number implements Expression {

    double num;

    public Number(double num) {
        this.num=num;
    }

    @Override
    public double eval() {
        return num;
    }
}
