package br.com.dnkt.designpatterns.strategy;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private List<Product> productList;

    public Order() {
        this.productList = new ArrayList<>();
    }

    public void addProduct(Product product) {
        productList.add(product);
    }

    private double amountSum() {
        double sum = 0;
        for (Product product : productList) {
            sum += product.getPrice();
        }
        return sum;
    }

    public double calculateTotalPrice(Pricing pricing) {
        double amount = amountSum();
        return pricing.calculatePrice(amount);
    }

}
