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
}
