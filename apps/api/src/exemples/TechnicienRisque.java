package exemples;

public class TechnicienRisque extends Technicien implements PrimeRisque {

    public TechnicienRisque(String nom , String prenom , int anneeEmbauche , int unitesProduites){
        super(nom , prenom , anneeEmbauche , unitesProduites);
    }

    @Override
    public double calculerSalaire(){
        return super.calculerSalaire() + PrimeRisque.PRIME_MENSUELLE;
    }

    @Override 
    public String toString(){
        return super.toString() + " " + "Salaire " + calculerSalaire() + " $ ";
    }

}
