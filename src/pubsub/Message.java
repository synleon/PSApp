package pubsub;

public class Message {
    private String topic;
    private String payload;

    public Message() {}
    public Message(String topic, String payload) {
        this.topic = topic;
        this.payload = payload;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public void setPayload(String payload) {
        this.payload = payload;
    }

    public String getTopic() {
        return topic;
    }

    public String getPayload() {
        return payload;
    }
}
