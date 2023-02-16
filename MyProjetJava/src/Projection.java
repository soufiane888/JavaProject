public class Projection implements CineInfo {

   private int  idCinema, idFilm;
   private String jour;

    public Projection(int idCinema, int idFilm, String jour) {
        this.idCinema = idCinema;
        this.idFilm = idFilm;
        this.jour = jour;
    }

    public int getIdCinema() {
        return idCinema;
    }

    public void setIdCinema(int idCinema) {
        this.idCinema = idCinema;
    }

    public int getIdFilm() {
        return idFilm;
    }

    public void setIdFilm(int idFilm) {
        this.idFilm = idFilm;
    }

    public String getJour() {
        return jour;
    }

    public void setJour(String jour) {
        this.jour = jour;
    }

    @Override
    public String toString() {
        return "Projection{" +
                "idCinema=" + idCinema +
                ", idFilm=" + idFilm +
                ", jour='" + jour + '\'' +
                '}';
    }


    @Override
    public void afficheInfo() {
        System.out.println("La projection  : "+idCinema+"Film : "+idFilm+" jour : "+jour);
    }
}
