package edu.insightr.gildedrose;

public class Backstage extends Item implements IVisitable{
    public Backstage(){
        super();
    }

    public Backstage(String name, int sellIn, int quality){
        super(name,sellIn,quality);

    }

    @Override
    public void accept(IVisitor v) {

    }
}
