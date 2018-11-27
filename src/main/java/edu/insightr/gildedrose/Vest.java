package edu.insightr.gildedrose;

public class Vest extends Item implements IVisitable{
    public Vest(){
        super();
    }

    public Vest(String name, int sellIn, int quality){
        super();
        this.setName(name);
        this.setSellIn(sellIn);
        this.setQuality(quality);
    }

    @Override
    public void accept(IVisitor v) {

    }
}
