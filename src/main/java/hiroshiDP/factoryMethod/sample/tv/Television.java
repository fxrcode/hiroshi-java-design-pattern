package hiroshiDP.factoryMethod.sample.tv;

import hiroshiDP.factoryMethod.sample.framework.Product;

public class Television extends Product {
    private String brand;
    Television(String brand) {
        System.out.println("Made by " + brand + " for TV");
        this.brand = brand;
    }
    @Override
    public void use() {
        System.out.println("Used by " + brand + " for TV");
    }

    public String getBrand() {
        return brand;
    }
}
