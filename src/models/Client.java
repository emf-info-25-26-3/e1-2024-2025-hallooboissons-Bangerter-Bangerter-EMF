package models;

public class Client {
    private String nom;
    private String prenom;
    private String ville;

    public Client(String nom, String prenom, String ville) {
        this.nom = nom;
        this.prenom = prenom;
        this.ville = ville;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }
    public String toString(){
        String toString= "Client "+ nom.toUpperCase() +" "+prenom+" - "+ville;
        return toString;
    }
}
