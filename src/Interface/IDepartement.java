package Interface;

import java.util.TreeSet;
import Exception.*;
public interface IDepartement<T>{

    public void ajouterDepartement(T t) throws ExcisteException;
    public boolean rechercherDepartement(String nom);
    public boolean rechercherDepartement(T t) ;
    public void supprimerDepartement(T t) throws NonExisteException;
    public void displayDepartement();
    public TreeSet<T> trierDepartementById();
}
