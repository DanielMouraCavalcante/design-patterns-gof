package br.com.dnkt.designpatterns.observer.model;

import br.com.dnkt.designpatterns.observer.interfaces.Observer;
import br.com.dnkt.designpatterns.observer.interfaces.Subject;
import br.com.dnkt.designpatterns.util.Assert;

import java.util.ArrayList;
import java.util.List;

public class NotificationTopic implements Subject {

    private List<Observer> observers;
    private String message;

    public NotificationTopic() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void register(Observer observer) {
        Assert.notNull(observer, "Observer cannot be null");
        if (!observers.contains(observer))
            observers.add(observer);

    }

    @Override
    public void unregister(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
             observer.update();
        }
    }

    @Override
    public Object getUpdate(Observer observer) {
        return this.message;
    }

    public void postMessage(String msg) {
        System.out.println("Message posted to [" + this.getClass().getName() + "] : " + msg);
        this.message = msg;
        notifyObservers();
    }
}
