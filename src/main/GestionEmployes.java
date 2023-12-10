package main;

import entities.Departement;
import entities.DepartementHashSet;
import entities.Employe;
import entities.SocieteArrayList;
import Exception.*;

import java.util.Arrays;
import java.util.Set;

public class GestionEmployes {
    public static void main(String[] args) {
//        Array List
        System.out.println("+++++++++++++++++ Array List  +++++++++++++++++++++++ ");
        Employe e1 = new Employe(1 , "med" ,"romdhani" , "B3" , 4);
        Employe e2 = new Employe(2 , "ahmed" ,"Mejbri" , "A3" , 5);
        Employe e3 = new Employe(3 , "test" ,"test" , "5A" , 6);
        SocieteArrayList societe = new SocieteArrayList();
        System.out.println("----------- Test Ajouter --------------");
        try {
            societe.ajouterEmploye(e1);
            System.out.println("ajouter avec succes");
        }catch (ExcisteException e){
            System.out.println(e.getMessage());
        }
        try {
            societe.ajouterEmploye(e2);
            System.out.println("ajouter avec succes");
        }catch (ExcisteException e){
            System.out.println(e.getMessage());
        }
        try {
            societe.ajouterEmploye(e3);
            System.out.println("ajouter avec succes");
        }
        catch (ExcisteException e){
            System.out.println(e.getMessage());
        }
        try {
            societe.ajouterEmploye(e3);
            System.out.println("ajouter avec succes");
        }catch (ExcisteException e){

            System.out.println(e.getMessage());
        }
        System.out.println("----------- Test Affichage --------------");
        societe.displayEmploye();
        System.out.println("--------- Test Recherche with name  -------------");
        if (societe.rechercherEmployeByName("med")){
            System.out.println("existe");
        }else{
            System.out.println("n'existe pas");
        }
        if (societe.rechercherEmployeByName("zed")){
            System.out.println("existe");
        }else{
            System.out.println("n'existe pas");
        }
        System.out.println("--------- Test Recherche with empolye -------------");
        Employe e4 = new Employe(8 , "tes1" ,"test1" , "5A" , 6);
        if (societe.rechercherEmploye(e4)){
            System.out.println("existe");
        }else{
            System.out.println("n'existe pas");
        }
        if (societe.rechercherEmploye(e1)){
            System.out.println("existe");
        }else{
            System.out.println("n'existe pas");
        }

        System.out.println("--------- Test Supprimer -------------");
        try {
            societe.supprimerEmploye(e3);
            System.out.println("supprimer avec succes");
        }catch (NonExisteException e){
            System.out.println(e.getMessage());
        }
        try {
            societe.supprimerEmploye(e4);
            System.out.println("supprimer avec succes");
        }catch (NonExisteException e){
            System.out.println(e.getMessage());
        }
        societe.displayEmploye();
        System.out.println("--------- Test Trie par ID------------");
        societe.trierEmployeParId();
        societe.displayEmploye();
        System.out.println("--------- Test Trie par Department puis grade------------");
        societe.trierEmployeParNomDepartementEtGrade();
        societe.displayEmploye();


//      HashSet
        System.out.println("+++++++++++++++++ HashSet +++++++++++++++++++++++");
        Departement d1 = new Departement(1 , "med"  , 4);
        Departement d2 = new Departement(2 , "ahmed" , 5);
        Departement d3 = new Departement(3 , "test" , 6);
        DepartementHashSet departementHashSet = new DepartementHashSet();
        System.out.println("----------- Test Ajouter --------------");
        try{
            departementHashSet.ajouterDepartement(d1);
            System.out.println("ajouter avec succes");
        }catch (ExcisteException e){
            System.out.println(e.getMessage());
        }
        try {
            departementHashSet.ajouterDepartement(d2);
            System.out.println("ajouter avec succes");
        }catch (ExcisteException e){
            System.out.println(e.getMessage());
        }
        try {
            departementHashSet.ajouterDepartement(d3);
            System.out.println("ajouter avec succes");
        }
        catch (ExcisteException e){
            System.out.println(e.getMessage());
        }
        try {
            departementHashSet.ajouterDepartement(d3);
            System.out.println("ajouter avec succes");
        }catch (ExcisteException e){

            System.out.println(e.getMessage());
        }
        System.out.println("----------- Test Affichage --------------");
        departementHashSet.displayDepartement();
        System.out.println("--------- Test Recherche with nom -------------");
        if (departementHashSet.rechercherDepartement("med")){
            System.out.println("existe");
        }else{
            System.out.println("n'existe pas");
        }
        if (departementHashSet.rechercherDepartement("zed")){
            System.out.println("existe");
        }else{
            System.out.println("n'existe pas");
        }

        System.out.println("--------- Test Recherche with departement -------------");
        Departement d4 = new Departement(4 , "tes1" , 8);
        if (departementHashSet.rechercherDepartement(d4)){
            System.out.println("existe");
        }else{
            System.out.println("n'existe pas");
        }
        if (departementHashSet.rechercherDepartement(d1)){
            System.out.println("existe");
        }else{
            System.out.println("n'existe pas");
        }

        System.out.println("--------- Test Supprimer -------------");
        try {
            departementHashSet.supprimerDepartement(d3);
            System.out.println("supprimer avec succes");
        }catch (NonExisteException e){
            System.out.println(e.getMessage());
        }
        try {
            departementHashSet.supprimerDepartement(d4);
            System.out.println("supprimer avec succes");
        }catch (NonExisteException e){
            System.out.println(e.getMessage());
        }
        departementHashSet.displayDepartement();
        System.out.println("--------- Test Trie par ID------------");
        Departement d5 = new Departement(6 , "Daruis"  , 6);
        Departement d6 = new Departement(0 , "Luffy" , 10);

        try {
            departementHashSet.ajouterDepartement(d5);
            System.out.println("ajouter avec succes");
        }catch (ExcisteException e){
            System.out.println(e.getMessage());
        }
        try {
            departementHashSet.ajouterDepartement(d6);
            System.out.println("ajouter avec succes");
        }catch (ExcisteException e){
            System.out.println(e.getMessage());
        }
        departementHashSet.displayDepartement();
        System.out.println(departementHashSet.trierDepartementById());

    }
}
