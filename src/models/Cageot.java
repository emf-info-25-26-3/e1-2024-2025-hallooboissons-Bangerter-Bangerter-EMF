package models;

public class Cageot {

    public static final int MAX_BOUTEILLES = 12;

    private String identifiant;
    private Bouteille[] bouteillesContenu;

    public Cageot(String identifiant) {
        this.identifiant = identifiant;
        this.bouteillesContenu = new Bouteille[MAX_BOUTEILLES];
    }

    public String getIdentifiant() {
        return identifiant;
    }

    public Bouteille[] getBouteillesContenu() {
        return bouteillesContenu;
    }
    // méthodes

    public boolean ajouterBouteille(Bouteille bouteille) {
        boolean resultatAjout = false;

        for (int i = 0; i < bouteillesContenu.length; i++) {
            if (bouteillesContenu[i] == null) {
                bouteillesContenu[i] = bouteille;
                resultatAjout = true;
                break;
            }
        }

        return resultatAjout;
    }

    public boolean retirerBouteille(Bouteille bouteille) {
        boolean resultatRetirer = false;

        for (int i = 0; i < bouteillesContenu.length; i++) {
            if (bouteillesContenu[i] == bouteille) {
                bouteillesContenu[i] = null;
                resultatRetirer = true;
                break;
            }
        }

        return resultatRetirer;
    }

    public int nombreBouteilles() {
        int nombreBouteilles = 0;
        for (int i = 0; i < bouteillesContenu.length; i++) {
            if (bouteillesContenu[i] != null) {
                nombreBouteilles++;
            }
        }
        return nombreBouteilles;
    }
    public int nombrePlaceRestante(){
        int nombrePlaceRestante=0;
        for(int i=0;i<bouteillesContenu.length;i++){
            if(bouteillesContenu[i]==null){
                nombrePlaceRestante++;
            }
        }
        return nombrePlaceRestante;
    }
    public String listeBouteille(){
        String listeBouteille="";

        for(int i=0;i<bouteillesContenu.length;i++){
            if (bouteillesContenu[i]!=null) {
                listeBouteille+=bouteillesContenu[i].getNom()+" ,";
            }
        }

        return listeBouteille;
    }
    public float prixTotal(){
        float prixTotal=0;
        for(int i=0;i<bouteillesContenu.length;i++){
            if(bouteillesContenu[i]!=null){
                prixTotal+=bouteillesContenu[i].getPrix();
            }
        }
        return prixTotal;
    }
}