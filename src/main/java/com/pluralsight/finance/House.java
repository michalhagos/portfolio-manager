package com.pluralsight.finance;

public class House extends FixedAsset{


    // the year the house was built
    private int yearBuilt;
    // the size of the house in square feet
    private int squareFeet;
    // the number of bedrooms
    private int bedrooms;

    public House(String name, double marketValue, int yearBuilt, int squareFeet, int bedrooms) {
        super(name, marketValue);
        this.yearBuilt = yearBuilt;
        this.squareFeet = squareFeet;
        this.bedrooms = bedrooms;
    }
    public int getYearBuilt() {
        return yearBuilt;
    }

    public void setYearBuilt(int yearBuilt) {
        this.yearBuilt = yearBuilt;
    }

    public int getSquareFeet() {
        return squareFeet;
    }

    public void setSquareFeet(int squareFeet) {
        this.squareFeet = squareFeet;
    }

    public int getBedrooms() {
        return bedrooms;
    }

    public void setBedrooms(int bedrooms) {
        this.bedrooms = bedrooms;
    }
// house loses $1000 in value for every year it has been around
    @Override
    public double getValue() {
        int age = 2026 - yearBuilt;
        double depreciation = age * 1000;
        return getMarketValue() - depreciation;
    }



}
