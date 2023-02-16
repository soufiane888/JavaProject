import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {




    public static void main(String[] args) {

        try {
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/cinebase_soufiane","root", "");
            System.out.println("=======================================================================");
            System.out.println("Afficher les personnes dont le nom commence par la lettre « S » : ");
            Statement statement = c.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM personne where nom like 's%'");
           while (resultSet.next()){
                System.out.println(resultSet.getInt(1)+" | nom : "+resultSet.getString("nom")+" | prénom : "+resultSet.getString(2));
            }
            System.out.println("***********************************************************************");
            System.out.println("Afficher les films dont le titre contient le mot «blanc» : ");

            ResultSet resultBlanc = statement.executeQuery("SELECT * FROM film where titre like '%blanc%'");
            while (resultBlanc.next()){
                System.out.println("le titre du film qui contient le mot <<blanc>> est : "+resultBlanc.getString("titre"));
            }

            // Créer une ArrayList de personnes
        ArrayList<Personne> listePerso = new ArrayList<>();

        // Ajouter des personnes à la liste
        Personne personne1 = new Personne(1, "Doe", "John");
        listePerso.add(personne1);
        Personne personne2 = new Personne(2, "Jean", "Dupont");
        listePerso.add(personne2);
        // Créer une ArrayList de films
        ArrayList<Film> listeFilm = new ArrayList<>();

        // Ajouter des films à la liste
        Film film1 = new Film( 12,125,1972, "Le Parrain","Drame" );
        listeFilm.add(film1);
        Film film2 = new Film(45,155,1999, "Batman","Fantastic" );
        listeFilm.add(film2);
        // Créer une ArrayList de cinémas
        ArrayList<Cinema> listeCinema = new ArrayList<Cinema>();
            System.out.println("***********************************************************************");

            // Parcourir la liste de personnes et afficher leurs noms
            for (Personne personne : listePerso) {
                // System.out.println(personne.toString());
                System.out.println("Nom : "+personne.getNom() + " | " + " Prénom : "+ personne.getPrenom());
            }


        // Demander à l'utilisateur de saisir les informations pour le premier cinéma
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez l'identifiant du premier cinéma : ");
        int idCinema1 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Entrez le nom du premier cinéma : ");
        String nomCinema1 = scanner.nextLine();
        System.out.println("Entrez l'adresse du premier cinéma : ");
        String adresseCinema1 = scanner.nextLine();

       // Créer un statement pour insérer à la BD cinéma à partir des informations saisies
        PreparedStatement ps1 = c.prepareStatement( "INSERT INTO cinema values(?, ?, ?)");

        // Créer un objet Cinéma pour le premier cinéma à partir des informations saisies
        Cinema cinema1 = new Cinema(idCinema1, nomCinema1, adresseCinema1);
        listeCinema.add(cinema1);

        // Demander à l'utilisateur de saisir les informations pour le deuxième cinéma
        System.out.println("Entrez l'identifiant du deuxième cinéma : ");
        int idCinema2 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Entrez le nom du deuxième cinéma : ");
        String nomCinema2 = scanner.nextLine();
        System.out.println("Entrez l'adresse du deuxième cinéma : ");
        String adresseCinema2 = scanner.nextLine();
        Cinema cinema2 = new Cinema(idCinema2, nomCinema2, adresseCinema2);
        listeCinema.add(cinema2);

            ps1.setInt(1,idCinema1);
            ps1.setString(2,nomCinema1);
            ps1.setString(3,adresseCinema1);
           int rs2 =  ps1.executeUpdate();
            System.out.println(rs2);

            System.out.println("**************************************************************************");

            // Parcourir la liste de cinémas et afficher leurs noms
            for (Cinema cinema : listeCinema) {
                cinema.afficheInfo();
                //System.out.println(cinema.getNom() + " (" + cinema.getAdresse() + ")");
            }
System.out.println("**************************************************************************");
        // Créer un objet Cinéma pour le troisième cinéma à partir des informations saisies

            // Demander à l'utilisateur de saisir les informations pour le troisième cinéma
            System.out.println("Entrez l'identifiant cinéma que vous voulez changer le nom : ");
            int idCinema3 = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Entrez le nouveau nom du cinéma : ");
            String nomCinema3 = scanner.nextLine();
            PreparedStatement cin3 = c.prepareStatement( "UPDATE cinema SET nom = ? WHERE idCinema = ?");
            cin3.setString(1,nomCinema3);
            cin3.setInt(2,idCinema3);

            int rs3 = cin3.executeUpdate();


            System.out.println("**************************************************************************");
            System.out.println("Supprimer les projections pour l’idFilm = 3 : ");
         /*   PreparedStatement proj1 = c.prepareStatement( "DELETE FROM projection WHERE idFilm = ?");
            int idp = 3;
            proj1.setInt(1,idp);

            int rs4 = proj1.executeUpdate();
*/






        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}