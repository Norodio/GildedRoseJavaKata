package edu.insightr.gildedrose;

public  class UpdateQuality implements IVisitor{


    public void visit(AgedBrie item) {
        if (item.getQuality() > 0 && item.getQuality() < 50) {
            item.setQuality(item.getQuality() + 1);
        }

    }

    public void visit(Backstage item) {

    }

    public void visit(Conjured item) {

    }

    public void visit(Elixir item) {

    }

    public void visit(Sulfuras item) {

    }

    public void visit(Vest item) {

    }

}


