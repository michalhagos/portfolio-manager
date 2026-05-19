package com.pluralsight.finance;

public class Gold extends FixedAsset{

    private double weight;
    // passes name and marketValue up to FixedAsset using super
    public Gold(String name, double marketValue, double weight) {
        super(name, marketValue);
        this.weight = weight;
    }
}
