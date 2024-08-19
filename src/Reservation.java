public class Reservation {
    private Utilisateurs utilisateur;
    private Eventmanage eventmanage;
    private int reservationplace;

    public Reservation(Utilisateurs utilisateur, Eventmanage eventmanage, int reservationplace) {
        this.utilisateur = utilisateur;
        this.eventmanage = eventmanage;
        this.reservationplace = reservationplace;
    }

    public Utilisateurs getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(Utilisateurs utilisateur) {
        this.utilisateur = utilisateur;
    }
    public Eventmanage getEvent() {
        return eventmanage;
    }

    public Eventmanage getEventmanage() {
        return eventmanage;
    }

    public void setEventmanage(Eventmanage eventmanage) {
        this.eventmanage = eventmanage;
    }

    public int getReservationplace() {
        return reservationplace;
    }

    public void setReservationplace(int reservationplace) {
        this.reservationplace = reservationplace;
    }


    @Override
    public String toString() {
        return "Reservation{" +
                "utilisateur=" + utilisateur +
                ", eventmanage=" + eventmanage +
                ", reservationplace=" + reservationplace +
                '}';
    }
}
