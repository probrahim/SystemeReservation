package Gestion;

import java.util.Date;

public class TEST2 {
    public static void main(String[] args) {
        Paiements paiement1 = new Paiements(123, "2024-08-20", 1112345, "John Doe");
        Paiements paiement2 = new Paiements(456, "2024-08-21", 1112345, "Jane Smith");

        // Création d'une instance de Traitement
        Traitement traitement = new Traitement();

        // Création d'instances de Utilisateurs, Eventmanage, et Reservation
        Utilisateurs utilisateur1 = new Utilisateurs("John Doe", "john.doe@example.com", 1234);
        Utilisateurs utilisateur2 = new Utilisateurs("Jane Smith", "jane.smith@example.com", 5678);

        Eventmanage event1 = new Eventmanage("Concert", "Salle de Concert", new Date(), 100);
        Eventmanage event2 = new Eventmanage("Exposition", "Musée", new Date(), 50);

        // Inscription des utilisateurs
        traitement.inscription(utilisateur1);
        traitement.inscription(utilisateur2);

        // Ajout d'événements
        traitement.ajouterevenemt(event1);
        traitement.ajouterevenemt(event2);

        // Affichage des utilisateurs et événements
        System.out.println("Liste des utilisateurs:");
        traitement.affichelist();
        System.out.println("\nListe des événements:");
        traitement.afficheevent();
        paiement1.ajoutermoyenpay(paiement1);
        paiement2.ajoutermoyenpay(paiement2);
        // Réservation de places
        Paiements p1 = new Paiements(123, "2024-08-20", 1112345, "John Doe");
        traitement.reserverPlaces(utilisateur1, event1, 2, 50.0, p1);
        traitement.reserverPlaces(utilisateur2, event2, 1, 30.0, paiement2);

        // Affichage des détails des réservations
        System.out.println("\nDétails des réservations:");
        traitement.details();

        // Vérification avant annulation
        if (!utilisateur1.getReservations().isEmpty()) {
            Reservation reservationToCancel = utilisateur1.getReservations().get(0); // On annule la première réservation de l'utilisateur
            traitement.cancalreservation(utilisateur1, reservationToCancel);
        } else {
            System.out.println("Aucune réservation à annuler pour l'utilisateur.");
        }

        // Affichage après annulation
        System.out.println("\nDétails des réservations après annulation:");
        traitement.details();
    }
}

