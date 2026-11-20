package exemples;

public class Technicien extends Employe{
    private int unitesProduites;

    public Technicien(String nom , String prenom , int anneeEmbauche , int unitesProduites){
        super(nom , prenom , anneeEmbauche );
        this.unitesProduites = unitesProduites;
    }

    public int getUnitesProduites(){
        return unitesProduites;
    }

    @Override 
    public double calculerSalaire(){
        return getUnitesProduites() * 5;
    }

    @Override 
    public String toString(){
        return super.toString() + " " + "Salaire " + calculerSalaire() + " $ ";
    }
}