package org.allClasses;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Utilisateur {
    private String nom;
    private double budgetMensuel;
    private List<Depense> depenses;

    public Utilisateur(String nom, double budgetMensuel, List<Depense> depenses) {
        this.nom = nom;
        this.budgetMensuel = budgetMensuel;
        this.depenses = new ArrayList<>();
    }

    public String getNom() {
        return nom;
    }

    public double getBudgetMensuel() {
        return budgetMensuel;
    }

    public List<Depense> getDepenses() {
        return depenses;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setBudgetMensuel(double budgetMensuel) {
        this.budgetMensuel = budgetMensuel;
    }

    public void setDepenses(List<Depense> depenses) {
        this.depenses = depenses;
    }

    public void ajouterDepense(String description, double montant, Depense.Categories categorie, LocalDate date) {
        if(montant < 0) {
            System.out.println("Le montant ne peut pas être négatif");
        }
        depenses.add(new Depense(description, montant, categorie, date));
    }

    public void obtenirDepenseParCategorie(Depense.Categories categorie) {
        List<Depense> depenseFiltrer = new ArrayList<>();
         for(Depense depense : depenses) {
             if(depense.getCategorie().equals(categorie)) {
                 depenseFiltrer.add(depense);
             }
         }
         for(Depense depense : depenseFiltrer) {
             System.out.println(depense);
         }
    }

    public double obtenirDepenseTotalCeMois() {
        Month ceMois = LocalDate.now().getMonth();

        return depenses.stream()
                .filter(element -> element.getDate().getMonth() == ceMois)
                .map(element -> element.getMontant())
                .reduce(0.0, (prev, curr) -> prev + curr);
    }

    public double obtenirBudgetRestant() {

    }
}
