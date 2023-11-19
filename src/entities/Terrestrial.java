package tn.esprit.gestionzoo.entities;

import tn.esprit.gestionzoo.Enum.Food;
import tn.esprit.gestionzoo.Interface.Omnivore;

public class Terrestrial extends Animal implements Omnivore<Food> {
    private  int nbrLegs ;

    public Terrestrial() {
    }

    public Terrestrial(String family, String name, int age, boolean isMammal, int nbrLegs) {
        super(family, name, age, isMammal);
        this.nbrLegs = nbrLegs;
    }

    public int getNbrLegs() {
        return nbrLegs;
    }

    public void setNbrLegs(int nbrLegs) {
        this.nbrLegs = nbrLegs;
    }

    @Override
    public String toString() {
        return "Terrestrial{"  +
                super.toString()+
                ", nbrLegs=" + nbrLegs +
                '}';
    }


    @Override
    public void eatMeat(Food meat) {
        if (meat == Food.MEAT || meat == Food.BOTH){
            System.out.println("Carnivorous animal");
        }else {
            System.out.println("Herbivorous animal");
        }
    }

    @Override
    public void eatPlant(Food plant) {
        if (plant == Food.PLANT || plant == Food.BOTH){

            System.out.println("Herbivorous animal");
        }else {
            System.out.println("Carnivorous animal");
        }
    }

    @Override
    public void eatPlantAndMeat(Food food) {
        System.out.println("Herbivorous and Carnivorous animal");
    }
}
