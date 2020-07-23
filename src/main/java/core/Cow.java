package core;

import java.awt.*;

public class Cow {
    private final String name;
    private String color;
    private String breed;



    public void Muu() {
        System.out.println(name + ":Muu" + ". Мой цвет: " + color + ". Моя порода: " + breed);
    }

    public Cow(String name, String color, String breed) {
        System.out.println("Мы создали новую корову");
        this.name = name;
        this.color = color;
        this.breed = breed;
    }

    public String getName() {
        return this.name;
    }

    public String getColor() {
        return this.color;
    }

    public String getBreed() {
        return this.breed;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
