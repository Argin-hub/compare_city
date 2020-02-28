package com.ucheba_one;

import java.util.Comparator;
import java.util.TreeSet;

public class Fabrika {


public static TreeSet<CityPart> getCity() {
    Comparator<CityPart> proba = new ComparatorCityPart().thenComparing(new CompCityPartAge());
    CityPart centr = new CityPart("Centr", 19,23);
    CityPart maken = new CityPart("Maken", 22,19);
    CityPart prihan = new CityPart("Prihan", 17,14);
    TreeSet<CityPart> col = new TreeSet<>(proba);
        col.add(centr);
        col.add(maken);
        col.add(prihan);
return col;
}
}
