package tn.esprit.entities;

public class Animal {

   private String family;
    private String name;
    private int age;
    private boolean isMammal;

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

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isMammal() {
        return isMammal;
    }

    public void setMammal(boolean mammal) {
        isMammal = mammal;
    }

    public Animal(String family, String name, int age , boolean isMammal){
        this.family=family;
        this.name=name;
        this.age=age;
        this.isMammal=isMammal;
    }
    public Animal(){

    }

    public String toString(){
        return  "tn.esprit.entities.Animal : "+this.name + "family"+this.family +" age "+ this.age +" isMammal "+ this.isMammal;
    }


    public void displayAnimal(){
       System.out.println( "tn.esprit.entities.Animal : "+this.name);
    }
}
