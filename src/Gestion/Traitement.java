package Gestion;
import java.util.ArrayList;
import java.util.List;

public class Traitement  implements Gestionutlisateurs{
    List<Utilisateurs> utilisateurs;
    List<Eventmanage> eventmanage;
    List<Reservation> reservations;
    public Traitement() {
        utilisateurs = new ArrayList<Utilisateurs>();
        eventmanage = new ArrayList<>();
        reservations = new ArrayList<>();
    }
    @Override
    public void inscription(Utilisateurs utilisateur) {
        utilisateurs.add(utilisateur);
    }

    @Override
    public void login(String email, int password) {
        for (Utilisateurs utilisateur : utilisateurs) {
            if (utilisateur.getEmail() == email && utilisateur.getMotdepasse() == password) {
                System.out.println("LOGIN SUCESS");
                return;
            }
        }
        System.out.println("LOGIN FAILURE");
    }
    @Override
    public void affichelist(){
        for (Utilisateurs utilisateur : utilisateurs) {
            System.out.println(utilisateur);
        }
    }
    @Override
    public void logout(Utilisateurs utilisateur) {
        System.out.println("LOGOUT SUCESS  :"+ utilisateur.getNom());
    }

    @Override
    public void ajouterevenemt(Eventmanage event){
        eventmanage.add(event);
    }
    @Override

    public void editevent(Eventmanage event){
        for (Eventmanage evente : eventmanage) {
            if (evente.getEventName().equals(event.getEventName())) {
                evente.setLieuName(event.getLieuName());
                evente.setDate(event.getDate());
                evente.setNombrePlace(event.getNombrePlace());
                return;
            }
        }
        System.out.println("EVENT NOT FOUND");
    }
    public void deleteevent(Eventmanage event){
        eventmanage.remove(event);
    }

    @Override
    public void afficheevent(){
        for (Eventmanage evente : eventmanage){
            System.out.println(evente);
        }
    }



    public void reserverPlaces(Utilisateurs utilisateurs,Eventmanage event,int place){
        if(event.getDisponibilite() >= place){
            event.setNombrePlace(event.getNombrePlace() - place);
            event.placesreservation(place);
            Reservation reservation1 = new Reservation(utilisateurs,event,place);
            utilisateurs.ajouterReservation(reservation1);
            reservations.add(reservation1);
            System.out.println("RESERVATION ADDED");

        }
        else {
            System.out.println("RESERVER PLACE FAILURE : PAS ASSER DE PLACE");
        }
    }

    public void cancalreservation(Utilisateurs utilisateurs,Reservation reservation){
        if (utilisateurs.getReservations().remove(reservation)){
            reservation.getEvent().reserveationannulation(reservation.getReservationplace());
            reservations.remove(reservation);
            System.out.println("RESERVATION REMOVED");
        }
        else{
            System.out.println("RESERVATION NOT FOUND");
        }
    }
    public void details(){
        for (Reservation reservation : reservations) {
            System.out.println(reservation);
        }
    }


    @Override
    public String toString() {
        return "Traitement{" +
                "utilisateurs=" + utilisateurs +
                ", eventmanage=" + eventmanage +
                ", reservations=" + reservations +
                '}';
    }
}
