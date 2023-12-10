package Interface;
import Exception.*;
public interface IGestion<T>  {
     int a= 0 ;
     void ajouterEmploye(T t) throws ExcisteException;
     boolean rechercherEmployeByName(String nom);
     boolean rechercherEmploye(T t) ;
     void supprimerEmploye(T t) throws NonExisteException;
     void displayEmploye();
     void trierEmployeParId();
     void trierEmployeParNomDepartementEtGrade();




}
