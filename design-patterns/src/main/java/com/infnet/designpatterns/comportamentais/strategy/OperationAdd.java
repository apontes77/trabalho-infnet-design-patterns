package com.infnet.designpatterns.comportamentais.strategy;

public class OperationAdd implements Strategy{
    @Override
    public int doOperation(int number1, int number2) {
        return number1+number2;
    }
}
