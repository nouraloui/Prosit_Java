package Interface;
import Exception.*;
public interface IGestion<T>  {

    public void ajouterEmploye(T t) throws ExcisteException;
    public boolean rechercherEmployeByName(String nom);
    public boolean rechercherEmploye(T t) ;
    public void supprimerEmploye(T t) throws NonExisteException;
    public void displayEmploye();
    public void trierEmployeParId();
    public void trierEmployeParNomDepartementEtGrade();
}
