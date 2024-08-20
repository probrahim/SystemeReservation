package Gestion;

import java.util.ArrayList;
import java.util.List;

public class Paiements {
    private double montant;
    private boolean paiement;
    private String name;
    private int numrocarte;
    private String datefinal;
    private int csv;
    List<Paiements> paiements;

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public boolean isPaiement() {
        return paiement;
    }

    public void setPaiement(boolean paiement) {
        this.paiement = paiement;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumrocarte() {
        return numrocarte;
    }

    public void setNumrocarte(int numrocarte) {
        this.numrocarte = numrocarte;
    }

    public String getDatefinal() {
        return datefinal;
    }

    public void setDatefinal(String datefinal) {
        this.datefinal = datefinal;
    }

    public int getCsv() {
        return csv;
    }

    public void setCsv(int csv) {
        this.csv = csv;
    }

    public List<Paiements> getPaiements() {
        return paiements;
    }

    public void setPaiements(List<Paiements> paiements) {
        this.paiements = paiements;
    }

    public Paiements(int csv, String datefinal, int numrocarte, String name) {
        this.paiements = new ArrayList<>();
        this.csv = csv;
        this.datefinal = datefinal;
        this.numrocarte = numrocarte;
        this.name = name;
    }
    public void ajoutermoyenpay(Paiements paiements1) {
        if (String.valueOf(paiements1.getNumrocarte()).length() >= 5){
            paiements.add(paiements1);
            System.out.println(" MESSAGE SYSTEM : CARTE AJOUTER AVEC SUCCES");
        }
        System.out.println("Votre cordonner incomplet".toUpperCase());

    }





    public Paiements(double montant) {
        this.montant = montant;
        this.paiement = false;
        this.paiements = new ArrayList<>();
    }

    public boolean efucterpaimnet(Paiements paiements1) {

        for ( Paiements paiements2 : paiements) {
            if (paiements2.getNumrocarte() == paiements1.getNumrocarte() && paiements2.getDatefinal().equals(paiements1.getDatefinal())
                    && paiements2.getCsv() == paiements1.getCsv() ) {
                if (montant > 0) {
                    this.paiement = true;
                    System.out.println("Paiement\t" + montant + "\teffectue avec succes");
                    return true;

                } else{
                    this.paiement = false;
                    System.out.println("ERREUR DE PAIEMENT");
                    return false;
                }

            }


        }
        System.out.println("paiment not trouve".toUpperCase());
        return false;
    }

    public boolean isPaiementEffectue(){
        return paiement;
    }

    @Override
    public String toString() {
        return "Paiements{" +
                "montant=" + montant +
                ", paiement=" + paiement +
                '}';
    }
}
