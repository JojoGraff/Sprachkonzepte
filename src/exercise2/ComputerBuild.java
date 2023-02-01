package exercise2;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.util.ArrayList;
import java.util.Stack;

public class ComputerBuild extends computerGrammarBaseListener {


    //private Stack<Computer> computerStack = new Stack<>();
    private Computer computer;
    private Stack<String> priceStack = new Stack<>();
    ArrayList<Part> parts = new ArrayList<>();


    public Computer build(ParseTree tree) {
        new ParseTreeWalker().walk(this,tree);
        return computer;
    }


/*    @Override
    public void exitStart(computerGrammar.StartContext ctx) {
        String price = priceStack.pop();
        this.computer = new Computer(parts,price);
    }*/
    @Override
    public void exitComputer(computerGrammar.ComputerContext ctx) {
        //Part part = partStack.pop();
        //Price price = priceStack.pop();
        //this.parts.add(part);
        //this.computer.adjustPrice(price);
        //Price price = priceStack.pop();
        //this.computerStack.push(new Computer(part,price));
        String price = priceStack.pop();
        this.computer = new Computer(parts,price);

    }
    @Override
    public void exitParts(computerGrammar.PartsContext ctx) {
        String type = ctx.PART().getText();
        String producer = ctx.PRODUCER().getText();
        String price = ctx.price().getText();
        //this.partStack.push(new Part(type,producer,new Price(1,"$")));
        this.parts.add(new Part(type,producer,price));
    }

    @Override
    public void exitPrice(computerGrammar.PriceContext ctx) {
        String price = ctx.PRICE().getText() + "$";
        this.priceStack.push(price);
    }






}
