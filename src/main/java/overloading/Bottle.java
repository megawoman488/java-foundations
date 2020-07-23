package overloading;

import lombok.AllArgsConstructor;

import javax.swing.*;

@AllArgsConstructor

public class Bottle {
    private final String brand;
    private double volume;
    private final String material;
    private final int highInCm;
    public static String color;

    @Override
    public String toString() {
        return "Bottle{" +
                "brand='" + brand + '\'' +
                ", volume=" + volume +
                ", material='" + material + '\'' +
                ", highInCm=" + highInCm +
                ", color=" + color +
                '}';
    }

    public void printBottle() {
        System.out.println("Я бутылка" + this.toString());
    }

    public void printBottle(int age) {
        if (age < 100) {
            System.out.println("Я ещё жива" + this.toString());
        } else
            System.out.println("Давай до свидания, я уже мертва" + this.toString());
    }
}

