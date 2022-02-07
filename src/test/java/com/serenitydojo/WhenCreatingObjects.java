package com.serenitydojo;

import org.junit.Assert;
import org.junit.Test;

public class WhenCreatingObjects {

    @Test
    public void creating_a_cat(){
        String name = "Felix";
        String favoriteFood = "Tune";
        int age = 4;

        Cat felix = new Cat("Felix", "Tuna", 4);
        System.out.println(felix.getName());
        System.out.println(felix.getFavoriteFood());
        System.out.println("Felix's age is " + felix.getAge());

        Cat spot = new Cat("Spot", "Tuna", 3);
        System.out.println(spot.getName());
        System.out.println(spot.getFavoriteFood());
        System.out.println("Spot's age is " + spot.getAge());

    }

    @Test
    public void creating_a_dog() {
        Dog fido = new Dog("Fido","Bone", 5);
        Assert.assertEquals(fido.getName(), "Fido");
        Assert.assertEquals(fido.getFavoriteToy(), "Bone");
        Assert.assertEquals(fido.getAge(), 5);
    }
}
