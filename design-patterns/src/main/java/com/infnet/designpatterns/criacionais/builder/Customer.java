package com.infnet.designpatterns.criacionais.builder;

public class Customer {

    private String name;
    private boolean vip;

    public Customer() {
    }

    public Customer(String name, boolean vip) {
        this.name = name;
        this.vip = vip;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }
}
