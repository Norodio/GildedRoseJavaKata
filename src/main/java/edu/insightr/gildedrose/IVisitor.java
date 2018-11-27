package edu.insightr.gildedrose;

public interface IVisitor {

    public void visit( Elixir elixir);
    public void visit( Sulfuras sulfuras );
    public void visit( Conjured conjured);
    public void visit(AgedBrie agedBrie);
    public void visit(Backstage backstage);
    public void visit(Vest dexterity);


}