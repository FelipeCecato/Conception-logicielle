public class Cours {
    private String nomDuCours;
    private String professeur;

    public Cours(String nomDuCours, String professeur) {
        this.nomDuCours = nomDuCours;
        this.professeur = professeur;
    }

    public String getNomDuCours() {
        return nomDuCours;
    }

    public String getProfesseur() {
        return professeur;
    }

    @Override
    public String toString() {
        return nomDuCours + " (" + professeur + ")";
    }
}
