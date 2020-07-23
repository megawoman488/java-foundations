package overloading;

public class Bar {

    public static void main(String[] args) {
        Bottle.color = "blue";
        Bottle waterBottle = new Bottle("Saint spring", 0.75, "plastic", 8);

        waterBottle.printBottle();
        waterBottle.printBottle(10);
        waterBottle.printBottle(1000);

        Bottle waterBottle2 = new Bottle("Saint spring", 0.75, "plastic", 8);
        waterBottle2.printBottle();

        Bottle.color = "green";

        waterBottle.printBottle();
        waterBottle2.printBottle();





    }

}
