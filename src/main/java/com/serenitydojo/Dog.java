package com.serenitydojo;

public class Dog extends Pet{
    private final String favoriteToy;
    private final int age;

    public Dog(String name, String favoriteToy, int age) {
        super(name);
        this.favoriteToy = favoriteToy;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getFavoriteToy() {
        return favoriteToy;
    }
}
