package cn.xpbootcamp.gilded_rose;

public class Product {

    public String name;

    public int sellIn;

    public int quality;

    public int MAX_QUALITY = 50;
    public int MIN_QUALITY = 0;

    public Product(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    @Override
    public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }

    public void updateAgedBrieQuality() {
        this.quality = this.quality + 1;
        if (this.sellIn <= 0) {
            this.quality = this.quality + 1;
        }
    }

    public void updateBackstagePassQuality() {
        this.quality = this.quality + 1;

        if (this.sellIn < 11) {
            this.quality = this.quality + 1;
        }

        if (this.sellIn < 6) {
            this.quality = this.quality + 1;
        }

        if (this.sellIn <= 0) {
            this.quality = 0;
        }
    }

    public void updateNormalProductQuality() {
        this.quality = this.quality - 1;
        if (this.sellIn <= 0) {
            this.quality = this.quality - 1;
        }
    }

    public void updateQuality() {

        if (this.name.equals("Aged Brie")) {
            updateAgedBrieQuality();
        } else if (this.name.equals("Sulfuras, Hand of Ragnaros")) {
        } else if (this.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
            updateBackstagePassQuality();
        } else {
            updateNormalProductQuality();
        }

        if (!this.name.equals("Sulfuras, Hand of Ragnaros")) {
            this.sellIn = this.sellIn - 1;
        }

        if (this.quality > MAX_QUALITY) {
            this.quality = MAX_QUALITY;
        }

        if (this.quality < MIN_QUALITY) {
            this.quality = MIN_QUALITY;
        }

    }
}
