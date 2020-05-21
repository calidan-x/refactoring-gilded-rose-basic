package cn.xpbootcamp.gilded_rose;

class GildedRose {
    Product[] items;

    public GildedRose(Product[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            items[i].updateQuality();
        }
    }
}
