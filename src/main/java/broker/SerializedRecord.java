package broker;


public class SerializedRecord {
    private String topicName;
    private byte[] key;
    private byte[] value;

    // inserts a byte array into the data_array
    public SerializedRecord(String topicName, byte[] key, byte[] value) {
        this.topicName = topicName;
        this.key = key;
        this.value = value;
    }

    public String getTopicName() {
        return topicName;
    }

    public byte[] getKey() {
        return key;
    }

    public byte[] getValue() {
        return value;
    }
}