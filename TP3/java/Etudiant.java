import java.util.ArrayList;
import java.util.List;

public class Etudiant extends Personne {
    private String numEtudiant;
    private double moyenne;
    private List<Cours> listeDeCours;
    private MentionStrategy strategy;
    private List<Observer> observateurs;

    public Etudiant(String nom, int age, String numEtudiant, double moyenne) {
        super(nom, age);
        this.numEtudiant = numEtudiant;
        this.moyenne = moyenne;
        this.listeDeCours = new ArrayList<>();
        this.observateurs = new ArrayList<>();
        this.strategy = new MentionExcel(); // Default strategy setup
    }

    public String getNumEtudiant() {
        return numEtudiant;
    }

    public double getMoyenne() {
        return moyenne;
    }

    // Comportement: Strategy
    public void setStrategy(MentionStrategy strategy) {
        this.strategy = strategy;
    }

    // Comportement: Observer (Subject methods)
    public void addObserver(Observer observer) {
        this.observateurs.add(observer);
    }

    public void removeObserver(Observer observer) {
        this.observateurs.remove(observer);
    }

    private void notifierObservers(String message) {
        for (Observer observer : observateurs) {
            observer.update(message);
        }
    }

    public void ajouterNote(double note) {
        this.moyenne = (this.moyenne + note) / 2.0;
        notifierObservers("L'étudiant " + getNom() + " a reçu une note. Nouvelle moyenne: " + this.moyenne);
    }

    public void ajouterCours(Cours cours) {
        this.listeDeCours.add(cours);
    }

    @Override
    public String afficherDetails() {
        String mention = (strategy != null) ? strategy.calculer(moyenne) : "N/A";
        return "Etudiant: " + getNom() + " | Age: " + getAge() + " | Num: " + numEtudiant + " | Moyenne: " + moyenne + " | Mention: " + mention;
    }
}
