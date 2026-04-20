import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Personne> personnes = new ArrayList<>();
        personnes.add(new Etudiant("Alice", 20, "ETU001", 15.5));
        personnes.add(new Enseignant("Dr. Martin", 45, "Informatique", 3500.0));

        for (Personne p : personnes) {
            System.out.println(p.afficherDetails());
        }
    }
}
