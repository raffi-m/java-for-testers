package com.serenitydojo;

import org.junit.Assert;
import org.junit.Test;

public class WhenCreatingObjects {

    @Test
    public void creating_a_cat() {
        Cat felix = new Cat("Felix", "Tuna", 4);
        Assert.assertEquals(felix.getName(), "Felix");
        Assert.assertEquals(felix.getFavoriteFood(), "Tuna");
        Assert.assertEquals(felix.getAge(), 4);

    }

    @Test
    public void creating_a_dog() {
        Dog fido = new Dog("Fido", "Bone", 5);
        Assert.assertEquals(fido.getName(), "Fido");
        Assert.assertEquals(fido.getFavoriteToy(), "Bone");
        Assert.assertEquals(fido.getAge(), 5);
    }

    @Test
    public void cat_makes_noise(){
//        Cat felix = new Cat("Felix", "Tuna", 4);
        Cat felix = new Cat("Felix", 4);
        Cat spot  = new Cat("Spot", "Salmon", 3);
        System.out.println("Usual food = " + Cat.usualFood());
        System.out.println("Felix's favorite food = " + felix.getFavoriteFood());
        felix.makeNoise();
        felix.feed("Tuna");
        spot.feed("Salmon");
        felix.groom();
    }
}
