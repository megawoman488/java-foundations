package core;

import static java.awt.Color.red;
import static java.awt.Color.white;

public class CatHouse {
    public static void main(String[] args) { //psvm

        Cat cat = new Cat();

        Lion leo = new Lion();
        leo.sayMeow();

        Cat bagira = new Panther();
        bagira.sayMeow();

        DomesticCat murochka = new DomesticCat("Murochka", 3.0, true);
        System.out.println(murochka.getName());

        Cow glasha = new Cow("Glasha", "White", "Charolais" );
        System.out.println(glasha.getName());
        glasha.Muu();
        glasha.setColor("Red");
        glasha.Muu();

        Cow masha = new Cow("Masha", "Black", "Charolais" );
        System.out.println(masha.getName());
        masha.Muu();
        masha.setColor("White");
        masha.setBreed("Limousine");
        masha.Muu();

        Cow clusha = new Cow("Clusha", "Black", "Charolais" );
        System.out.println(clusha.getName());
        clusha.Muu();
        clusha.setColor("Brown");
        clusha.Muu();

        Cow sasha = new Cow("Sasha", "White", "Charolais" );
        System.out.println(sasha.getName());
        sasha.Muu();

        Cow musha = new Cow("Musha", "Brown", "Charolais" );
        System.out.println(musha.getName());
        musha.Muu(); //kjnjnjnjn





    }
}
