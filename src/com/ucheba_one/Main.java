package com.ucheba_one;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        District sorok5 = new District("45",19,8);
        District fity5 = new District("55",116,12);
        District dvadcat9 = new District("29",89,5);
        TreeSet <District> raion = new TreeSet<>();
        raion.add(sorok5);
        raion.add(fity5);
        raion.add(dvadcat9);

        for(District q:raion) System.out.println(q);


    }
}
