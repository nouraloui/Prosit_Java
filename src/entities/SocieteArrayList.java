package entities;

import Interface.IGestion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import Exception.*;
public class SocieteArrayList implements IGestion<Employe> {
    List<Employe> employeList;

    public SocieteArrayList() {
        this.employeList = new ArrayList<>();
    }

    @Override
    public void ajouterEmploye(Employe e)  throws ExcisteException {
       if (!rechercherEmploye(e) ){
           employeList.add(e);
       }else{
           throw  new ExcisteException("Employer existe");
       }

    }

    @Override
    public boolean rechercherEmployeByName(String nom) {
     for (Employe e : employeList){
        if (e.getNom().equals(nom)) {
            return true;
        }
     }
        return false;
    }

    @Override
    public boolean rechercherEmploye(Employe e) {
        return employeList.contains(e);
    }

    @Override
    public void supprimerEmploye(Employe e) throws NonExisteException {
         if (rechercherEmploye(e)){
             employeList.remove(e);
         }else {
             throw  new NonExisteException("Employer n'existe pas");
         }
    }

    @Override
    public void displayEmploye() {
      for (Employe e : employeList){
          System.out.println(e);
      }
    }

    @Override
    public void trierEmployeParId() {
        Collections.sort(employeList);
    }

    @Override
    public void trierEmployeParNomDepartementEtGrade() {
        Comparator<Employe> comparatorDepartement = new Comparator<Employe>() {
            @Override
            public int compare(Employe e1, Employe e2) {

                return  e1.getDepartement().compareTo(e2.getDepartement())  ;
            }
        };
        Comparator<Employe> comparatorGrade = new Comparator<Employe>() {
            @Override
            public int compare(Employe e1, Employe e2) {
                return e1.getGrade() - e2.getGrade()  ;
            }
        };

        employeList.sort(comparatorDepartement.thenComparing(comparatorGrade));


    }



}
