package org.allClasses;

import java.time.LocalDate;

public class Depense {
    private String description;
    private double montant;
    private Categories categorie;
    private LocalDate date;

    public enum Categories {
        NOURRITURE_ET_RESTAURATION,
        TRANSPORT,
        DIVERTISSEMENT,
        SERVICES_PUBLICS,
        AUTRES
    }

    public Depense(String description, double montant, Categories categorie, LocalDate date) {
        this.description = description;
        this.montant = montant;
        this.categorie = categorie;
        this.date = LocalDate.now();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getMontant() {
        return montant;
    }
    public LocalDate getDate() {
        return date;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public Categories getCategorie() {
        return categorie;
    }

    public void setCategorie(Categories categorie) {
        this.categorie = categorie;
    }
    public void setDate(LocalDate date) {
        this.date = date;
    }
}

