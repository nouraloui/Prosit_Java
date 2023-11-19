public class Zoo {
    Animal[] animals;
    String name;
    String city;
    final int nbrCages = 25;
    int nbrAnimeaux = 0;

    public Zoo(){
    }

    public Zoo(String name, String city){
        animals = new Animal[nbrCages];
        this.name = name;
        this.city = city;
    }

    public void displayZoo(){
        System.out.println("Name: " + name);
        System.out.println("City: " + city);
        System.out.println("nbrCages: " + nbrCages);
        System.out.println("List of Animals:\n");
        for(int i=0; i<nbrAnimeaux; i++){
            System.out.println("Animal n°" + (i+1) + ": " + animals[i].toString());
        }
    }

    @Override
    public String toString() {
        return "Name: " + name + "\n" + "City " + city + "\n" + "nbrCages: " + nbrCages + "\n";
    }

    public boolean addAnimal(Animal animal){
        if((nbrAnimeaux < nbrCages) && (searchAnimal(animal) == -1)) {
            animals[nbrAnimeaux] = animal;
            nbrAnimeaux++;
            return true;
        }else{
            return false;
        }
    }

    public boolean removeAnimal(Animal animal){
        if(searchAnimal(animal) == -1){
            return false;
        }else{
            for(int i=searchAnimal(animal); i<nbrAnimeaux; i++){
                animals[i] = animals[i+1];
                nbrAnimeaux--;
            }
            return true;
        }
    }

    public int searchAnimal(Animal animal){
         for(int i=0; i<nbrAnimeaux; i++){
             if(animals[i].name == animal.name){
                 return i;
             }
         }
         return -1;
    }

    public boolean isZooFull(){
        if(nbrCages == nbrAnimeaux)
            return true;
        else
            return false;
    }

    public Zoo comparerZoo(Zoo z1, Zoo z2){
        if(z1.nbrAnimeaux < z2.nbrAnimeaux)
            return z2;
        else
            return z1;
    }
}