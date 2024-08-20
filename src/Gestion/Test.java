package Gestion;

import java.util.Date;

public class Test {
    public static void main(String[] args) {
        Traitement calcul = new Traitement();

        // users


        Utilisateurs user1 = new Utilisateurs("ibrahim","ibrahim@gmail.com",1250);
        Utilisateurs user2 = new Utilisateurs("abdou","abdou@gmail.com",1220);


        calcul.inscription(user1);
        calcul.inscription(user2);
        calcul.login("ibrahim@gmail.com",1250);
        System.out.println("--LIST OF USERS---");
        calcul.affichelist();

        // etape de creation des evenement


        Eventmanage event1 = new Eventmanage("Event1","place1",new Date(),150);
        Eventmanage event2 = new Eventmanage("Event2","place2",new Date(),100);

        // add event

        calcul.ajouterevenemt(event1);
        calcul.ajouterevenemt(event2);


        System.out.println("--LIST OF EVENTS---");
        calcul.afficheevent();


        // etape de reservation

        calcul.reserverPlaces(user1,event1,150);
        calcul.reserverPlaces(user2,event2,30);
        System.out.println("--LIST OF EVENTS && PLACE RESERVER---");

        calcul.afficheevent();


        // annuler une reservation

        System.out.println("--^^^^^^^^---");
        Reservation cancal = user1.getReservations().get(0);
        calcul.cancalreservation(user1,cancal);

        calcul.details();
        System.out.println("--LIST OF RESERVATIONS---");

        calcul.afficheevent();







    }
}
