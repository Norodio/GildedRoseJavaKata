package edu.insightr.gildedrose;

public class Sulfuras extends Item implements IVisitable{
    public Sulfuras(){
        super();
    }

    public Sulfuras(String name, int sellIn, int quality){
        super();
        this.setName(name);
        this.setSellIn(sellIn);
        this.setQuality(quality);
    }

    @Override
    public void accept(IVisitor v) {

    }
}
