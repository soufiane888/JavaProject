public class Cinema extends Entreprise implements CineInfo {

    private int idCinema;


    @Override
    public void afficheInfo() {
        System.out.println("Le numéro d'itentifiant du cinéma: "+idCinema+" nom : "+this.getNom()+" adresse : "+this.getAdresse());
    }


    public Cinema(int idCinema ,String nom, String adresse ) {
        super(nom, adresse);
        this.idCinema = idCinema;
    }

    public Cinema(int idCinema) {
        this.idCinema = idCinema;
    }

    public int getIdCinema() {
        return idCinema;
    }

    public void setIdCinema(int idCinema) {
        this.idCinema = idCinema;
    }

    @Override
    public String toString() {
        return "Cinema{" +getNom()+"adresse : "+getAdresse()+
                "idCinema=" + idCinema +
                '}';
    }

}
