package tn.esprit.gestionzoo.entities;

import tn.esprit.gestionzoo.Enum.Food;
import tn.esprit.gestionzoo.Exception.ZooFullException;

import java.io.OptionalDataException;
import java.util.ArrayList;

public class Zoo {
    private  ArrayList<Animal> animals = new ArrayList<Animal>() ;
    private String name;
    private String city;
    final private int nbrCages = 2;

    Aquatic[] aquaticAnimals = new Aquatic[10];

    public String getName() {
        return name;
    }

    public ArrayList<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(ArrayList<Animal> animals) {
        this.animals = animals;
    }

    public void setName(String name) {
      if ( ! name.isEmpty()){
          this.name = name;
      }else{
          System.out.println("Name not empty");
          System.exit(0);
      }
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }


    public Zoo() {
    }

    @Override
    public String toString() {
        return "Zoo{" +
                "name=" + name + "\n" +
                ", city=" + city + "\n" +
                ", nbrCages=" + nbrCages +
                '}';
    }

    public void displayZoo() {
        System.out.println("Nom du zoo : " + name);
        System.out.println("Ville du zoo : " + city);
        System.out.println("Nombre de cages : " + nbrCages);
    }

    public int searchAnimal(Animal animalToSearch) {
        for (Animal animal : animals)
        {
            if (animal.getName().equals(animalToSearch.getName())){
                return  animals.indexOf(animalToSearch) ;
             }
        }
       return  -1;
    }

     public void addAnimal(Animal animal) throws ZooFullException {
        if (searchAnimal(animal) == -1) {
            if ( !animals.contains(animal)) {
                animals.add(animal);
            }
        } else{
            throw new ZooFullException();
        }

    }



    public void displayAnimals() {
        System.out.println("Animaux dans le zoo:");
        for (Animal animal : animals)
        {
            System.out.println(animal);
        }
    }

     public boolean removeAnimal(Animal animalToRemove) {
        return  animals.remove(animalToRemove);
    }


    public boolean isZooFull() {
        return animals.size() == nbrCages;
    }


    public Zoo comparerZoo(Zoo myZoo, Zoo secondZoo) {
        return myZoo.animals.size() < secondZoo.animals.size() ? secondZoo:myZoo;
    }

    public void addAquaticAnimal(Aquatic aquatic){
        for (int i =0 ; i < aquaticAnimals.length ; i++){
            if (aquaticAnimals[i] == null) {
                aquaticAnimals[i] = aquatic;
                break;
            }
        }

    }
     public float maxPenguinSwimmingDepth(Aquatic[] aquaticAnimals){
        float max = -1 ;
        for (int i = 0 ; i < aquaticAnimals.length ; i++){
         if (aquaticAnimals[i] != null && aquaticAnimals[i] instanceof Penguin) {
            if (((Penguin) aquaticAnimals[i]).getSwimmingDepth() > max){
                max = ((Penguin) aquaticAnimals[i]).getSwimmingDepth();
            }
            }
        }
        return max;
    }

    public void displayNumberOfAquaticsByType(Aquatic[] aquaticAnimals){
        int numDolphin = 0 ;
        int numPenguin = 0 ;
        for (Aquatic aquaticAnimal : aquaticAnimals) {
            if (aquaticAnimal instanceof Penguin) {
                numPenguin++;
            }else if (aquaticAnimal instanceof Dolphin) {
                numDolphin++;
            }
        }
        System.out.println("number of Dolphin:"+numDolphin);
        System.out.println("number of Penguin:"+numPenguin);
    }

    public static void main(String[] args) {
//      Instruction 25 :
        System.out.println("------------------------ Instruction 25 -------------------------");

//      Instruction 26 :
        System.out.println("------------------------ Instruction 26 -------------------------");

        Zoo newZoo = new Zoo();
        newZoo.setName("newZoo");
        newZoo.setCity("Tunisia");
        Aquatic aquaticAnimals1 = new Dolphin("Dolphin", "dolphin", 2, true, "oceans", 60);
        Aquatic aquaticAnimals2 = new Penguin("Penguin", "penguin", 2,true, "Southern Hemisphere", 200);
        newZoo.addAquaticAnimal(aquaticAnimals1);
        newZoo.addAquaticAnimal(aquaticAnimals2);

//      Instruction 27 :
        System.out.println("------------------------ Instruction 27 -------------------------");
        aquaticAnimals1.swim();
        aquaticAnimals2.swim();
        /*
        output:
        This dolphin is swimming.
        This aquatic animal is swimming.


        la classe Fish redéfinit la méthode swim(),
        mais la classe Dolphin n'a pas redéfini la méthode swim().
         Lorsque  appele la méthode swim() le niveau le plus bas qui gagne
         */


//      Instruction 28 :
//        System.out.println("------------------------ Instruction 28 -------------------------");
//      Instruction 29 :
        System.out.println("------------------------ Instruction 29 -------------------------");
        System.out.println("max number depth swimming of penguins in zoo :"+newZoo.maxPenguinSwimmingDepth(newZoo.aquaticAnimals));
//      Instruction 30 :
        System.out.println("------------------------ Instruction 30 -------------------------");
        newZoo.displayNumberOfAquaticsByType(newZoo.aquaticAnimals);
//      Instruction 31 :
        System.out.println("------------------------ Instruction 31 -------------------------");
        Aquatic aquaticAnimals3 = new Penguin("Penguin", "penguin", 10,true, "Southern Hemisphere", 200);
        Aquatic aquaticAnimals4 = new Penguin("Penguin", "penguin", 2,true, "Southern Hemisphere", 200);
        System.out.println(aquaticAnimals3.equals(aquaticAnimals2));
        System.out.println(aquaticAnimals4.equals(aquaticAnimals2));

//   Prosit 8 : Instruction 38
        Aquatic aquatic = new Aquatic();
        aquatic.eatMeat(Food.MEAT);
        /*
        OutPut :
        Carnivorous animal
         */

        Penguin penguin = new Penguin();
        penguin.eatMeat(Food.MEAT);
        /*
         OutPut :
        Carnivorous animal
         */


        Terrestrial terrestrial = new Terrestrial();
        terrestrial.eatMeat(Food.MEAT);
        terrestrial.eatPlant(Food.PLANT);
        terrestrial.eatPlantAndMeat(Food.BOTH);

        /*
        OutPut:
        Carnivorous animal
        Herbivorous animal
        Herbivorous and Carnivorous animal
         */
     }
}
