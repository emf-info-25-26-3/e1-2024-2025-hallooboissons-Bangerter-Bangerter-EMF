package app;

import models.Bouteille;
import models.Cageot;
import models.Client;
import models.Commande;

public class Application {

    public static void main(String[] args) {

        Commande[] commandes = new Commande[10];

       

        Client client1 = new Client("Ducobu", "Jean", "Bulle");
        Commande commande1 = new Commande(client1);

   
        Cageot cageot1 = new Cageot("X83H4");
        for (int i = 0; i < 6; i++) {
            cageot1.ajouterBouteille(new Bouteille("Henniez rouge", 2.60f, 1.0f, 100f, true));
        }
        for (int i = 0; i < 6; i++) {
            cageot1.ajouterBouteille(new Bouteille("Henniez verte", 2.60f, 1.0f, 100f, true));
        }


        Cageot cageot2 = new Cageot("X83H5");
        for (int i = 0; i < 2; i++) {
            cageot2.ajouterBouteille(new Bouteille("Coca-Cola", 3.85f, 1.5f, 100f, false));
        }

        Cageot cageot3 = new Cageot("X83H6");
        cageot3.ajouterBouteille(new Bouteille("Pepsi", 3.55f, 1.5f, 100f, false));
        cageot3.ajouterBouteille(new Bouteille("Sinalco", 4.25f, 1.5f, 100f, false));

        commande1.ajouterCageot(cageot1);
        commande1.ajouterCageot(cageot2);
        commande1.ajouterCageot(cageot3);

        commandes[0] = commande1;

       

        Client client2 = new Client("Haroni", "Mac", "Fribourg");
        Commande commande2 = new Commande(client2);

   
        Cageot cageot4 = new Cageot("X83H7");
        cageot4.ajouterBouteille(new Bouteille("Henniez rouge", 2.60f, 1.0f, 100f, true));
        for (int i = 0; i < 2; i++) {
            cageot4.ajouterBouteille(new Bouteille("Coca-Cola", 3.85f, 1.5f, 100f, false));
        }

        commande2.ajouterCageot(cageot4);

        commandes[1] = commande2;



        for (int i = 0; i < commandes.length; i++) {
            afficherCommande(commandes[i]);
        }
    }

    public static void afficherCommande(Commande commande) {
        if (commande != null) {
            System.out.println("-------------------------------------------------------------");
            System.out.println("Commande pour le client : " + commande.getClient());

            Cageot[] cageotsALivrer = commande.listeCageotsALivrer();

            System.out.println("La commande contient " + cageotsALivrer.length + " cageots");
            System.out.println("Le prix total de la commande est de " + commande.prixTotal() + " Frs");
        }
    }
}