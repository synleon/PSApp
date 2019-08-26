package pubsub.publisher;

import pubsub.Message;
import pubsub.service.PubSubService;

public class PublisherImpl implements Publisher {

    @java.lang.Override
    public void publish(Message message, PubSubService pubSubService) {
        pubSubService.addMessageToQueue(message);
    }
}
