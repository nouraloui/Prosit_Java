package tn.esprit.gestionzoo.main;
import tn.esprit.gestionzoo.Exception.InvalidAgeException;
import tn.esprit.gestionzoo.Exception.ZooFullException;
import  tn.esprit.gestionzoo.entities.*;

import java.util.Arrays;
import java.util.Scanner;

public class ZooManagement {
    public static void main(String[] args) {
/*
        Instruction 5 :
        tn.esprit.gestionzoo.entities.Animal lion = new tn.esprit.gestionzoo.entities.Animal("Félin", "lion", 3, true);
        tn.esprit.gestionzoo.entities.Zoo myZoo = new tn.esprit.gestionzoo.entities.Zoo("Mon tn.esprit.gestionzoo.entities.Zoo", "Ma Ville", 25);
*/




/*      Instruction 6 :
        On remarque qu'il faut additionner les valeurs des objets car nous avons créé un constructeur
*/




//        Instruction 7 :
        Animal lion = new Animal();
       try {
           lion.setAge(-2);
       }catch (InvalidAgeException ex){
           System.out.println(ex.getMessage());
       }
        lion.setName("lion");
        lion.setMammal(true);
        lion.setFamily("Félin");

        Animal elephant = new Animal();

        try {
            elephant.setAge(5);
        }catch (InvalidAgeException ex){
            System.out.println(ex.getMessage());
        }
        elephant.setName("elephant");
        elephant.setMammal(true);
        elephant.setFamily("Éléphant");




//        Instruction 8 :

        Zoo myZoo = new Zoo();
        myZoo.setName("Mon Zoo");
        myZoo.setCity("Ma Ville");
        myZoo.displayZoo();
        System.out.println(myZoo);
        System.out.println(myZoo.toString());
        /*
        output de instruction  myZoo.displayZoo();
        Nom du zoo : Mon tn.esprit.gestionzoo.entities.Zoo
        Ville du zoo : Ma Ville
        Nombre de cages : 2

        output de instruction System.out.println(myZoo); et System.out.println(myZoo.toString());
        tn.esprit.gestionzoo.entities.Zoo@5f184fc6
        tn.esprit.gestionzoo.entities.Zoo@5f184fc6
        */
        /*
        Lorsque vous utilisez System.out.println(myZoo); et System.out.println(myZoo.toString());
        et que la classe tn.esprit.gestionzoo.entities.Zoo n'a pas redéfini la méthode toString()
        donc ils afficher adresse mémoire
        */

//        Instruction 9 :
//        pour corriger cette erreur on doit ajouter methode toString()


//        Instruction 10 :
        // on propos number de cages est 2
        Animal tigre = new Animal();


        try {
            tigre.setAge(8);
        }catch (InvalidAgeException ex){
            System.out.println(ex.getMessage());
        }
        tigre.setName("Tigre");
        tigre.setMammal(true);
        tigre.setFamily("Félin");
        System.out.println(lion.toString());
        System.out.println(tigre.toString());
        System.out.println(elephant.toString());
        // ----------
        try {
            myZoo.addAnimal(lion);
        }catch (ZooFullException ex){
            System.out.println(ex.getMessage());
        }
        try {
            myZoo.addAnimal(tigre);
        }catch (ZooFullException ex){
            System.out.println(ex.getMessage());
        }
        try {
            myZoo.addAnimal(elephant);
        }catch (ZooFullException ex){
            System.out.println(ex.getMessage());
        }




        /*
        output:
        L'animal 1 a été ajouté au zoo avec succès !
        L'animal 2 a été ajouté au zoo avec succès !
        L'animal 3 n'a pas pu être ajouté au zoo.


        On note le nombre maximum d'animaux peuvent être ajoutés inferieur la valeur de nbrcages
         dans ce cas nombre de cages est 2 on peut ajouter 2 animaux .

         */


//      Instruction 11 :
        System.out.println("------------------------ Instruction 11 -------------------------");
        myZoo.displayAnimals();
        /*
        output :
        tn.esprit.gestionzoo.entities.Animal 1:
        tn.esprit.gestionzoo.entities.Animal{family='Félin', name='lion', age=3, isMammal=true}
        tn.esprit.gestionzoo.entities.Animal 2:
        tn.esprit.gestionzoo.entities.Animal{family='Félin', name='Tigre', age=8, isMammal=true}
         */
        Animal animalRecherche1 = new Animal();

        try {
            animalRecherche1.setAge(3);
        }catch (InvalidAgeException ex){
            System.out.println(ex.getMessage());
        }
        animalRecherche1.setName("lion");
        animalRecherche1.setMammal(true);
        animalRecherche1.setFamily("Félin");
        int index1 = myZoo.searchAnimal(animalRecherche1);
        if (index1 != -1) {
            System.out.println("L'animal " + animalRecherche1.getName() + " a été trouvé à l'indice: "+index1);
        } else {
            System.out.println("L'animal " + animalRecherche1.getName() + " n'a pas été trouvé dans le zoo.");
        }
        Animal animalRecherche2 = new Animal();
        try {
            animalRecherche2.setAge(2);
        }catch (InvalidAgeException ex){
            System.out.println(ex.getMessage());
        }
        animalRecherche2.setName("cat");
        animalRecherche2.setMammal(true);
        animalRecherche2.setFamily("Félin");
        int index2 = myZoo.searchAnimal(animalRecherche2);
        if (index2 != -1) {
            System.out.println("L'animal " + animalRecherche2.getName() + " a été trouvé à l'indice: "+index2);
        } else {
            System.out.println("L'animal " + animalRecherche2.getName() + " n'a pas été trouvé dans le zoo.");
        }
        /*
        output:
        L'animal lion a été trouvé à l'indice: 0
        L'animal cat n'a pas été trouvé dans le zoo.
         */


        //  Créez un autre animal identique au premier
        Animal lion2 = new Animal();


        try {
            lion2.setAge(4);
        }catch (InvalidAgeException ex){
            System.out.println(ex.getMessage());
        }
        lion2.setName("lion");
        lion2.setMammal(true);
        lion2.setFamily("Félin");

      try {
          myZoo.addAnimal(lion2);
      }catch (ZooFullException ex){
          System.out.println( ex.getMessage());
      }

        Animal animalRecherche3 = new Animal();


        try {
            animalRecherche3.setAge(4);
        }catch (InvalidAgeException ex){
            System.out.println(ex.getMessage());
        }
        animalRecherche3.setName("lion");
        animalRecherche3.setMammal(true);
        animalRecherche3.setFamily("Félin");
        int index3 = myZoo.searchAnimal(animalRecherche3);
        if (index3 != -1) {
            System.out.println("L'animal " + animalRecherche1.getName() + " a été trouvé à l'indice:"+index3);
        } else {
            System.out.println("L'animal " + animalRecherche1.getName() + " n'a pas été trouvé dans le zoo.");
        }
        myZoo.displayAnimals();
        /*
        output:
        L'animal lion a été trouvé à l'indice: 0
        L'animal cat n'a pas été trouvé dans le zoo.
        L'animal 4 a été ajouté au zoo avec succès !
        L'animal lion a été trouvé à l'indice:0
        Animaux dans le zoo:
        tn.esprit.gestionzoo.entities.Animal 1:
        tn.esprit.gestionzoo.entities.Animal{family='Félin', name='lion', age=3, isMammal=true}
        tn.esprit.gestionzoo.entities.Animal 2:
        tn.esprit.gestionzoo.entities.Animal{family='Félin', name='Tigre', age=8, isMammal=true}
        tn.esprit.gestionzoo.entities.Animal 3:
        tn.esprit.gestionzoo.entities.Animal{family='Éléphant', name='elephant', age=5, isMammal=true}
        tn.esprit.gestionzoo.entities.Animal 4:
        tn.esprit.gestionzoo.entities.Animal{family='Félin', name='lion', age=3, isMammal=true}
        J'ai remarqué que la méthode renverra l'index du premier animal correspondant trouvé dans le zoo.

        */

//       Instruction 12 :
        System.out.println("------------------------ Instruction 12 -------------------------");
        /*
        pour corriger cette erreur on ajouter function boolean pour test si animail existe ou non
        avant ajouter dans le zoo et utilise function equals pour compare 2 objects
        - function equals est ajouter dans la classe animal
        - function isAnimalInZoo(animal) est ajouter dans le class tn.esprit.gestionzoo.entities.Zoo et appelle dans le function addAnimal(animal)
         */
        myZoo.displayAnimals();
    /*
        output :
        L'animal lion a été trouvé à l'indice: 0
        L'animal cat n'a pas été trouvé dans le zoo.
        L'animal 4 n'a pas pu être ajouté au zoo.
        L'animal lion a été trouvé à l'indice:0
        Animaux dans le zoo:
        tn.esprit.gestionzoo.entities.Animal 1:
        tn.esprit.gestionzoo.entities.Animal{family='Félin', name='lion', age=3, isMammal=true}
        tn.esprit.gestionzoo.entities.Animal 2:
        tn.esprit.gestionzoo.entities.Animal{family='Félin', name='Tigre', age=8, isMammal=true}
        tn.esprit.gestionzoo.entities.Animal 3:
        tn.esprit.gestionzoo.entities.Animal{family='Éléphant', name='elephant', age=5, isMammal=true}
     */




//        Instruction 13 :
        System.out.println("------------------------ Instruction 13 -------------------------");
        myZoo.displayAnimals();
        Animal animalToRemove = new Animal();


        try {
            animalToRemove.setAge(4);
        }catch (InvalidAgeException ex){
            System.out.println(ex.getMessage());
        }
        animalToRemove.setName("lion");
        animalToRemove.setMammal(true);
        animalToRemove.setFamily("Félin");
        boolean removed = myZoo.removeAnimal(animalToRemove);
        if (removed) {
            System.out.println("L'animal a été supprimé avec succès du zoo.");
        } else {
            System.out.println("L'animal n'a pas été trouvé dans le zoo et n'a pas été supprimé.");
        }
        myZoo.displayAnimals();
        /*
            output:
            avant remove:
            Animaux dans le zoo:
            tn.esprit.gestionzoo.entities.Animal 1:
            tn.esprit.gestionzoo.entities.Animal{family='Félin', name='lion', age=3, isMammal=true}

            tn.esprit.gestionzoo.entities.Animal 2:
            tn.esprit.gestionzoo.entities.Animal{family='Félin', name='Tigre', age=8, isMammal=true}

            tn.esprit.gestionzoo.entities.Animal 3:
            tn.esprit.gestionzoo.entities.Animal{family='Éléphant', name='elephant', age=5, isMammal=true}
            *******************
            L'animal a été supprimé avec succès du zoo.
            *******************
            apres remove :
            Animaux dans le zoo:
            tn.esprit.gestionzoo.entities.Animal 1:
            tn.esprit.gestionzoo.entities.Animal{family='Félin', name='Tigre', age=8, isMammal=true}

            tn.esprit.gestionzoo.entities.Animal 2:
            tn.esprit.gestionzoo.entities.Animal{family='Éléphant', name='elephant', age=5, isMammal=true}
         */


//         Instruction 14 :
        /*
        final private int nbrCages = 25;
         */
//        Instruction 15 :
        boolean isZooFull = myZoo.isZooFull();
        if (isZooFull) {
            System.out.println("The zoo is full");
        } else {
            System.out.println("The zoo is not yet full");
        }

        /*
        Output:
        The zoo is not yet full.
         */
//        Instruction 16 :

        Zoo secondZoo = new Zoo();
        secondZoo.setName("Secound Zoo");
        secondZoo.setCity("Ville 2");
        Animal lionToSecondZoo = new Animal();

        try {
            lionToSecondZoo.setAge(8);

        }catch (InvalidAgeException ex){
            System.out.println(ex.getMessage());
        }
        lionToSecondZoo.setName("lion");
        lionToSecondZoo.setMammal(true);
        lionToSecondZoo.setFamily("Félin");
        try {
            secondZoo.addAnimal(lionToSecondZoo);
        }catch (ZooFullException ex){
            System.out.println(ex.getMessage());
        }

        Animal tigerToSecondZoo = new Animal();


        try {
            tigerToSecondZoo.setAge(6);
        }catch (InvalidAgeException ex){
            System.out.println(ex.getMessage());
        }
        tigerToSecondZoo.setName("tiger");
        tigerToSecondZoo.setMammal(true);
        tigerToSecondZoo.setFamily("Félin");
        try {
            secondZoo.addAnimal(tigerToSecondZoo);
        }catch (ZooFullException ex){
            System.out.println( ex.getMessage());
        }

        Animal elephantToSecondZoo = new Animal();


        try {
            elephantToSecondZoo.setAge(11);
        }catch (InvalidAgeException ex){
            System.out.println(ex.getMessage());
        }
        elephantToSecondZoo.setName("elephant");
        elephantToSecondZoo.setMammal(true);
        elephantToSecondZoo.setFamily("Éléphant");
        try {
            secondZoo.addAnimal(elephantToSecondZoo);
        }catch (ZooFullException ex){
            System.out.println( ex.getMessage());
        }

        Animal catToSecondZoo = new Animal();


        try {
            catToSecondZoo.setAge(2);
        }catch (InvalidAgeException ex){
            System.out.println(ex.getMessage());
        }
        catToSecondZoo.setName("cat");
        catToSecondZoo.setMammal(true);
        catToSecondZoo.setFamily("Félin");
        try {
            secondZoo.addAnimal(catToSecondZoo);
        }catch (ZooFullException ex){
            System.out.println( ex.getMessage());
        }

        Zoo comparisonResult =myZoo.comparerZoo(myZoo,secondZoo);
        if (comparisonResult.equals(myZoo)){
            System.out.println("Zoo win is " + myZoo);
        }else{
            System.out.println("win is " + secondZoo);
        }
        comparisonResult.displayAnimals();
        /*
        output:
        Animaux dans le zoo:
        tn.esprit.gestionzoo.entities.Animal :tn.esprit.gestionzoo.entities.Animal{family='Félin', name='lion', age=8, isMammal=true}
        tn.esprit.gestionzoo.entities.Animal :tn.esprit.gestionzoo.entities.Animal{family='Félin', name='tiger', age=6, isMammal=true}
        tn.esprit.gestionzoo.entities.Animal :tn.esprit.gestionzoo.entities.Animal{family='Éléphant', name='elephant', age=11, isMammal=true}
        tn.esprit.gestionzoo.entities.Animal :tn.esprit.gestionzoo.entities.Animal{family='Félin', name='cat', age=2, isMammal=true}


         */

//      Instruction 21 :
        System.out.println("------------------------ Instruction 21 -------------------------");
            Dolphin dolphin = new Dolphin();
            Penguin penguin = new Penguin();
            Aquatic aquatic = new Aquatic();
            Terrestrial terrestrial = new Terrestrial();
//      Instruction 22 :
            //Remarquez une erreur lors de la création des objets
            //  après la création de constructeurs paramétrés


            // Parce que cet objet est automatiquement appelé constructeur par défaut
            // mais après avoir créé des constructeurs paramétrés,
            // il est nécessaire d'utiliser ces constructeurs lorsqu'aucun constructeur sans paramètre
            // n'est créé dans la classe


             // pour corige cette ereur en va cree constructeur par défaut dans cette class

//        Instruction 23 :
        System.out.println("------------------------ Instruction 23 -------------------------");
        Dolphin dolphin1 = new Dolphin("Dolphin", "dolphin", 2, true, "oceans", 60);
        Penguin penguin1 = new Penguin("Penguin", "penguin", 2,true, "Southern Hemisphere", 200);
        Aquatic aquatic1 = new Aquatic("Fish", "Tuna", 2, true, "ocean");
        Terrestrial terrestrial1 = new Terrestrial("Lions", "lion", 5, true, 4);


        System.out.println(dolphin1); // dolphin1.toString()
        System.out.println(penguin1); // penguin1.toString()
        System.out.println(penguin1); // penguin1.toString()
        System.out.println(terrestrial1); // terrestrial1.toString()

        /*
        Output:
        Dolphin{Aquatic{Animal{family='Dolphin', name='dolphin', age=2, isMammal=true}, habitat='oceans'}, swimmingSpeed=60.0}
        Penguin{Aquatic{Animal{family='Penguin', name='penguin', age=2, isMammal=true}, habitat='Southern Hemisphere'}, swimmingDepth=200.0}
        Penguin{Aquatic{Animal{family='Penguin', name='penguin', age=2, isMammal=true}, habitat='Southern Hemisphere'}, swimmingDepth=200.0}
        Terrestrial{Animal{family='Lions', name='lion', age=5, isMammal=true}, nbrLegs=4}

         */


//      Instruction 24 :
        System.out.println("------------------------ Instruction 24 -------------------------");
        dolphin1.swim();
        aquatic1.swim();
        penguin1.swim();

        /*
        Output:
        This dolphin is swimming.
        This aquatic animal is swimming.
        This aquatic animal is swimming.

        on remarque que penguin1.swim(); afficher le contenu de swim dans la class aquatic car
        swim est une méthode hérité.
        c’est ce qu’on appelle l’héritage de méthode.
         */











    }
}

