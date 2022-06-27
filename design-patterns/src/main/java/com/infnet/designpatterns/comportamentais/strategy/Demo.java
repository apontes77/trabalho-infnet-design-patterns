package com.infnet.designpatterns.comportamentais.strategy;

public class Demo {
    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());

        System.out.println("executando a soma: "+context.executeStrategy(10, 5));

        context = new Context(new OperationMultiply());

        System.out.println("executando a multiplicacao: "+context.executeStrategy(10, 5));

    }

}
