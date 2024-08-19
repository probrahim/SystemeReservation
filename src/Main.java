import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        Utilisateurs user1 = new Utilisateurs("ibrahim","est",1121);
        Utilisateurs user2 = new Utilisateurs("hiba","hiba@gmail.com",2020);
        Traitement c = new Traitement();

        c.inscription(user1);
        c.inscription(user2);
        c.login("est",121);
        c.affichelist();
        c.logout(user1);


        System.out.println("-------------PARTIE D'EVENT------");

        Eventmanage event1 = new Eventmanage("gamesRiot","technopark",new Date(),100);
        c.ajouterevenemt(event1);
       // c.deleteevent(event1);
        c.afficheevent();
      //  Eventmanage upevent1 = new Eventmanage("gamesRiot","anfa",new Date(),120);
      //  c.editevent(upevent1);
        c.afficheevent();
        Reservation t = new Reservation(user1,event1,30);

        c.reserverPlaces(user1,event1,30);
        c.details();


        c.cancalreservation(user1,t);
        c.details();
    }
}