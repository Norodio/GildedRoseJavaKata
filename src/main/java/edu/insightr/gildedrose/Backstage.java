package edu.insightr.gildedrose;

public class Backstage extends Item implements IVisitable{
    public Backstage(){
        super();
    }

    public Backstage(String name, int sellIn, int quality){
        super();
        this.setName(name);
        this.setSellIn(sellIn);
        this.setQuality(quality);
    }

    @Override
    public void accept(IVisitor v) {

    }
}
