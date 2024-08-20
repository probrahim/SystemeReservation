package Gestion;
import java.util.Date;

public class Eventmanage {
    private String eventName;
    private String lieuName;
    private Date date;
    private int nombrePlace;
    private int placereserver;

    public Eventmanage(String eventName, String lieuName, Date date, int nombrePlace) {
        this.eventName = eventName;
        this.lieuName = lieuName;
        this.date = date;
        this.nombrePlace = nombrePlace;
    }

    public int getPlacereserver() {
        return placereserver;
    }

    public void setPlacereserver(int placereserver) {
        this.placereserver = placereserver;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getLieuName() {
        return lieuName;
    }

    public void setLieuName(String lieuName) {
        this.lieuName = lieuName;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getNombrePlace() {
        return nombrePlace;
    }

    public void setNombrePlace(int nombrePlace) {
        this.nombrePlace = nombrePlace;
    }

    public int getDisponibilite() {
        return nombrePlace - placereserver;
    }
    public void placesreservation(int place){
        if (placereserver <= getDisponibilite()){
            placereserver += place;

        }
        else {
            System.out.println(" // #PLACE INCOMPATIBLE# //");
        }
    }
    public void reserveationannulation(int place){
        if ( placereserver <= getDisponibilite()) {
            placereserver -= place;
        }else {
            System.out.println(" // Nombre de places à annuler //");
        }

    }

    @Override
    public String toString() {
        return "Eventmanage{" +
                "eventName='" + eventName + '\'' +
                ", lieuName='" + lieuName + '\'' +
                ", date=" + date +
                ", nombrePlace=" + nombrePlace +
                ", placereserver=" + placereserver +
                '}';
    }
}
