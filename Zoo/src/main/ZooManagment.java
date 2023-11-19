//instruction2
import tn.esprit.entities.*;

public class ZooManagment {
    int nbrCages = 20;
    String zooName="myZoo";

    //la signature de la fonction tn.esprit.test.main
    public static void main(String[] args){
        /*
        //instruction 1s
      ZooManagment zm=new ZooManagment();
     System.out.println(zm.zooName +" comporte "+zm.nbrCages+" Cages");
     //Suite instruction 2
        //Creer un objet scanner
        Scanner s = new Scanner(System.in);
        System.out.print("Saisir le nombre des cages");
        //lire un entier
        zm.nbrCages=s.nextInt();
        System.out.print("Entrer le nom du tn.esprit.entities.Zoo");
        //affecter la chaine dans l'attribut String
         zm.zooName=s.next();

        //Affichage
        System.out.println("votre zoo est"+zm.zooName +" qui comporte "+zm.nbrCages +" cages");
         */

        Animal a = new Animal();
        Zoo zoo = new Zoo();

        a.setName("lion");
        zoo.setName("myzoo");


        Zoo z1 = new Zoo(25,"Frigia","Enfidha",20);

        Animal b = new Animal("chat","kiwi",2,true);
        System.out.println(z1);
        System.out.println("----------------");
        z1.displayZoo();
        System.out.println(z1.addAnimal(b));
        z1.displayZoo();
        Dolphin d = new Dolphin("dolphin","doplhin",2,false,"aa",1);
        //Acquatic ac = new Acquatic("dolphin","doplhin",2,false,"aa");
        Penguin p= new Penguin("dolphin","doplhin",2,false,"aa",20);
        Penguin p2= new Penguin("penguin","penguin",2,false,"aa",20);


        z1.addAquaticAnimal(d);
        z1.addAquaticAnimal(p);
        z1.addAquaticAnimal(p2);


        z1.displayAcquatic();






















    }

}
