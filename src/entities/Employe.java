package entities;

import java.util.Objects;

public class Employe implements Comparable<Employe> {
    private int id ;
    private String nom ;
    private String prenom ;
    private String departement;
    private int grade ;

    public Employe() {
    }

    public Employe(int id, String nom, String prenom, String departement, int grade) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.departement = departement;
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getDepartement() {
        return departement;
    }

    public void setDepartement(String departement) {
        this.departement = departement;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employe employe = (Employe) o;
        return id == employe.id  && nom.equals(employe.nom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nom, prenom, departement, grade);
    }

    @Override
    public String toString() {
        return "Employé{" +
                "ide=" + this.id +
                ", nom='" + this.nom + '\'' +
                ", prénom='" + this.prenom + '\'' +
                ", deartement='" +  this.departement + '\'' +
                ", grade=" +  this.grade +
                '}';
    }

    @Override
    public int compareTo(Employe e) {
        return this.getId() - e.getId();
    }
}
