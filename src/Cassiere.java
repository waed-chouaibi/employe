public class Cassiere extends Employe{
    private int numcaisser;
    private double nbr_heure;

    public Cassiere (int id,String nom,String adresse ,int nbr_heure,int numcaisser){
        this.numcaisser=numcaisser;
    }
    public  double calcsalaire(){
        double salaire=nbr_heure*5;
        if(nbr_heure>180){
            salaire+=(nbr_heure-180)*5*0.15;
        }
        return salaire;
    }
}
