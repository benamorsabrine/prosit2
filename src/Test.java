import java.util.Date;

public class Test {
    public static void main(String[] arg) {

        Produit p1 = new Produit();

        System.out.println("id :" + p1.identifiant);
        System.out.println("marque :" + p1.marque);
        System.out.println("libelle :" + p1.libelle);
        System.out.println("prix :" + p1.prix);

        Produit p2 = new Produit(1024, "Delice", "Lait");
        System.out.println("id :" + p2.identifiant);
        System.out.println("marque :" + p2.marque);
        System.out.println("libelle :" + p2.libelle);
        System.out.println("prix :" + p2.prix);
        Date date = new Date();
        Produit p3 = new Produit(11, "Sicam", "Tomate", 1.2f, date);
        System.out.println("Produit 3");
        System.out.println("id :" + p3.identifiant);
        System.out.println("marque :" + p3.marque);
        System.out.println("libelle :" + p3.libelle);
        System.out.println("prix :" + p3.prix);

        p1.prix = 0.7f;
        p1.marque = "Vitalait";
        p1.afficher();
        System.out.println("to String");
        System.out.println(p3.toString());
        System.out.println(p3);

        Magasin magasin1 = new Magasin(1, "Tunis ");
        Magasin magasin2 = new Magasin(2, "Ariena ");
        magasin1.ajouterProduit(p1);
        magasin1.ajouterProduit(p2);
        magasin1.afficherCaracteristiques();
        magasin2.afficherCaracteristiques();

    }
}
