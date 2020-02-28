package com.ucheba_one;

public class District implements Comparable<District> {
  private   String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Integer getCountStreet() {
        return countStreet;
    }

    private Integer countStreet;

public District(String name, Integer age, Integer countStreet){
    this.name = name;
    this.age = age;
    this.countStreet = countStreet;
}



    @Override
    public int compareTo(District o) {
        return age.compareTo(o.getAge());
    }

    public District(){

}

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", age=" + age +

                '}';
    }
}
