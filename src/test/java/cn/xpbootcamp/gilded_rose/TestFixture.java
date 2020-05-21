package cn.xpbootcamp.gilded_rose;

class TestFixture {
    String name;
    int sellIn;
    int quality;
    int updatedSellIn;
    int updatedQuality;

    private TestFixture(String name, int sellIn, int quality, int updatedSellIn, int updatedQuality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
        this.updatedSellIn = updatedSellIn;
        this.updatedQuality = updatedQuality;
    }

    public static TestFixture createRegular(String name, int sellIn, int quality, int updatedSellIn,
            int updatedQuality) {
        return new TestFixture(name, sellIn, quality, updatedSellIn, updatedQuality);
    }

    public static TestFixture createAgedBrie(int sellIn, int quality, int updatedSellIn, int updatedQuality) {
        return new TestFixture("Aged Brie", sellIn, quality, updatedSellIn, updatedQuality);
    }

    public static TestFixture createSulfuras(int sellIn, int quality, int updatedSellIn, int updatedQuality) {
        return new TestFixture("Sulfuras, Hand of Ragnaros", sellIn, quality, updatedSellIn, updatedQuality);
    }

    public static TestFixture createBackstagePass(int sellIn, int quality, int updatedSellIn, int updatedQuality) {
        return new TestFixture("Backstage passes to a TAFKAL80ETC concert", sellIn, quality, updatedSellIn,
                updatedQuality);
    }
}