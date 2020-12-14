package br.com.dnkt.designpatterns.observer.interfaces;

public interface Observer {

    void update();

    void setSubject(Subject subject);
}
