package com.ucheba_one;

import java.util.Comparator;

public class ComparatorCityPart implements Comparator <CityPart> {
    @Override
    public int compare(CityPart o1, CityPart o2) {
        return o1.getCountStreet().compareTo(o2.getCountStreet());
    }
}
