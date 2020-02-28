package com.ucheba_one;

public class CityPart {
    private   String name;
    private Integer countStreet;
    private Integer sizeKlmtr;

    public String getName() {
        return name;
    }

    public Integer getCountStreet() {
        return countStreet;
    }

    public Integer getSizeKlmtr() {
        return sizeKlmtr;
    }

    public CityPart(String name, Integer countStreet, Integer sizeKlmtr) {
        this.name = name;
        this.countStreet = countStreet;
        this.sizeKlmtr = sizeKlmtr;
    }

    public CityPart() {

    }

    @Override
    public String toString() {
        return name +" " +countStreet+" " + sizeKlmtr;
    }
}
