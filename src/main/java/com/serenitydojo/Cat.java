package com.serenitydojo;

public class Cat extends Pet {
    private String favoriteFood;
    private int age;

    public static final String CAT_NOISE = "Meow";

    public static String usualFood(){
        return "Tuna";

    }

    public Cat(String name, int age) {
        super(name);
        this.age = age;
        this.favoriteFood = usualFood();
    }

    public Cat(String name, String favoriteFood, int age) {
        super(name);
        this.favoriteFood = favoriteFood;
        this.age = age;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }

    public int getAge() {
        return age;
    }

    public void makeNoise(){
        System.out.println(CAT_NOISE);
    }

    public void feed(String food) {
        System.out.println(getName() + " eats some " + food);
    }

    public void groom() {
        lickPaws();
        cleanFur();
    }

    private void cleanFur() {
        System.out.println(getName() + " Cleans his fur");
    }

    private void lickPaws() {
        System.out.println(getName() + " Licks his paws");
    }
}
