package br.com.dnkt.designpatterns.observer;

import br.com.dnkt.designpatterns.observer.interfaces.Observer;
import br.com.dnkt.designpatterns.observer.model.NotificationTopic;
import br.com.dnkt.designpatterns.observer.model.NotificationTopicSubscriber;

public class ObserverMain {

    public static void main(String[] args) {
        NotificationTopic topic = new NotificationTopic();

        //create observers
        Observer firstObserver = new NotificationTopicSubscriber("FirstObserver");

        Observer secondObserver = new NotificationTopicSubscriber("secondObserver");

        Observer thirdObserver = new NotificationTopicSubscriber("thirdObserver");

        //Register them...
        topic.register(firstObserver);
        topic.register(secondObserver);
        topic.register(thirdObserver);

        // Attaching observer to subject
        firstObserver.setSubject(topic);
        secondObserver.setSubject(topic);
        thirdObserver.setSubject(topic);


        //Check for updates
        firstObserver.update();
        thirdObserver.update();


        //Provider/ Subject ( broadcaster)
        topic.postMessage("Hello Subscribers!");

        topic.unregister(firstObserver);

        topic.postMessage("Hello Subscribers!");
    }
}
