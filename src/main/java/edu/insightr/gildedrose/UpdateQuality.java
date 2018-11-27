package edu.insightr.gildedrose;

public class UpdateQuality implements IVisitor {


    public void visit(AgedBrie item) {
        if (item.getQuality() >= 0 && item.getQuality() < 50) {
            item.setQuality(item.getQuality() + 1);
        }

        corrector(item);
    }

    public void visit(Backstage item) {
        if (item.getSellIn() < 0) {
            item.setQuality(0);
        } else {
            if (item.getSellIn() <= 10) {

                if (item.getSellIn() <= 5) {
                    item.setQuality(item.getQuality() + 3);
                } else {
                    item.setQuality(item.getQuality() + 2);
                }
            } else {
                item.setQuality(item.getQuality() + 1);
            }
        }

        corrector(item);
    }

    public void visit(Conjured item) {
        if (item.getSellIn() < 0) {
            item.setQuality(item.getQuality() - 4);
        } else {
            item.setQuality(item.getQuality() - 2);
        }

        corrector(item);
    }

    public void visit(Elixir item) {
        if (item.getSellIn() < 0) {
            item.setQuality(item.getQuality() - 2);
        } else {
            item.setQuality(item.getQuality() - 1);
        }
    }

    public void visit(Sulfuras item) {
        item.setQuality(80);
    }

    public void visit(Vest item) {
        if (item.getSellIn() < 0) {
            item.setQuality(item.getQuality() - 4);
        } else {
            item.setQuality(item.getQuality() - 2);
        }
    }

    private void corrector(Item item) {
        if (item.getQuality() < 0) {
            item.setQuality(0);
        }

        if (item.getQuality() > 50) {
            item.setQuality(50);
        }
    }

}


