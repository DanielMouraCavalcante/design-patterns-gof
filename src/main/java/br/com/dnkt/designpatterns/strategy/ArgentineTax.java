package br.com.dnkt.designpatterns.strategy;

public class ArgentineTax implements Pricing {

    @Override
    public double calculatePrice(final double amount) {
        System.out.println("Argentine Calculate Price: " + amount * 0.4);
        //do some stuff here ...
        return amount;
    }

}
