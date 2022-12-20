package by.task.backendtest.store.receipt;

import by.task.backendtest.store.product.Goods;

public class Item implements Goods {
    private final double amount;
    private final Goods wrappedProduct;
    private final double cost;

    public Item(Goods wrappedProduct, int amount) {
        this.wrappedProduct = wrappedProduct;
        this.amount = amount;
        this.cost = this.amount * this.getPrice();
    }

    public double getAmount() {
        return amount;
    }

    public double getCost() {
        return cost;
    }

    @Override
    public int getId() {
        return wrappedProduct.getId();
    }

    @Override
    public String getName() {
        return wrappedProduct.getName();
    }

    @Override
    public double getPrice() {
        return wrappedProduct.getPrice();
    }

    @Override
    public boolean isPromotional() {
        return wrappedProduct.isPromotional();
    }

    @Override
    public String getUnit() {
        return wrappedProduct.getUnit();
    }
}
