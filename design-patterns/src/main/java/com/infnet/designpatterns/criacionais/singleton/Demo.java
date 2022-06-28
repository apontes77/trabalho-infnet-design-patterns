package com.infnet.designpatterns.criacionais.singleton;

public class Demo {
    public static void main(String[] args) {
        ClassSingleton classSingleton1 = ClassSingleton.getInstance();

        System.out.println(classSingleton1.getInfo());

        ClassSingleton classSingleton2 = ClassSingleton.getInstance();
        classSingleton2.setInfo("New class info");

        System.out.println(classSingleton1.getInfo());
        System.out.println(classSingleton2.getInfo());
    }
}
