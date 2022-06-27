package com.infnet.designpatterns.comportamentais.observer;

public class Demo {
    public static void main(String[] args) {
        Subject subject = new Subject();

        new StringObserver(subject);
        new OctalObserver(subject);

        System.out.println("state change: 45");
        subject.setState(45);
        System.out.println("state change: 150");
        subject.setState(150);
    }
}
