public class Personne {

    private int idPersonne;
    private String nom, prenom;

    public Personne() {

    }

    public Personne(int idPersonne, String nom, String prenom) {
        this.idPersonne = idPersonne;
        this.nom = nom;
        this.prenom = prenom;
    }

    public int getIdPersonne() {
        return idPersonne;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setIdPersonne(int idPersonne) {
        this.idPersonne = idPersonne;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public  String toString(){
        return "Je suis la personne avec l'identifiant : "+idPersonne+" le nom : "+nom+" prénom : "
+prenom;
    }

}
