package com;

/**
 * Created by shantaram on 1/3/17.
 */
public abstract class BinExpression implements Expression {

    Expression one;
    Expression two;

    public BinExpression(Expression one, Expression two) {
        this.one = one;
        this.two = two;
    }

    @Override
    public double eval() {
        return eval(one.eval(),two.eval());
    }

    public abstract double eval(double eval, double eval1);

    public Expression getOne() {
        return one;
    }

    public void setOne(Expression one) {
        this.one = one;
    }

    public Expression getTwo() {
        return two;
    }

    public void setTwo(Expression two) {
        this.two = two;
    }
}
