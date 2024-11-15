public class Employe {
    private String nom;
    private String adresse;
    private String id;
    private int nbr_heure;
    public Employe(String nom,String adresse,int nbr_heure) {
        this.nom=nom;
        this.adresse=adresse;
        this.nbr_heure=nbr_heure;
    }

    public Employe() {

    }

    public void affiche(){
        System.out.println(" le nom est "+nom+"adresse est"+adresse+"nbr_heure"+nbr_heure);
    }

    public void setnom(String nom) {
        this.nom = nom;
    }
    public void setId(String id){
        this.id=id;
    }
    public void setadresse(String adresse) {
        this.adresse = adresse;
    }
    public void setnbr_heure(int nbr_heure) {
        this.nbr_heure = nbr_heure;
    }
    public String getNom(){
        return nom;
    }
    public String getAdresse(){
        return adresse;
    }
    public String getId(){
        return id;
    }
    public int getNbr_heure(){
        return nbr_heure;
    }

    public String toString(){
        return "Employé [ID=" + id + ", Nom=" + nom + ", Adresse=" + adresse + ", Heures=" + nbr_heure + "]";
    }

}
