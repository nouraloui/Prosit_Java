package main;

import entities.Employe;
import entities.SocieteArrayList;
import Exception.*;
public class GestionEmployes {
    public static void main(String[] args) {
        Employe e1 = new Employe(9 , "med" ,"romdhani" , "B3" , 4);
        Employe e2 = new Employe(2 , "ahmed" ,"Mejbri" , "A3" , 5);
        Employe e3 = new Employe(3 , "test" ,"test" , "5A" , 6);
        SocieteArrayList societe = new SocieteArrayList();
        try {
            societe.ajouterEmploye(e1);
        }catch (ExcisteException e){
            System.out.println(e.getMessage());
        }
        try {
            societe.ajouterEmploye(e2);
        }catch (ExcisteException e){
            System.out.println(e.getMessage());
        }
        try {
            societe.ajouterEmploye(e3);
        }catch (ExcisteException e){
            System.out.println(e.getMessage());
        }
        try {
            societe.ajouterEmploye(e3);
        }catch (ExcisteException e){
            System.out.println("----------- Test Ajouter --------------");
            System.out.println(e.getMessage());
        }
        societe.displayEmploye();
        System.out.println("--------- Test Recherche -------------");
        System.out.println(societe.rechercherEmployeByName("aa"));
        Employe e4 = new Employe(8 , "tes1" ,"test1" , "5A" , 6);
        System.out.println(societe.rechercherEmploye(e4));
        System.out.println("--------- Test Supprimer -------------");
        try {
            societe.supprimerEmploye(e3);
        }catch (NonExisteException e){
            System.out.println(e.getMessage());
        }
        societe.displayEmploye();
        System.out.println("--------- Test Trie par ID------------");
        societe.trierEmployeParId();
        societe.displayEmploye();
        System.out.println("--------- Test Trie par Department ou grade------------");
        societe.trierEmployeParNomDepartementEtGrade();
        societe.displayEmploye();


    }
}
