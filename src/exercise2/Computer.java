package exercise2;

import java.util.ArrayList;
import java.util.List;

public class Computer {

    private final ArrayList<Part> partList;
    private final String price;

    public Computer(List<Part> part, String price) {
        partList = new ArrayList<>();
        this.partList.addAll(part);
        this.price = price;
    }


    @Override
    public String toString() {
        StringBuilder ret = new StringBuilder();
        for (Part part: this.partList) {
            ret.append("Type: ").append(part.getType()).append(" Producer: ").append(part.getProducer()).append(" Price: ").append(part.getPrice().toString()).append("\n");
        }
        ret.append("Total: ").append(price);
        return ret.toString();
    }
}
