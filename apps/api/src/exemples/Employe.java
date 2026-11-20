package exemples;

public abstract class Employe{
    private String nom;
    private String prenom;
    private int anneeEmbauche;

    public Employe(String nom , String prenom , int anneeEmbauche){
        this.nom = nom;
        this.prenom = prenom;
        this.anneeEmbauche = anneeEmbauche;
    }

    public String getNom(){
        return nom;
    }

    public String getPrenom(){
        return prenom;
    }

    public int getAnneeEmbauche(){
        return anneeEmbauche;
    }

    public abstract double calculerSalaire();

    @Override 
    public String toString(){
        return getClass().getSimpleName()+ getNom() + " " + getPrenom() + " " + " Année embauchment : " + getAnneeEmbauche();
    }
}