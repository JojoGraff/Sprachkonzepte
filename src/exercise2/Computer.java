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

    public String dynamicSemantic() {
        int price = partList.stream().mapToInt(o -> Integer.parseInt(o.getPrice().replace("$",""))).sum();
        if(price >= Integer.parseInt(this.price.substring(0,this.price.length()-1))) {
            return  "Good Deal! The parts alone cost: " + price;
        }
        else {
            return  "Bad Deal! The parts alone cost: " + price + "$";
        }
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
