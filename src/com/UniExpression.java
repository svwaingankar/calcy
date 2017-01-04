package com;

/**
 * Created by shantaram on 1/3/17.
 */
public abstract class UniExpression implements Expression {

    Expression elem;

    public UniExpression(Expression elem) {
        this.elem = elem;
    }

    @Override
    public double eval() {
        return eval(elem.eval());
    }

    public abstract double eval(double eval);

    public Expression getElem() {
        return elem;
    }

    public void setElem(Expression elem) {
        this.elem = elem;
    }
}
