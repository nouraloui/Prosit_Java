package tn.esprit.entities;

public class Zoo {
    private String name;
   private String city;
    private int nbrCages;
    private Animal[] animals;
    private Acquatic[] acquaticAnimals;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getNbrCages() {
        return nbrCages;
    }

    public void setNbrCages(int nbrCages) {
        this.nbrCages = nbrCages;
    }

    public Animal[] getAnimals() {
        return animals;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }


    //Declarer deux variables de capacite

    int CapaciteCages =20;
    int CapaciteAnimaux = 25;

    int compteurAquatic=0;

    int compteurAnimal=0;

    public Zoo(int capaciteAnimaux , String name , String city , int nbrCages){
       animals = new Animal[capaciteAnimaux];
       acquaticAnimals= new Acquatic[10];
        //animals = new tn.esprit.entities.Animal[25]
       this.name=name;
       this.city=city;
       this.nbrCages = nbrCages;
    }

    public Zoo(){

    }

    //toString
    public  String toString(){
        String s =" ";
        s+=" name :"+this.name +" ";
        s+=" city :"+this.city +" ";
        s+=" nbcages :"+this.nbrCages +" Animals : ";

        for(int i = 0 ;i<=compteurAnimal;i++){
            s+= animals[i];
        }



        return s;
    }

    //display methode
    public void displayZoo(){
        String s =" ";
        s+=" name :"+this.name +" ";
        s+=" city :"+this.city +" ";
        s+=" nbcages :"+this.nbrCages +" Animals : ";

        for(int i = 0 ;i<=compteurAnimal;i++){
            s+= animals[i];
        }


        System.out.println(s);

    }

    public void displayAcquatic(){

        for (int i = 0 ;i<compteurAquatic;i++){

           acquaticAnimals[i].swim();
        }

        }


        public boolean addAnimal(Animal animal){
        if(animals.length>compteurAnimal){
            animals[compteurAnimal] = animal;
            compteurAnimal ++;
            return true;
        }
        return false;


    }
    public void addAquaticAnimal(Acquatic aquatic){
        if(acquaticAnimals.length>compteurAquatic){
            acquaticAnimals[compteurAquatic]=aquatic;
            compteurAquatic++;
        }else {
            System.out.println("Aquatic tab is full");
        }

    }


    public float maxPenguinSwimmingDepth(){
        float max=0f;

        for (int i =0 ; i<compteurAquatic;i++){
            if(acquaticAnimals[i]instanceof Penguin penguin)
            {
                if(max<penguin.getSwimmingdepth()){
                    max=((Penguin) acquaticAnimals[i]).getSwimmingdepth();
                }
            }
        }
        return max;
    }

    public void displayNumberOfAquaticsByType(){

        int nbP=0;
        int nbD=0;
        for (int i =0 ; i<compteurAquatic;i++){
            if(acquaticAnimals[i]instanceof Penguin penguin)
            { nbP++;
            } else if(acquaticAnimals[i]instanceof Dolphin dolphin)
            { nbD++;
            }
        }
        System.out.println("Le ZOO contient "+nbP+" Penguian"+nbD+" Dolphin");
    }








}
