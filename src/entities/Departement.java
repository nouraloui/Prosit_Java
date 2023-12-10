package entities;

import Interface.IDepartement;

import java.util.Objects;
import java.util.TreeSet;

public class Departement  implements Comparable<Departement> {
    private int id;
    private String nom;
    private int nb_employee ;

    public Departement() {
    }

    public Departement(int id, String nom, int nb_employee) {
        this.id = id;
        this.nom = nom;
        this.nb_employee = nb_employee;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setNb_employee(int nb_employee) {
        this.nb_employee = nb_employee;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public int getNb_employee() {
        return nb_employee;
    }


    @Override
    public String toString() {
        return "Departement{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", nb_employee=" + nb_employee +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Departement that = (Departement) o;
        return id == that.id && Objects.equals(nom, that.nom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nom);
    }


    @Override
    public int compareTo(Departement o) {
        return this.id - o.id;
    }
}
