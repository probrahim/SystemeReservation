package Gestion;
public interface Gestionutlisateurs {


    // pour la gestion d'utilsateur
    void inscription(Utilisateurs utilisateur);
    void login(String email, int password);
    void logout(Utilisateurs utilisateur);
    void affichelist();

    //Gestion des Événements

    void ajouterevenemt(Eventmanage eventmanage);
    void editevent(Eventmanage eventmanage);
    void deleteevent(Eventmanage eventmanage);
    void afficheevent();
}
