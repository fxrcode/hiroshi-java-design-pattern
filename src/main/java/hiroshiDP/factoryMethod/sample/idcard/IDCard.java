package hiroshiDP.factoryMethod.sample.idcard;

import hiroshiDP.factoryMethod.sample.framework.Product;

public class IDCard extends Product {
    private String owner;
    IDCard(String owner) {
        System.out.println("Made by " + owner + " for IDCard");
        this.owner = owner;
    }
    @Override
    public void use() {
        System.out.println("Used by " + owner + " for IDCard");
    }

    public String getOwner() {
        return owner;
    }
}
