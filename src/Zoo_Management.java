import java.util.Scanner;

public class ZooManagement {
    public static void main(String[] args){
        //-------------------------------- Prosit 1 -------------------------------------//

        /*int nbrCages = 20;
        String zooName = "my zoo";

        System.out.println(zooName + " comporte " + nbrCages + " cages");

        Scanner scn = new Scanner(System.in);
        Scanner scn1 = new Scanner(System.in);

        System.out.println("Entrer le nombre de cages: ");
        nbrCages = scn.nextInt();
        System.out.println("Enterer le nom du zoo: ");
        zooName = scn1.nextLine();

        System.out.println(zooName + " comporte " + nbrCages + " cages");*/


        //-------------------------------- Prosit 2 -------------------------------------//

        Zoo myZoo = new Zoo("myZoo", "Tunis");
        Zoo myZoo2 = new Zoo("myZoo2", "Ben Gerdan");
        Zoo result;
        Animal a1 = new Animal("Otariidae", "Lion", 10, true);
        Animal a2 = new Animal("Canidae", "Wolf", 8, false);
        Animal a3 = new Animal("Canidae", "Wolf", 20, false);
        Animal a4 = new Animal("Otariidae", "Lion", 10, true); //identique de a1 pour vérifier addAnimal() function and searchAnimal()

        //myZoo.displayZoo();
        //System.out.println(myZoo);

        myZoo.addAnimal(a1);
        myZoo.addAnimal(a2);
        myZoo.addAnimal(a3);
        System.out.println(myZoo.addAnimal(a4));
        myZoo.displayZoo();

        myZoo.removeAnimal(a1);
        myZoo.displayZoo();
        System.out.println(myZoo.isZooFull()); //False because myZoo ain't full.
        result = myZoo.comparerZoo(myZoo, myZoo2);
        System.out.println("La résultat de comparerZoo() est: " + result.name);
    }
}
