package hiroshiDP.factoryMethod.sample;

import hiroshiDP.factoryMethod.sample.framework.Factory;
import hiroshiDP.factoryMethod.sample.framework.Product;
import hiroshiDP.factoryMethod.sample.idcard.IDCardFactory;
import hiroshiDP.factoryMethod.sample.tv.TelevisionFactory;

public class Main {
    public static void main(String[] args) {
        Factory cardFactory = new IDCardFactory();
        Product card1 = cardFactory.create("Alice");
        Product card2 = cardFactory.create("Bobby");
        Product card3 = cardFactory.create("Chris");
        card1.use();
        card2.use();
        card3.use();

        Factory tvFactory = new TelevisionFactory();
        tvFactory.create("Sony").use();
        tvFactory.create("Samsung").use();
    }
}
