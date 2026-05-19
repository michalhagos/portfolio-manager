package com.pluralsight.finance;

public class Jewelry extends FixedAsset {
    // example of karat like 24, 18
    private double karat;

    // Passes name and marketValue from FixedAsset class
    public Jewelry(String name, double marketValue, double karat) {
        // using super to use the parent class constructor
        super(name, marketValue);
        this.karat = karat;
    }
    // Add getKarat getter to Jewelry
    public double getKarat() { return karat; }

}
