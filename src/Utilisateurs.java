import java.util.ArrayList;
import java.util.List;

public class Utilisateurs {
    private String nom;
    private String email;
    private int motdepasse;
    private List<Reservation> reservations = new ArrayList<Reservation>();

    public Utilisateurs(String nom, String email, int motdepasse) {
        this.nom = nom;
        this.email = email;
        this.motdepasse = motdepasse;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail() {
        this.email = email;
    }

    public int getMotdepasse() {
        return motdepasse;
    }

    public void setMotdepasse(int motdepasse) {
        this.motdepasse = motdepasse;
    }
    public void ajouterReservation(Reservation reservation) {
        this.reservations.add(reservation);
    }
    public void annulaionReservation(){
        this.reservations.remove(reservations);
    }

    @Override
    public String toString() {
        return "Utilisateurs{" +
                "nom='" + nom + '\'' +
                ", email='" + email + '\'' +
                ", motdepasse=" + motdepasse +
                '}';
    }
}
