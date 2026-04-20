import java.util.ArrayList;
import java.util.List;

public class Etudiant extends Personne {
    private String numEtudiant;
    private double moyenne;
    private List<Cours> listeCours = new ArrayList<>();

    public Etudiant(String nom, int age, String numEtudiant, double moyenne) {
        super(nom, age);
        this.numEtudiant = numEtudiant;
        setMoyenne(moyenne);
    }

    public String getNumEtudiant() { return numEtudiant; }
    
    public double getMoyenne() { return moyenne; }
    public void setMoyenne(double moyenne) {
        if (moyenne < 0 || moyenne > 20) throw new IllegalArgumentException();
        this.moyenne = moyenne;
    }

    public void ajouterCours(Cours c) {
        this.listeCours.add(c);
    }

    @Override
    public String afficherDetails() {
        return super.afficherDetails() + " (Etudiant ID: " + numEtudiant + ", Moyenne: " + moyenne + ")";
    }
}
