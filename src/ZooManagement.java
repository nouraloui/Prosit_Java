package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.Animal;
import tn.esprit.gestionzoo.entities.Zoo;

public class ZooManagement {

    public static void main(String[] args) {
                /*int nbrCages = 20;
        String zooName = "my zoo";

        System.out.println(zooName + " comporte " + nbrCages + " cages");

        Scanner scn = new Scanner(System.in);
        Scanner scn1 = new Scanner(System.in);

        System.out.println("Entrer le nombre de cages: ");
        nbrCages = scn.nextInt();
        System.out.println("Enterer le nom du zoo: ");
        zooName = scn1.nextLine();

        System.out.println(zooName + " comporte " + nbrCages + " cages");*/


        //-------------------------------- Prosit 2 -------------------------------------//
        Animal a1 = new Animal();
        a1.setName("Otariidae");
        a1.setAge(10);
        a1.setFamily("Lion");
        a1.setMammal(true);
        
        Zoo myZoo = new Zoo("myZoo",  "Tunis");
        Zoo notMyZoo = new Zoo( "myZoo2", "Ben Gerdan");
        Animal a2 = new Animal("Canidae", "Wolf", 8, false);


        System.out.println(myZoo.addAnimal(a1));
        System.out.println(myZoo.addAnimal(a2));

        myZoo.displayAnimals();

        System.out.println(myZoo.searchAnimal(a2));
        Animal a3 = new Animal("Canine", "lll", 2, true);
        System.out.println(myZoo.searchAnimal(a3));

//           System.out.println(myZoo.removeAnimal(a1));
        myZoo.displayAnimals();


        System.out.println(myZoo);

        myZoo.addAnimal(a1);
        myZoo.addAnimal(a2);
        myZoo.addAnimal(a3);
        myZoo.addAnimal(a4);
        myZoo.displayAnimals();
        myZoo.displayZoo();
        System.out.println(myZoo.isZooFull()); //False because myZoo ain't full.
        result = myZoo.comparerZoo(myZoo, myZoo2);
        System.out.println("La résultat de comparerZoo() est: " + result.name);

    }

}
