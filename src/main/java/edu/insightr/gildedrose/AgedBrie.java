package edu.insightr.gildedrose;

public class AgedBrie extends Item implements Strategy {

    public AgedBrie() {
        super();
    }

    public AgedBrie(String name, int sellIn, int quality) {
        super(name, sellIn, quality);

    }

    public void update(Item item) {
        if (item.getQuality() >= 0 && item.getQuality() < 50) {
            item.setQuality(item.getQuality() + 1);
        }

        if (item.getQuality() < 0) {
            item.setQuality(0);
        }

        if (item.getQuality() > 50) {
            item.setQuality(50);
        }
    }
}


