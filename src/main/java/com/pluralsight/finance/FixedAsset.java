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

    public String getName() {
        return name;
    }

    public double getMarketValue() {
        return marketValue;
    }

    // Used set method to update the value when market prices change
    public void setMarketValue(double marketValue) {
        this.marketValue = marketValue;
    }

    // returns the market Value it is overriding the method
    @Override
    public double getValue() {
        return marketValue;
    }


}
