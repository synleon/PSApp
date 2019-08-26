package pubsub.subscriber;

import pubsub.Message;
import pubsub.service.PubSubService;

import java.util.ArrayList;
import java.util.List;

public abstract class Subscriber {
    private List<Message> subscriberMessages = new ArrayList<Message>();

    public void setSubscriberMessages(List<Message> subscriberMessages) {
        this.subscriberMessages = subscriberMessages;
    }

    public List<Message> getSubscriberMessages() {
        return subscriberMessages;
    }

    public abstract void addSubscriber(String topic, PubSubService pubSubService);
    public abstract void unSubscriber(String topic, PubSubService pubSubService);
    public abstract void getMessagesForSubscriberOfTopic(String topic, PubSubService pubSubService);

    public void printMessages() {
        for (Message message:subscriberMessages) {
            System.out.println("Message Topic -> " + message.getTopic() + " : " + message.getPayload());
        }
    }
}
