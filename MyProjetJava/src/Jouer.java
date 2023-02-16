public class Jouer {

    private int  idActeur, idFilm;
    private String role;

    public Jouer() {
    }

    public Jouer(int idActeur, int idFilm, String role) {
        this.idActeur = idActeur;
        this.idFilm = idFilm;
        this.role = role;
    }

    public int getIdActeur() {
        return idActeur;
    }

    public void setIdActeur(int idActeur) {
        this.idActeur = idActeur;
    }

    public int getIdFilm() {
        return idFilm;
    }

    public void setIdFilm(int idFilm) {
        this.idFilm = idFilm;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
    public  String toString(){
        return "Je suis l'acteur avec l'identifiant : "+idActeur+" l'identifiant du film : "+idFilm+" role:  "
                +role;
    }

}
