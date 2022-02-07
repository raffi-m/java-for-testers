package com.serenitydojo;

public class Dog {
    private final String name   ;
    private final String favoriteToy;
    private final int age;

    public Dog(String name, String favoriteToy, int age) {
        this.name = name;
        this.favoriteToy = favoriteToy;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getFavoriteToy() {
        return favoriteToy;
    }
}
