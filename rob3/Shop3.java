package lab.rob3;

import lab.rob2.Shop2;

public class Shop3 {

    public Shop2 shop2;

    public Shop3(Shop2 shop2) {
        this.shop2 = shop2;
    }

    private int sectionInShop() {
        return shop2.shop.sectionShop();
    }

    private void info() {
        shop2.shop.info();
    }

    private void temp() {
        shop2.temp();
    }

    public void getTemp() {
        temp();
    }

    public void getInfo() {
        info();
    }

    public int getSectionInShop() {
        return sectionInShop();
    }
}
