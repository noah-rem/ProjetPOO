package Entreprise;

import java.sql.SQLException;

public class Event {


    //Variable de la class Event
    private int idEvent;
    private String Type;
    private String Lieu;
    private boolean Presence;
    



    /**
     * Constructeur de la class Event
     * @param Type
     * @param Lieu
     * @param Presence

     */
    public Event(String Type, String Lieu, boolean Presence ) {
        this.Type = Type;
        this.Lieu = Lieu;
        this.Presence = Presence;

    }

    //Getter and Setter de la class Event
    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public String getLieu() {
        return Lieu;
    }

    public void setLieu(String Lieu) {
        this.Lieu = Lieu;
    }

    public boolean isPresence() {
        return Presence;
    }

    public void setPresence(boolean Presence) {
        this.Presence = Presence;
    }

    public int getIdEvent() {
        return idEvent;
    }

    public void setIdEvent(int idEvent) {
        this.idEvent = idEvent;
    }



    // ToString de la class Event
    @Override
    public String toString() {
        return "Event{" +
                "Type='" + Type + '\'' +
                ", Lieu='" + Lieu + '\'' +
                ", Presence=" + Presence +
                '}';
    }

    // Fonction permettant l'ajout d'un Event à la BDD

    /**
     * Fonction permettant l'ajout d'un Event à la BDD
     * @param Type
     * @param Lieu
     * @param Presence
     * @throws SQLException
     */
    public void EventAddBDD(String Type, String Lieu, boolean Presence ) throws SQLException {

    }
    // Fonction permettant de supprimer un Event de la BDD

    /**
     * Fonction permettant de supprimer un Event de la BDD
     * @param ligne
     * @throws SQLException
     */
    public void EventRemoveBDD(int ligne) throws SQLException {

    }
    // Fonction permettant de modifier les valeurs d'un Event puis les changer sur la BDD

    /**
     * Fonction permettant de modifier les valeurs d'un Event puis les changer sur la BDD
     * @param Type
     * @param Lieu
     * @param Presence
     * @throws SQLException
     */
    public void EventModifBDD(String Type, String Lieu, boolean Presence ) throws SQLException {

    }
}
