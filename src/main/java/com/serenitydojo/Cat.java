package com.serenitydojo;

public class Cat {
    private String name;
    private final String favoriteFood;
    private final int age;

    public static final String CAT_NOISE = "Meow";

    public static String usualFood(){
        return "Tuna";

    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        this.favoriteFood = usualFood();
    }

    public Cat(String name, String favoriteFood, int age) {
        this.name = name;
        this.favoriteFood = favoriteFood;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public void setFavoriteFood(String favoriteFood) {
        this.name = favoriteFood;
    }

    public int getAge() {
        return age;
    }

    public void makeNoise(){
        System.out.println(CAT_NOISE);
    }

    public void feed(String food) {
        System.out.println(name + " eats some " + food);
    }

    public void groom() {
        lickPaws();
        cleanFur();
    }

    private void cleanFur() {
        System.out.println(name + " Cleans his fur");
    }

    private void lickPaws() {
        System.out.println(name + " Licks his paws");
    }
}
