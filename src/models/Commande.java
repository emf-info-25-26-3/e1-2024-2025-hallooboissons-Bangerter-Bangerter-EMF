package models;

public class Commande {

    public static final int MAX_CAGEOTS = 8;

    private Client client;
    private Cageot[] cageots;


    public Commande(Client client) {
        this.client = client;
        this.cageots = new Cageot[MAX_CAGEOTS];
    }


    public Client getClient() {
        return client;
    }

 
    public boolean ajouterCageot(Cageot cageot) {
        for (int i = 0; i < cageots.length; i++) {
            if (cageots[i] == null) {
                cageots[i] = cageot;
                return true;
            }
        }
        return false;
    }


    public boolean supprimerCageot(Cageot cageot) {
        for (int i = 0; i < cageots.length; i++) {
            if (cageots[i] == cageot) {
                cageots[i] = null;
                return true;
            }
        }
        return false; 
    }


    public void annuler() {
        for (int i = 0; i < cageots.length; i++) {
            cageots[i] = null;
        }
    }

    public Cageot[] listeCageotsALivrer() {
        int count = 0;
        for (int i = 0; i < cageots.length; i++) {
            if (cageots[i] != null) count++;
        }

        Cageot[] resultat = new Cageot[count];
        int j = 0;
        for (int i = 0; i < cageots.length; i++) {
            if (cageots[i] != null) {
                resultat[j] = cageots[i];
                j++;
            }
        }
        return resultat;
    }


    public float prixTotal() {
        float total = 0;
        for (int i = 0; i < cageots.length; i++) {
            if (cageots[i] != null) {
                total += cageots[i].prixTotal();
            }
        }
        return total;
    }
}