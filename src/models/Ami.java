package models;

public class Ami {

    // Attributs
    private final String nom;
    private int nmbreBieresSupportable;

    // Constructeur
    public Ami(String nom, int nmbreBieresSupportable) {
        this.nom = nom;
        this.nmbreBieresSupportable = nmbreBieresSupportable;
    }

    // Méthodes
    public void boitUneBiere() {
        if (nmbreBieresSupportable > 0) {
            nmbreBieresSupportable--;
            System.out.println(nom + "boit une bière");
        } else {
            System.out.println(nom + "ne peut plus boire de bière");
        }
    }

    // Getters et Setters
    public String getNom() {
        return nom;
    }

    public int getNmbreBieresSupportables() {
        return nmbreBieresSupportable;
    }

    public void setNbreBieresSupoortables(int nmbreBieresSupportable) {
        this.nmbreBieresSupportable = nmbreBieresSupportable;
    }
}
