public class Animal {
    String family;
    String name;
    int age;
    boolean isMammal;

    public Animal(){
    }

    public Animal(String family, String name, int age, boolean isMammal){
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }

    @Override
    public String toString() {
        if(isMammal)
            return "Family: " + family + "\n" + "Name: " + name + "\n" + "Age: " + age + "\n" + "isMammal: Yes\n";
        else
            return "Family: " + family + "\n" + "Name: " + name + "\n" + "Age: " + age + "\n" + "isMammal: No\n";
    }
    public void displayAnimal(){
        System.out.println("Family: " + family);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        if(isMammal)
            System.out.println("isMammal: Yes");
        else
            System.out.println("isMammal: No");
    }
}
