package hiroshiDP.factoryMethod.sample.idcard;

import hiroshiDP.factoryMethod.sample.framework.Factory;
import hiroshiDP.factoryMethod.sample.framework.Product;

import java.util.ArrayList;
import java.util.List;

public class IDCardFactory extends Factory {
    private List<String> owners = new ArrayList<>();
    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    protected void registerProduct(Product product) {
        owners.add( ((IDCard)product).getOwner() );
    }

    public List<String> getOwners() {
        return owners;
    }
}
