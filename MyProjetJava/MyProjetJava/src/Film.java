public class Film {

    private int idFilm, idRealisateur, annee;
    private String titre,genre;

    public Film() {
    }

    public Film(int idFilm, int idRealisateur, int annee, String titre, String genre) {
        this.idFilm = idFilm;
        this.idRealisateur = idRealisateur;
        this.annee = annee;
        this.titre = titre;
        this.genre = genre;
    }

    public int getIdFilm() {
        return idFilm;
    }

    public int getIdRealisateur() {
        return idRealisateur;
    }

    public int getAnnee() {
        return annee;
    }

    public String getTitre() {
        return titre;
    }

    public String getGenre() {
        return genre;
    }

    public void setIdFilm(int idFilm) {
        this.idFilm = idFilm;
    }

    public void setIdRealisateur(int idRealisateur) {
        this.idRealisateur = idRealisateur;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public  String toString(){
        return "Le film : "+titre+" à l'identifiant : "+idFilm+" le realisateur : "+idRealisateur+" genre : "
                +genre+ "sotrie en : "+annee;

    }

    public  boolean equals(Film f){
        if(this.idFilm==f.idFilm) {
            return true;
        }else {
            return false;
        }
    }


}
