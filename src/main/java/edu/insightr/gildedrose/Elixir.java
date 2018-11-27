package edu.insightr.gildedrose;

public class Elixir extends Item implements IVisitable{
    public Elixir(){
        super();
    }

    public Elixir(String name, int sellIn, int quality){
        super();
        this.setName(name);
        this.setSellIn(sellIn);
        this.setQuality(quality);
    }

    @Override
    public void accept(IVisitor v) {

    }
}
