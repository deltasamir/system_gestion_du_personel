package exemples;

public class Manager extends Employe{
    private double prime;

    public Manager (String nom ,String prenom , int anneeEmbauche, double prime){
        super(nom , prenom , anneeEmbauche );
        this.prime = prime;
    }

    public double getPrime(){
        return prime;
    }

    @Override
    public double calculerSalaire(){
        return getPrime() + 2500;
    }

    @Override 
    public String toString(){
        return super.toString() + " " + "salaire : " + calculerSalaire() + " $ "; 
    }
}
