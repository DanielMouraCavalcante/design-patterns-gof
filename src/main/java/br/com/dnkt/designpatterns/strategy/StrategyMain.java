package br.com.dnkt.designpatterns.strategy;

public class StrategyMain {

    public static void main(String[] args) {

        Product product1 = new Product("Game", 100.0);
        Product product2 = new Product("Smartphone", 1000.0);
        Product product3 = new Product("IPad", 2000.0);
        Product product4 = new Product("MacBook", 15000.0);

        Order order = new Order();
        order.addProduct(product1);
        order.addProduct(product2);
        order.addProduct(product3);
        order.addProduct(product4);

        order.calculateTotalPrice(new AmericanTax());
        order.calculateTotalPrice(new ArgentineTax());
        order.calculateTotalPrice(new BrazilianTax());
    }
}
