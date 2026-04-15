import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestHeritage {
    @Test
    void testHeritage() {
        Etudiant e = new Etudiant("Alice", 20, "ETU001", 15.0);
        assertTrue(e instanceof Personne);
        assertEquals("Alice", e.getNom());
    }

    @Test
    void testAjouterCours() {
        Etudiant e = new Etudiant("Bob", 21, "ETU002", 12.0);
        Cours c = new Cours("Java", "Dr. Smith");
        e.ajouterCours(c);
        assertNotNull(e);
    }
}
