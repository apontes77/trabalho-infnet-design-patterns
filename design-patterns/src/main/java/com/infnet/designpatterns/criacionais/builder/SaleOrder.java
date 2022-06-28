package com.infnet.designpatterns.criacionais.builder;

import java.math.BigDecimal;
import java.util.List;

public class SaleOrder {
    private String number;
    private Customer customer;
    private List<OrderItem> items;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public void setItems(List<OrderItem> items) {
        this.items = items;
    }

    public BigDecimal getTotalValue() {
        BigDecimal total = BigDecimal.ZERO;
        for (OrderItem item: items) {
            total = total.add(item.getUnitValue().multiply(new BigDecimal(item.getQuantity())));
        }

        if (customer.isVip()) {
            total = total.multiply(new BigDecimal("0.96"));
        }

        return total;
    }
}
