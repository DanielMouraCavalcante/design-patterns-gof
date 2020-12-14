package br.com.dnkt.designpatterns.strategy;

public class BrazilianTax implements Pricing {

    @Override
    public double calculatePrice(final double amount) {
        System.out.println("Brazilian Calculate Price: " + amount * 0.5);
        //do some stuff here ...
        return amount * 4;
    }

}
