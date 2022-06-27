package com.infnet.designpatterns.comportamentais.strategy;

public class OperationSubtract implements Strategy{
    @Override
    public int doOperation(int number1, int number2) {
        return number1-number2;
    }
}
