package core;

public class Man {
    private final String name;
    private double weight;
    private boolean isPretty;

    public void Hi() {
        System.out.println(name + ":Hi" + ". Мой вес: " + weight + ". Моя привлекательность: " + isPretty);
    }


    public Man(String name, double weight, boolean isPretty) {
        this.name = name;
        this.weight = weight;
        this.isPretty = isPretty;
    }

    public String getName() {
        return this.name;
    }

    public double getWeight() {
        return this.weight;
    }

    public boolean isPretty() {
        return this.isPretty;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setPretty(boolean isPretty) {
        this.isPretty = isPretty;
    }
}
