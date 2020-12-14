package br.com.dnkt.designpatterns.adapter.interfaces;

import br.com.dnkt.designpatterns.adapter.model.Volt;

public interface SocketAdapter {

    Volt get120Volts();

    Volt get12Volts();

    Volt get3Volts();

    Volt get1Volt();
}
