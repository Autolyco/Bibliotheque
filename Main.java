import java.util.List;

import Livre.Livre;
import Bibliotheque.Bibliotheque;

public class Main {
    
    
    public static void main(String[] args) {
        Bibliotheque bliblio = new Bibliotheque();


        bliblio.ajouterLivre(new Livre(
            "Robot Chicken",
            "CHICKEN MAN",
            1947
        ));
        
        bliblio.ajouterLivre(new Livre(
            "Army of the dead",
            "J.B LaFronde",
            1947
        ));

        bliblio.ajouterLivre(new Livre(
            "Boobol",
            "Patrick Sebastien",
            1912
        ));

        bliblio.ajouterLivre(new Livre(
            "RAAAAAAAH",
            "ROOOOOOH",
            2003
        ));

        List<Livre> LivreT = bliblio.rechercherParAuteur("Patrick Sebastien");
     
        for(Livre livre:LivreT) {
            System.out.println(livre.titre);
        }
    }

}