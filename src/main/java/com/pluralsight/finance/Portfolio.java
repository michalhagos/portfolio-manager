package com.pluralsight.finance;

import java.util.ArrayList;

public class Portfolio {

    // a list that holds all the valuable assets in this portfolio
    private ArrayList<Valuable> assets;
    // constructor initializes the empty assets list
    public Portfolio() {
        this.assets = new ArrayList<>();
    }

    // adds a new asset to the portfolio
// this means because the list holds Valuable you can add any type of asset

    public void addAsset(Valuable asset) {
        this.assets.add(asset);
    }

    // returns the total net value of all assets in the portfolio
// loops through every asset and adds up all the values
// credit cards will reduce the total because getValue() returns negative for them
    public double getValue() {
        double totalValue = 0;
        for (Valuable asset : assets) {
            totalValue += asset.getValue();
        }
        return totalValue;
    }

    // this method returns the asset with the highest value in the portfolio
    public Valuable getMostValuable() {

        // starting by assuming the first asset is the most valuable
        Valuable mostValuable = assets.get(0);

        // go through every asset in the list using for each loop
        for (Valuable currentAsset : assets) {

            // is this asset worth more than what we have so far?
            if (currentAsset.getValue() > mostValuable.getValue()) {

                // yes it is so update our answer
                mostValuable = currentAsset;
            }
        }

        // here need to return whatever ended up being the most valuable
        return mostValuable;
    }


}
