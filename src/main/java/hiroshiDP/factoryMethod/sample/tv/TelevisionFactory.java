package hiroshiDP.factoryMethod.sample.tv;

import hiroshiDP.factoryMethod.sample.framework.Factory;
import hiroshiDP.factoryMethod.sample.framework.Product;

import java.util.ArrayList;
import java.util.List;

public class TelevisionFactory extends Factory {
    private List<String> brands = new ArrayList<>();

    @Override
    protected Product createProduct(String brand) {
        return new Television(brand);
    }

    @Override
    protected void registerProduct(Product product) {
        brands.add(((Television)product).getBrand());
    }

    public List<String> getBrands() {
        return brands;
    }
}
