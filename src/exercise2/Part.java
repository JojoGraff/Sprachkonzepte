package exercise2;

public final class Part {
    private final String type;
    private final String producer;
    private final String price;

    public Part(String type, String producer, String price) {
        this.type = type;
        this.producer = producer;
        this.price = price;
    }

    public String getType() {
        return this.type;
    }
    public String getProducer() {
        return this.producer;
    }
    public String getPrice() {
        return this.price;
    }
}
