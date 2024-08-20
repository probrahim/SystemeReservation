package Gestion;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
//
//
//        Utilisateurs user1 = new Utilisateurs("ibrahim","est",1121);
//        Utilisateurs user2 = new Utilisateurs("hiba","hiba@gmail.com",2020);
//        Traitement c = new Traitement();
//
//        c.inscription(user1);
//        c.inscription(user2);
//        c.login("est",121);
//        c.affichelist();
//        c.logout(user1);
//
//
//        System.out.println("-------------PARTIE D'EVENT------");
//
//        Eventmanage event1 = new Eventmanage("gamesRiot","technopark",new Date(),100);
//        c.ajouterevenemt(event1);
//       // c.deleteevent(event1);
//        c.afficheevent();
//      //  Eventmanage upevent1 = new Eventmanage("gamesRiot","anfa",new Date(),120);
//      //  c.editevent(upevent1);
//        c.afficheevent();
//        Reservation t = user1.getReservations().get(3);
//        c.reserverPlaces(user1,event1,30);
//        c.details();
//
//
//        c.cancalreservation(user1,t);
//        c.details();



        // Create a Traitement object to manage users and events
        Traitement traitement = new Traitement();

        // Create some users
        Utilisateurs user1 = new Utilisateurs("John Doe", "john.doe@example.com", 12345);
        Utilisateurs user2 = new Utilisateurs("Jane Smith", "jane.smith@example.com", 67890);

        // Add users to the system
        traitement.inscription(user1);
        traitement.inscription(user2);

        // Create some events
        Eventmanage event1 = new Eventmanage("Concert", "Stadium", new Date(), 100);
        Eventmanage event2 = new Eventmanage("Conference", "Convention Center", new Date(), 50);

        // Add events to the system
        traitement.ajouterevenemt(event1);
        traitement.ajouterevenemt(event2);

        // Show all users
        System.out.println("Liste des utilisateurs inscrits:");
        traitement.affichelist();

        // Show all events
        System.out.println("\nListe des événements:");
        traitement.afficheevent();

        // Reserve places for user1 in event1
        System.out.println("\nRéservation des places:");
        traitement.reserverPlaces(user1, event1, 10);  // Reserve 10 places for user1

        // Show reservation details
        System.out.println("\nDétails des réservations:");
        traitement.details();

        // Cancel reservation
        System.out.println("\nAnnulation de la réservation:");
        Reservation reservationToCancel = user1.getReservations().get(0);
        traitement.cancalreservation(user1, reservationToCancel);

        // Show reservation details after cancellation
        System.out.println("\nDétails des réservations après annulation:");
        traitement.details();

        // Logout user1
        traitement.logout(user1);
    }
}
