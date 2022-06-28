package com.infnet.designpatterns.criacionais.builder;

import java.math.BigDecimal;
import java.util.ArrayList;

public class SaleOrderBuilder {
    private SaleOrder instance;

    public SaleOrderBuilder() {
        this.instance = new SaleOrder();
    }

    public SaleOrderBuilder withVipCustomer(String name) {
        defineCustomer(name, true);
        return this;
    }

    public SaleOrderBuilder withNormalCustomer(String name) {
        defineCustomer(name, false);
        return this;
    }

    public SaleOrderBuilder withItem(String name, Integer quantity, String unitValue) {
        OrderItem item = new OrderItem();
        item.setName(name);
        item.setQuantity(quantity);
        item.setUnitValue(new BigDecimal(unitValue));

        if (this.instance.getItems() == null) {
            this.instance.setItems(new ArrayList<OrderItem>());
        }

        this.instance.getItems().add(item);

        return this;
    }

    public ValidOrderSaleBuilder withNumber(String number) {
        this.instance.setNumber(number);
        return new ValidOrderSaleBuilder(instance);
    }

    private void defineCustomer(String name, boolean vip) {
        Customer customer = new Customer();
        customer.setName(name);
        customer.setVip(true);
        this.instance.setCustomer(customer);
    }
}
