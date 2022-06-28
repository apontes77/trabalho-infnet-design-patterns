package com.infnet.designpatterns.criacionais.builder;

public class ValidOrderSaleBuilder {
    private SaleOrder instance;

    public ValidOrderSaleBuilder(SaleOrder instance) {
        this.instance = instance;
    }

    public SaleOrder build() {
        return this.instance;
    }
}
