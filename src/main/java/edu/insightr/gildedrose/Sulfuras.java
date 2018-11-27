package edu.insightr.gildedrose;

public class Sulfuras extends Item implements Strategy {

    public Sulfuras() {
        super();
    }

    public Sulfuras(String name, int sellIn, int quality) {
        super(name, sellIn, quality);

    }

    public void update(Item item) {
        item.setQuality(80);
    }
}
