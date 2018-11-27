package edu.insightr.gildedrose;

public class Conjured extends Item implements Strategy {

    public Conjured() {
        super();
    }

    public Conjured(String name, int sellIn, int quality) {
        super(name, sellIn, quality);

    }

    public void update(Item item) {
        if (item.getSellIn() < 0) {
            item.setQuality(item.getQuality() - 4);
        } else {
            item.setQuality(item.getQuality() - 2);
        }

        if (item.getQuality() < 0) {
            item.setQuality(0);
        }

        if (item.getQuality() > 50) {
            item.setQuality(50);
        }
    }
}
