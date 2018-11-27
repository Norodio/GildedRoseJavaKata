package edu.insightr.gildedrose;

public class Backstage extends Item implements Strategy {

    public Backstage() {
        super();
    }

    public Backstage(String name, int sellIn, int quality) {
        super(name, sellIn, quality);

    }

    public void update(Item item) {
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
        if (item.getQuality() < 0) {
            item.setQuality(0);
        }

        if (item.getQuality() > 50) {
            item.setQuality(50);
        }
    }
}
