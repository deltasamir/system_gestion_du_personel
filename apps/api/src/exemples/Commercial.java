package exemples;

public class Commercial extends Employe{

    private double chiffreAffaire;

    public Commercial (String nom , String prenom , int anneeEmbauche , double chiffreAffaire){
        super(nom , prenom , anneeEmbauche);
        this.chiffreAffaire = chiffreAffaire;
    }

    

    public double getChiffreAffaire() {
        return chiffreAffaire;
    }

    @Override 
    public double calculerSalaire(){
        return ((0.2 * getChiffreAffaire()) + 400);
    }

    @Override 
    public String toString(){
        return super.toString() +
        " " + " Salaire : " + calculerSalaire() + " $ ";
    }

}
