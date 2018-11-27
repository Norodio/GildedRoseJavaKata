package edu.insightr.gildedrose;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class InventoryTest {

    protected Inventory inv; //Toujours créer une instance de la classe à tester
    protected Item[] oldList;

    @Before
    public void setUp() {
        inv = new Inventory();
        oldList = inv.getItems(); //On définit l'ancienne liste ici, car c'est un préalable au test
    }

    @Test
    public void testUpdateQualityWhenSellInFinished() throws Exception {
        inv.updateQuality(); //Méthode qui update la qualité

        for (int i = 0; i < inv.getItems().length; i++) {
            if (oldList[i].getSellIn() == 0) {
                if (oldList[i].getName().matches(".*Sulfuras.*"))
                    assertEquals(80, inv.getItems()[i].getQuality());
                else
                    assertEquals(oldList[i].getQuality() - 2, inv.getItems()[i].getQuality());
            }
        }
    }

    @Test
    public void testUpdateQualityAgedBrie() throws Exception {
        inv.updateQuality();
        for(int i =0; i < inv.getItems().length; i++){
            if(inv.getItems()[i].getName().contains("Aged Brie")){
                assertFalse(oldList[i].getQuality() > inv.getItems()[i].getQuality());
            }
        }
    }

    @Test
    public void testUpdateQualityBackstagePasses() throws Exception {
        inv.updateQuality();
        for(int i =0; i < inv.getItems().length; i++){
            if(inv.getItems()[i].getName().contains("Backstage Passes")){
                if (inv.getItems()[i].getSellIn() < 0){
                    assertEquals(0, inv.getItems()[i].getQuality());
                }else if(inv.getItems()[i].getSellIn() <= 5){
                    assertEquals(oldList[i].getQuality() + 2, inv.getItems()[i].getQuality());
                }else if(inv.getItems()[i].getSellIn() <= 10){
                    assertEquals(oldList[i].getQuality() + 3, inv.getItems()[i].getQuality());
                }
            }
        }
    }

    @Test
    public void testConjuredItemQualityUpdate() throws Exception{
            inv.updateQuality();
        for(int i =0; i < inv.getItems().length; i++){
            if(inv.getItems()[i].getName().contains("Conjured")){
                if(oldList[i].getSellIn() <=0)
                {
                    assertEquals(oldList[i].getQuality()-4, inv.getItems()[i].getQuality());
                }else {
                    assertEquals(oldList[i].getQuality(), inv.getItems()[i].getQuality());
                }
            }
        }
    }


    @Test
    public void main() {
    }
}