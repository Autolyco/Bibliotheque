package Bibliotheque;
import Livre.Livre;

import java.util.ArrayList;
import java.util.List;

public class Bibliotheque {
    
    List<Livre> listeLivres;

    public Bibliotheque() {
        this.listeLivres = new ArrayList<>();
    }

    public void ajouterLivre(Livre livre){
        listeLivres.add(livre);
    }
    
    public void afficherLivres() {
        System.out.println("Liste de livres dans la bibliothèque :");

        for (Livre livre : listeLivres) {
            System.out.println("Titre :" + livre.titre + ", Auteur :" + livre.auteur + ", Anne de publication :" + livre.anneePublication);
        }
    }

    public List<Livre> rechercherParAuteur(String auteur) {
        List<Livre> livresTrouves = new ArrayList<>();

        for (Livre livre : listeLivres){
            if (livre.auteur.equals(auteur)) {
                livresTrouves.add(livre);
            }
        }

        return livresTrouves;
    }
}