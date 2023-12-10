package entities;

import Interface.IDepartement;

import java.util.*;
import Exception.*;
public class DepartementHashSet implements IDepartement<Departement> {

    Set<Departement> departementsSet = new HashSet<>();

    @Override
    public void ajouterDepartement(Departement departement) throws ExcisteException {
        if (!rechercherDepartement(departement) ){
            departementsSet.add(departement);
        }else{
            throw  new ExcisteException("Departement existe");
        }
    }

    @Override
    public boolean rechercherDepartement(String nom) {
        for (Departement departement : departementsSet) {
            if (departement.getNom().equals(nom)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean rechercherDepartement(Departement departement) {
        return departementsSet.contains(departement);
    }

    @Override
    public void supprimerDepartement(Departement departement) throws NonExisteException {
        if (rechercherDepartement(departement)){
            departementsSet.remove(departement);
        }else {
            throw  new NonExisteException("Employer n'existe pas");
        }
    }

    @Override
    public void displayDepartement() {
        for (Departement departement : departementsSet){
            System.out.println(departement);
        }
    }

    @Override
    public TreeSet<Departement> trierDepartementById() {
        return new TreeSet<Departement>(departementsSet);
    }
}
