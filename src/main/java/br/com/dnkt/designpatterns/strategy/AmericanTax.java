package br.com.dnkt.designpatterns.strategy;

public class AmericanTax implements Pricing {

    @Override
    public double calculatePrice(final double amount) {
        System.out.println("American Calculate Price: " + amount * 0.3);
        //do some stuff here ...
        return amount;
    }

}
