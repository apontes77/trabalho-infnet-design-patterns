package com.infnet.designpatterns.estruturais.decorator;

public class BasicCar implements Car{
    @Override
    public void assemble() {
        System.out.println("basic car!");
    }
}
