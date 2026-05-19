package com.pluralsight.finance;

// making it abstract because there will be no need to create an object from it
public abstract class FixedAsset implements Valuable {
    // name of the asset
    private String name;
    // current market value in dollars
    private double marketValue;

    public FixedAsset(String name, double marketValue) {
        this.name = name;
        this.marketValue = marketValue;
    }

    // returns the name of the asset
    public String getName() {
        return name;
    }

    // updates the name of the asset
    public void setName(String name) {
        this.name = name;
    }

    // returns the market value of the asset
    public double getMarketValue() {
        return marketValue;
    }

    // updates the market value of the asset
    public void setMarketValue(double marketValue) {
        this.marketValue = marketValue;
    }

    // returns the market value as the value of this asset. it is overriding the method
    @Override
    public double getValue() {
        return marketValue;
    }


}
