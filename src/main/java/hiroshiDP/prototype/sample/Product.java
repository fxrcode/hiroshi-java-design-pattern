package hiroshiDP.prototype.sample;

public interface Product extends Cloneable {
    void use(String s);

    Product createClone();
}
