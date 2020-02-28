package com.ucheba_one;

import java.util.Comparator;

public class CompCityPartAge implements Comparator<CityPart> {
    @Override
    public int compare(CityPart o1, CityPart o2) {
        return o1.getSizeKlmtr().compareTo(o2.getSizeKlmtr());
    }
}
