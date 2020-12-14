package br.com.dnkt.designpatterns.adapter.model;

public class Socket {

    public Volt getVolt() {
        return new Volt(120);
    }
}
