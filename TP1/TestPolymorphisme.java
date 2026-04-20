import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class TestPolymorphisme {
    @Test
    void testAffichagePolymorphique() {
        List<Personne> liste = new ArrayList<>();
        liste.add(new Etudiant("Alice", 20, "ETU001", 15.0));
        liste.add(new Enseignant("Dr. Martin", 45, "Maths", 3000.0));

        for (Personne p : liste) {
            String details = p.afficherDetails();
            assertTrue(details.contains(p.getNom()));
        }
    }
}
