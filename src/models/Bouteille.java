package models;

public class Bouteille {
    private String nom;
    private float prix;
    private float contenance;
    private float remplissage;
    private boolean enVerre;

    public Bouteille(String nom, float prix, float contenance, float remplissage, boolean enVerre) {
        this.nom = nom;
        this.prix = prix;
        this.contenance = contenance;
        this.remplissage = 100;
        this.enVerre = enVerre;
    }

    public  String getNom() {
        return nom;
    }

    public float getPrix() {
        return prix;
    }

    public float getContenance() {
        return contenance;
    }

    public float getRemplissage() {
        return remplissage;
    }

    public  boolean isEnVerre() {
        return enVerre;
    }

    public String toString(){
        String bouteilleString= "Bouteille '"+nom+"' de "+ contenance+"L ";
        if(enVerre==true){
            bouteilleString+="en verre ";
        }
        else{
            bouteilleString+="en plastique ";
        }
        bouteilleString+="à "+prix+" Frs - ";
        if(remplissage==100){
            bouteilleString+="pleine";
        }
        else if(remplissage==0){
            bouteilleString+="vide";
        }
        else{bouteilleString+="entamée";

        }
        return bouteilleString;
    }
}
