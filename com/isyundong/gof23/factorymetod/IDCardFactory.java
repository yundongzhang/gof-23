package com.isyundong.gof23.factorymetod;

import java.util.ArrayList;
import java.util.List;

public class IDCardFactory extends Factory {

    private final List<String> owners = new ArrayList<>();

    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    protected void registerProduct(Product product) {
        owners.add(((IDCard) product).getOwner());
    }

}
