package edu.insightr.gildedrose;

public class Vest extends Item implements Strategy {

    public Vest() {
        super();
    }

    public Vest(String name, int sellIn, int quality) {
        super(name, sellIn, quality);

    }

    public void update(Item item) {
        if (item.getSellIn() < 0) {
            item.setQuality(item.getQuality() - 2);
        } else {
            item.setQuality(item.getQuality() - 1);
        }

        if (item.getQuality() < 0) {
            item.setQuality(0);
        }

        if (item.getQuality() > 50) {
            item.setQuality(50);
        }
    }
}
