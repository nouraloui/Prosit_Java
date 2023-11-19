package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;

public class ZooManagement {

    public static void main(String[] args) {
        Animal lion = new Animal();
        lion.setName("Simba");
        lion.setAge(8);
        lion.setFamily("Cats");
        lion.setMammal(true);

        Zoo myZoo = new Zoo("Wildlife Park", "Ariana");
        Zoo notMyZoo = new Zoo("WaterPark", "Siliana");


        Animal dog = new Animal("Canine", "Snoopy", 2, true);

//
//        System.out.println(myZoo.addAnimal(lion));
//        System.out.println(myZoo.addAnimal(dog));
//
//        myZoo.displayAnimals();
//
//        System.out.println(myZoo.searchAnimal(dog));
//        Animal dog2 = new Animal("Canine", "lll", 2, true);
//        System.out.println(myZoo.searchAnimal(dog2));
//
////           System.out.println(myZoo.removeAnimal(dog));
//        myZoo.displayAnimals();
//
//
//        System.out.println(myZoo);
//
//        myZoo.addAnimal(lion);
//        myZoo.addAnimal(dog);
//        myZoo.addAnimal(dog2);
//        myZoo.displayAnimals();

        Dolphin d = new Dolphin();
        d.setSwimmingSpeed(24.5f);
        Dolphin d1 = new Dolphin();
        d1.setSwimmingSpeed(21.8f);
        Dolphin d2 = new Dolphin();
        d2.setSwimmingSpeed(20.3f);
        Dolphin d3 = new Dolphin();
        d3.setSwimmingSpeed(22.6f);


        myZoo.addAquaticAnimal(d);
        myZoo.addAquaticAnimal(d1);
        myZoo.addAquaticAnimal(d2);
        myZoo.addAquaticAnimal(d3);
        Penguin p = new Penguin();
        p.setSwimmingDepth(24.6f);
        Penguin p1 = new Penguin();
        p1.setSwimmingDepth(29.6f);
        Penguin p2 = new Penguin();
        p2.setSwimmingDepth(219.6f);
        Penguin p3 = new Penguin();
        p1.setSwimmingDepth(2.6f);
        myZoo.addAquaticAnimal(p);
        myZoo.addAquaticAnimal(p1);
        myZoo.addAquaticAnimal(p2);
        myZoo.addAquaticAnimal(p3);
        myZoo.addAquaticAnimal(new Penguin());

        for (int i = 0; i < myZoo.getNbrAquatics(); i++) {
            Aquatic[] aquatics = myZoo.getAquaticAnimals();
            aquatics[i].swim();
        }

        System.out.println(myZoo.averageSwimmingSpeed());
        myZoo.displayNumberOfAquaticsByType();

        System.out.println(myZoo.maxPenguinSwimmingDepth());

    }

}
