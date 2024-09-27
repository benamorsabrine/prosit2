import java.util.ArrayList;
import java.util.List;

public class Magasin {
    int identifiant;
    String adresse;
    int capacite;
    List<Produit> produits;
    Produit[] tab = new Produit[capacite];
    public static final int CAPACITE_MAX = 50;

    public Magasin(int id, String adresse) {
        this.identifiant = id;
        this.adresse = adresse;
        this.capacite = 0;
        this.produits = new ArrayList<>();
    }

    public boolean ajouterProduit(Produit produit) {
        if (capacite < CAPACITE_MAX) {
            produits.add(produit);
            capacite++;
            return true;
        } else {
            System.out.println("Erreur: Le magasin a atteint sa capacité maximale.");
            return false;
        }
    }

    public void afficherCaracteristiques() {
        System.out.println("Magasin [ID=" + identifiant + ", Adresse=" + adresse + ", Capacité=" + capacite + "/"
                + CAPACITE_MAX + "]");
        System.out.println("Produits:");
        for (Produit produit : produits) {
            // Accès direct aux attributs publics
            System.out.println(" - libelle: " + produit.libelle + ", Prix: " + produit.prix);
        }
    }

    public int getNombreProduits() {
        return capacite;
    }
}