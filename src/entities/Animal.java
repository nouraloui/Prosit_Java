package tn.esprit.gestionzoo.entities;

import tn.esprit.gestionzoo.Exception.InvalidAgeException;

import java.util.Objects;

public class Animal {
    private  String family;
    private String name;
    private  int age;
    private boolean isMammal;

    public Animal() {
    }

    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws InvalidAgeException {
        if (age > 0 ) {
            this.age = age;
        }else {
            throw new InvalidAgeException();
        }
    }

    public boolean isMammal() {
        return isMammal;
    }

    public void setMammal(boolean mammal) {
        isMammal = mammal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age && isMammal == animal.isMammal && Objects.equals(family, animal.family) && Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(family, name, age, isMammal);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "family='" + family + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isMammal=" + isMammal +
                '}';
    }

    public void swim(){
        System.out.println("hello animal");
    }
}
