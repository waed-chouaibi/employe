public class vendeur extends Employe{
    private double tauxDeVente;
    public vendeur(int id, String nom, String adresse, int nbrHeures, double tauxDeVente) {
        this.tauxDeVente = tauxDeVente;
    }
    public double calculerSalaire() {
        return 450 * (tauxDeVente / 100);
    }
}
