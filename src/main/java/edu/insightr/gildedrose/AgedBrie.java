package edu.insightr.gildedrose;

public class AgedBrie extends Item implements IVisitable {

    public AgedBrie(){
        super();
    }

    public AgedBrie(String name, int sellIn, int quality){
        super();
        this.setName(name);
        this.setSellIn(sellIn);
        this.setQuality(quality);
    }

    @Override
    public void accept(IVisitor v) {

    }
}
