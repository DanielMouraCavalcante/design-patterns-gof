package br.com.dnkt.designpatterns.bridge;

public class Make implements WorkShop {

    @Override
    public void make() {
        System.out.println("Making...");
    }
}
