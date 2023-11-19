package tn.esprit.gestionzoo.Interface;

public interface Omnivore<T> extends Carnivore<T>, Herbivore<T> {
    void eatPlantAndMeat(T food);
}